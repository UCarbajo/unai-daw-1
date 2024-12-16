package colegio.ui.estudiante;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import colegio.model.Estudiante;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ListadoEstudiante extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel modelo;
	private JTextField textDNI;
	private JTextField textField;
	private JTextField textNombre;
	private JTextField textField_2;

	public ListadoEstudiante(ArrayList<Estudiante> estudiantes) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDNI = new JLabel("DNI:");
		lblDNI.setBounds(10, 14, 46, 14);
		contentPane.add(lblDNI);

		textDNI = new JTextField();
		textDNI.setBounds(60, 11, 140, 20);
		contentPane.add(textDNI);
		textDNI.setColumns(10);

		String[] columnas = { "DNI", "Nombre", "Apellidos", "Email", "Género", "Curso", "Necesidades Especiales",
				"Términos" };

		modelo = new DefaultTableModel(columnas, 0); // Modelo con columnas, sin filas
		table = new JTable(modelo);

		ListSelectionModel modeloSeleccion = table.getSelectionModel();
		modeloSeleccion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 132, 414, 297);
		contentPane.add(scrollPane);

		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarTabla(estudiantes);
			}
		});

		modeloSeleccion.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				int filaSeleccionada = table.getSelectedRow();

				textDNI.setText(table.getValueAt(filaSeleccionada, 0).toString());
				textDNI.setText(table.getValueAt(filaSeleccionada, 1).toString());

			}
		});
		
		modeloSeleccion.addListSelectionListener((ListSelectionListener) new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});

		btnActualizar.setBounds(173, 448, 89, 23);
		contentPane.add(btnActualizar);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 42, 46, 14);
		contentPane.add(lblApellido);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(60, 39, 140, 20);
		contentPane.add(textField);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(228, 14, 46, 14);
		contentPane.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(284, 11, 140, 20);
		contentPane.add(textNombre);
		
		JLabel lblNombre_1_2 = new JLabel("Nombre:");
		lblNombre_1_2.setBounds(228, 42, 46, 14);
		contentPane.add(lblNombre_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(284, 39, 140, 20);
		contentPane.add(textField_2);

	}

	public void actualizarTabla(ArrayList<Estudiante> estudiantes) {
		modelo.setRowCount(0);
		for (Estudiante estudiante : estudiantes) {
			modelo.addRow(new Object[] { estudiante.getDni(), estudiante.getNombre(), estudiante.getApellidos(),
					estudiante.getEmail(), estudiante.getGenero(), estudiante.getCurso(),
					estudiante.getNecesidadesEspeciales(), estudiante.isTerminosAceptados() });
		}
	}
}