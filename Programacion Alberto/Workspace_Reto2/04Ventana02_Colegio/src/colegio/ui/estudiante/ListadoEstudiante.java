package colegio.ui.estudiante;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;

import colegio.model.Estudiante;
import javax.swing.JTextPane;
import javax.swing.JTable;

public class ListadoEstudiante extends JFrame{
	
	private JPanel contentPane;
	private JTable table;

	public ListadoEstudiante(ArrayList<Estudiante> estudiantes) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 116, 380, 112);
		contentPane.add(table);
	}
}
