package colegio.ui.estudiante;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.MouseInputAdapter;
import javax.swing.table.DefaultTableModel;
import colegio.model.Estudiante;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.format.DateTimeFormatter;

public class ListadoEstudiante extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel modelo;
	private JTextField textDNI;
	private JTextField textApellido;
	private JTextField textNombre;
	private JTextField textEmail;
	private JTextField textGenero;
	private JTextField textCurso;

	public ListadoEstudiante(ArrayList<Estudiante> estudiantes, AltaEstudiante window) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 100, 450, 521);
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

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 42, 46, 14);
		contentPane.add(lblApellido);

		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(60, 39, 140, 20);
		contentPane.add(textApellido);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(228, 14, 46, 14);
		contentPane.add(lblNombre);

		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(284, 11, 140, 20);
		contentPane.add(textNombre);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(228, 42, 46, 14);
		contentPane.add(lblEmail);

		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(284, 39, 140, 20);
		contentPane.add(textEmail);

		JLabel lblGenero = new JLabel("G\u00E9nero:");
		lblGenero.setBounds(10, 70, 46, 14);
		contentPane.add(lblGenero);

		textGenero = new JTextField();
		textGenero.setColumns(10);
		textGenero.setBounds(60, 67, 140, 20);
		contentPane.add(textGenero);

		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(228, 70, 46, 14);
		contentPane.add(lblCurso);

		textCurso = new JTextField();
		textCurso.setColumns(10);
		textCurso.setBounds(284, 67, 140, 20);
		contentPane.add(textCurso);

		String[] columnas = { "DNI", "Nombre", "Apellidos", "Fecha nacimiento", "Email", "Género", "Curso",
				"Necesidades Especiales", "Términos" };

		modelo = new DefaultTableModel(columnas, 0) {

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

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
				textNombre.setText(table.getValueAt(filaSeleccionada, 1).toString());
				textApellido.setText(table.getValueAt(filaSeleccionada, 2).toString());
				textEmail.setText(table.getValueAt(filaSeleccionada, 3).toString());
				textGenero.setText(table.getValueAt(filaSeleccionada, 4).toString());
				textCurso.setText(table.getValueAt(filaSeleccionada, 5).toString());

			}
		});

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					int filaSeleccionada = table.getSelectedRow();

					window.setTextDni(table.getValueAt(filaSeleccionada, 0).toString());
					window.setTextNombre(table.getValueAt(filaSeleccionada, 1).toString());
					window.setTextApellidos(table.getValueAt(filaSeleccionada, 2).toString());
					window.setTextFechaNacimiento(table.getValueAt(filaSeleccionada, 3).toString());
					window.setTextEmail(table.getValueAt(filaSeleccionada, 4).toString());
					String genero = table.getValueAt(filaSeleccionada, 5).toString();
					switch (genero) {
					case "0":
						window.setEnabledRdbtnFemenino();
						break;
					case "1":
						window.setEnabledRdbtnMasculino();
						break;
					case "2":
						window.setEnabledRdbtnOtro();
						break;
					}

				}

			}
		});

		btnActualizar.setBounds(173, 448, 89, 23);
		contentPane.add(btnActualizar);
	}

	public void actualizarTabla(ArrayList<Estudiante> estudiantes) {
		modelo.setRowCount(0);
		for (Estudiante estudiante : estudiantes) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String fechaNac = estudiante.getFechaNacimiento().format(formatter);
			String genero = "";

			switch (estudiante.getGenero()) {
			case 0 -> {
				genero = "Femenino";
			}
			case 1 -> {
				genero = "Masculino";
			}
			case 2 -> {
				genero = "Otro";
			}
			}
			modelo.addRow(new Object[] { estudiante.getDni(), estudiante.getNombre(), estudiante.getApellidos(),
					fechaNac, estudiante.getEmail(), genero,
					estudiante.getCurso(), estudiante.getNecesidadesEspeciales(), estudiante.isTerminosAceptados() });
		}
	}
}