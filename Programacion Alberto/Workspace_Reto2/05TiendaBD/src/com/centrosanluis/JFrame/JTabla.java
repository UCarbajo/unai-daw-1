package com.centrosanluis.JFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.centrosanluis.AccesoBD.AccesoBDProducto;
import com.centrosanluis.tiendaBD.dto.ProductoDTO;
import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class JTabla extends JFrame {

	private JPanel contentPane;
	private JTable tableProducto;
	private JScrollPane scrollPane;
	ArrayList<ProductoDTO> coches = new ArrayList<>();
	
	public JTabla() {
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		String[] columnas = {"marca", "modelo", "color", "precio"};
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		
		
		try {
			AccesoBDProducto acceso = new AccesoBDProducto();
			int id = 1;
			ProductoDTO coche;
			while (( coche = acceso.getCoche(id)) != null) {
		        coches.add(coche);
		        id++;
		    }
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for(ProductoDTO coche : coches) {
			modelo.addRow(new Object[] {coche.getMarca(), coche.getModelo(), coche.getColor(), coche.getPrecio()}
			);
		}
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 247, 229);
		layeredPane.add(scrollPane);
		
		tableProducto = new JTable(modelo);
		scrollPane.setViewportView(tableProducto);
	}
}
