package Ventana;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Coches.Coches;
import ConcesionarioBD.ConcesionarioBD;
import Enum.Marcas;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private ArrayList<Coches> listaCoches;
	private JTextField textMatriculaBuscar;
	private JTextField textMatricula;
	private JTextField textMarca;
	private JTextField textModelo;
	private JTextField textPrecio;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 225, 507, 258);
		contentPane.add(scrollPane);

		String[] columnas = { "matricula", "marca", "modelo", "precio" };

		listaCoches = getCoches();

		Object[][] linea = new Object[listaCoches.size()][columnas.length];
		for (int i = 0; i < listaCoches.size(); i++) {
			Coches coche = listaCoches.get(i);
			linea[i][0] = coche.getMatricula();
			linea[i][1] = coche.getMarca();
			linea[i][2] = coche.getModelo();
			linea[i][3] = coche.getPrecio();
		}

		DefaultTableModel modelo = new DefaultTableModel(linea, columnas) {
			@Override
			 public boolean isCellEditable(int row, int column) {
		        return false;
		    }
			
		};

		table = new JTable(modelo);
		scrollPane.setViewportView(table);

		JLabel lblMatriculaBuscar = new JLabel("Matr\u00EDcula");
		lblMatriculaBuscar.setBounds(10, 10, 108, 13);
		contentPane.add(lblMatriculaBuscar);

		textMatriculaBuscar = new JTextField();
		textMatriculaBuscar.setBounds(10, 22, 108, 19);
		contentPane.add(textMatriculaBuscar);
		textMatriculaBuscar.setColumns(10);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coches coche = new Coches(textMatriculaBuscar.getText(), null, null, null);
				listaCoches = buscarCoches(coche);
				modelo.setRowCount(0);

				for (Coches nuevoCoche : listaCoches) {
					Object[] linea = { nuevoCoche.getMatricula(), nuevoCoche.getMarca(), nuevoCoche.getModelo(),
							nuevoCoche.getPrecio() };
					modelo.addRow(linea);
				}
			}
		});
		btnBuscar.setBounds(247, 21, 85, 21);
		contentPane.add(btnBuscar);

		JLabel lblMatricula = new JLabel("Matr\u00EDcula");
		lblMatricula.setBounds(10, 51, 108, 13);
		contentPane.add(lblMatricula);

		textMatricula = new JTextField();
		textMatricula.setColumns(10);
		textMatricula.setBounds(10, 63, 108, 19);
		contentPane.add(textMatricula);

		textMarca = new JTextField();
		textMarca.setColumns(10);
		textMarca.setBounds(128, 63, 108, 19);
		contentPane.add(textMarca);

		textModelo = new JTextField();
		textModelo.setColumns(10);
		textModelo.setBounds(246, 63, 108, 19);
		contentPane.add(textModelo);

		textPrecio = new JTextField();
		textPrecio.setColumns(10);
		textPrecio.setBounds(364, 63, 108, 19);
		contentPane.add(textPrecio);

		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(128, 52, 108, 13);
		contentPane.add(lblMarca);

		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(246, 51, 108, 13);
		contentPane.add(lblModelo);

		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(364, 51, 108, 13);
		contentPane.add(lblPrecio);

		JButton btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String matricula = textMatricula.getText();
				String marca = textMarca.getText();
				String modeloCoche = textModelo.getText();
				Double precio = Double.valueOf(textPrecio.getText());

				Coches coche = new Coches(matricula, marca, modeloCoche, precio);
				listaCoches = anadirCoches(coche);
				
				modelo.setRowCount(0);
				for (Coches nuevoCoche : listaCoches) {
					Object[] linea = { nuevoCoche.getMatricula(), nuevoCoche.getMarca(), nuevoCoche.getModelo(),
							nuevoCoche.getPrecio() };
					modelo.addRow(linea);
				}

			}
		});
		btnAnadir.setBounds(10, 92, 85, 21);
		contentPane.add(btnAnadir);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = table.getSelectedRow();
				Coches coche = new Coches(modelo.getValueAt(fila, 0).toString(), modelo.getValueAt(fila, 1).toString(), modelo.getValueAt(fila, 2).toString(), Double.valueOf(modelo.getValueAt(fila, 3).toString()));
				eliminarCoches(coche);
				listaCoches = getCoches();
				
				modelo.setRowCount(0);
				for (Coches nuevoCoche : listaCoches) {
					Object[] linea = { nuevoCoche.getMatricula(), nuevoCoche.getMarca(), nuevoCoche.getModelo(),
							nuevoCoche.getPrecio() };
					modelo.addRow(linea);
				}
			}
		});
		btnEliminar.setBounds(432, 194, 85, 21);
		contentPane.add(btnEliminar);
		
		JComboBox<Enum> comboBox = new JComboBox<Enum>();
		comboBox.setModel(new DefaultComboBoxModel<Enum>(Marcas.values()));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(129, 21, 108, 21);
		contentPane.add(comboBox);
	}

	private ArrayList<Coches> getCoches() {

		try {
			ConcesionarioBD acceso = new ConcesionarioBD();
			listaCoches = acceso.getCoches();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaCoches;
	}

	private ArrayList<Coches> buscarCoches(Coches coche) {

		ConcesionarioBD acceso = new ConcesionarioBD();
		listaCoches = acceso.buscarCoches(coche);
		return listaCoches;
	}

	private ArrayList<Coches> anadirCoches(Coches coche) {
		ConcesionarioBD acceso = new ConcesionarioBD();
		acceso.anadirCoches(coche);
		try {
			listaCoches = acceso.getCoches();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return listaCoches;

	}
	private ArrayList<Coches> eliminarCoches(Coches coche) {
		ConcesionarioBD acceso = new ConcesionarioBD();
		acceso.eliminarCoches(coche);
		try {
			listaCoches = acceso.getCoches();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return listaCoches;

	}
}
