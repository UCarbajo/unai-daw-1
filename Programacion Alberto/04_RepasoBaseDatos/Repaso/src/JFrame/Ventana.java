package JFrame;

import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import AccesoBD.TiendaBD;
import Producto.Mandarinas;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTable table;
	private ArrayList<Mandarinas> listaMandarinas;

	public Ventana() throws SQLException, ClassNotFoundException {
		setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setForeground(new Color(255, 255, 128));
		scrollPane.setBounds(10, 183, 516, 270);
		contentPane.add(scrollPane);
		
		String[] columnas = {"marca" , "ciudad", "precio"};
		
		Object[][] matriz = crearTabla(columnas);
		
		DefaultTableModel modelo = new DefaultTableModel (matriz, columnas);
		
		table = new JTable(modelo);
		scrollPane.setViewportView(table);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int posicion = table.getSelectedRow();
				Mandarinas mandarina = new Mandarinas((String.valueOf(matriz[posicion][0])), (String.valueOf(matriz[posicion][1])), (Double.valueOf(matriz[posicion][2].toString())));
				try {
					TiendaBD acceso = new TiendaBD();
					acceso.eliminarMandarinas(mandarina);
					listaMandarinas = acceso.getMandarinas();
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				} catch (ArrayIndexOutOfBoundsException e1) {
					e1.printStackTrace();
				}
				modelo.setRowCount(0);
				for(Mandarinas mandarina1: listaMandarinas) {
					Object[] fila = {mandarina1.getMarca(), mandarina1.getPais(), mandarina1.getPrecio()};
					modelo.addRow(fila);
				}
			}
		});
		btnEliminar.setBounds(10, 152, 85, 21);
		contentPane.add(btnEliminar);
		
	}

	private Object[][] crearTabla(String[] columnas) throws ClassNotFoundException, SQLException {
		TiendaBD acceso = new TiendaBD();
		listaMandarinas = acceso.getMandarinas();
		
		Object[][] matriz = new Object[listaMandarinas.size()][columnas.length];
		
		for(int i = 0; i < listaMandarinas.size(); i++) {
			Mandarinas mandarina = listaMandarinas.get(i);
			
			matriz[i][0] = mandarina.getMarca();
			matriz[i][1] = mandarina.getPais();
			matriz[i][2] = mandarina.getPrecio();
		}
		
		return matriz;
	}
}
