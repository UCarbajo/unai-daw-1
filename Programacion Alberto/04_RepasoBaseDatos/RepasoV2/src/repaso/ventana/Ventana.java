package repaso.ventana;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import repaso.BD.ConcesionarioBD;
import repaso.BD.AccesoBD;
import repaso.concesionario.Coches;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textNombre;
	ArrayList<Coches> listaCoches;
	private JTextField textMatricula;
	private JTextField textMarca;
	private JTextField textModelo;
	private JTextField textPrecio;
	private JButton btnAñadir;
	
	public Ventana() {
		setTitle("Concesionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 666, 272);
		contentPane.add(scrollPane);
		
		String[] columnas = {"Matrícula", "Marca" , "Modelo" , "Precio"};
		listaCoches = getCoches();
		
		Object[][] fila = new Object[listaCoches.size()][columnas.length];
		for(int i = 0; i < listaCoches.size(); i++) {
			Coches coche = listaCoches.get(i);
			fila[i][0] = coche.getMatricula();
			fila[i][1] = coche.getMarca();
			fila[i][2] = coche.getModelo();
			fila[i][3] = coche.getPrecio();
		}
		
		DefaultTableModel modelo = new  DefaultTableModel(fila, columnas);
		table = new JTable(modelo);
		scrollPane.setViewportView(table);
		
		textNombre = new JTextField();
		textNombre.setBounds(10, 292, 96, 19);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textMatricula = new JTextField();
		textMatricula.setBounds(10, 348, 96, 19);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		textMarca = new JTextField();
		textMarca.setBounds(116, 348, 96, 19);
		contentPane.add(textMarca);
		textMarca.setColumns(10);
		
		textModelo = new JTextField();
		textModelo.setBounds(222, 348, 96, 19);
		contentPane.add(textModelo);
		textModelo.setColumns(10);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(328, 348, 96, 19);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(10, 332, 45, 13);
		contentPane.add(lblMatricula);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(116, 332, 45, 13);
		contentPane.add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(222, 332, 45, 13);
		contentPane.add(lblModelo);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(328, 332, 45, 13);
		contentPane.add(lblPrecio);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaCoches = resultadoBusqueda(textNombre.getText());
				modelo.setRowCount(0);
				
				for(Coches coche: listaCoches) {
					Object[] fila = {coche.getMatricula(), coche.getMarca(), coche.getModelo(), coche.getPrecio() };
					modelo.addRow(fila);
				}
			}
		});
		btnBuscar.setBounds(116, 292, 85, 21);
		contentPane.add(btnBuscar);
		
		btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String matricula = textMatricula.getText();
			String marca = textMarca.getText();
			String modeloCoche = textModelo.getText();
			Double precio = Double.valueOf(textPrecio.getText());
			
			listaCoches = insertCoche(matricula, marca, modeloCoche, precio);
			modelo.setRowCount(0);
			
			for(Coches coche: listaCoches) {
				Object[] fila = {coche.getMatricula(), coche.getMarca(), coche.getModelo(), coche.getPrecio() };
				modelo.addRow(fila);
			}
			}
		});
		btnAñadir.setBounds(434, 347, 85, 21);
		contentPane.add(btnAñadir);
	}
	
	private ArrayList<Coches> getCoches(){
		ArrayList<Coches> resultado = new ArrayList<Coches>();
		
		ConcesionarioBD acceso = new ConcesionarioBD(AccesoBD.DRIVER_MYSQL, "Concesionario", "root", "1234");
		resultado = acceso.getCoches();
		
		return resultado;
	}
	
	private ArrayList<Coches> resultadoBusqueda(String nombre) {
		ConcesionarioBD acceso = new ConcesionarioBD(AccesoBD.DRIVER_MYSQL, "Concesionario", "root", "1234");
		ArrayList<Coches> listaCoches = acceso.resultadoBusqueda(nombre);
		
		return listaCoches;
		
	}
	private ArrayList<Coches> insertCoche(String matricula, String marca, String modelo, Double precio) {
		ConcesionarioBD acceso = new ConcesionarioBD(AccesoBD.DRIVER_MYSQL, "Concesionario", "root", "1234");
		acceso.insertCoche(matricula, marca, modelo, precio);
		listaCoches = acceso.getCoches();
		return listaCoches;
		
	}
	
}
