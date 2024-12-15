package colegio.ui.estudiante;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import colegio.model.Estudiante;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListadoEstudiante extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private DefaultTableModel modelo;

    public ListadoEstudiante(ArrayList<Estudiante> estudiantes) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 521);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        String[] columnas = {"DNI", "Nombre", "Apellidos", "Email", "Género", "Curso", "Necesidades Especiales", "Términos"};

        modelo = new DefaultTableModel(columnas, 0); // Modelo con columnas, sin filas
        table = new JTable(modelo);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 53, 414, 376);
        contentPane.add(scrollPane);

        JButton btnActualizar = new JButton("Actualizar");   
        btnActualizar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		actualizarTabla(estudiantes);
        	}
        });
        btnActualizar.setBounds(173, 448, 89, 23);
        contentPane.add(btnActualizar);
        
    }

    public void actualizarTabla(ArrayList<Estudiante> estudiantes) {
        modelo.setRowCount(0);
        for (Estudiante estudiante : estudiantes) {
            modelo.addRow(new Object[]{
                estudiante.getDni(),
                estudiante.getNombre(),
                estudiante.getApellidos(),
                estudiante.getEmail(),
                estudiante.getGenero(),
                estudiante.getCurso(),
                estudiante.getNecesidadesEspeciales(),
                estudiante.isTerminosAceptados()
            });
        }
    }
}