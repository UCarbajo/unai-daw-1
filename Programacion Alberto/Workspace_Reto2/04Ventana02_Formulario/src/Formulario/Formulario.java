package Formulario;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Formulario {
	private static JTextField textNombre;
	private static JRadioButton rdbtnGeneroFemenino;

	public static void main(String[] args) {
		
		ButtonGroup grupoGenero = new ButtonGroup();
		
		JFrame formulario = new JFrame();
		formulario.setBounds(100,100, 400, 500);
		formulario.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Introduce tu nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setBounds(27, 32, 152, 26);
		formulario.getContentPane().add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(27, 59, 171, 20);
		formulario.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblGenero = new JLabel("Selecciona tu genero");
		lblGenero.setHorizontalAlignment(SwingConstants.LEFT);
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGenero.setBounds(27, 90, 152, 26);
		formulario.getContentPane().add(lblGenero);
		
		JRadioButton rdbtnGeneroMasculino = new JRadioButton("Masculino");
		grupoGenero.add(rdbtnGeneroMasculino);
		rdbtnGeneroMasculino.setBounds(27, 123, 86, 23);
		formulario.getContentPane().add(rdbtnGeneroMasculino);
		
		JRadioButton rdbtnGeneroFemenino = new JRadioButton("Femenino");
		grupoGenero.add(rdbtnGeneroFemenino);
		rdbtnGeneroFemenino.setBounds(113, 123, 85, 23);
		formulario.getContentPane().add(rdbtnGeneroFemenino);
		
		JRadioButton rdbtnGeneroApache = new JRadioButton("Helicoptero Apache");
		grupoGenero.add(rdbtnGeneroApache);
		rdbtnGeneroApache.setBounds(200, 123, 119, 23);
		formulario.getContentPane().add(rdbtnGeneroApache);
		
		JLabel lblGustos = new JLabel("\u00BFCuales son tus gustos?");
		lblGustos.setHorizontalAlignment(SwingConstants.LEFT);
		lblGustos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGustos.setBounds(27, 153, 152, 26);
		formulario.getContentPane().add(lblGustos);
		
		
		
	
	
		
		
		
		
		formulario.setVisible(true);

	}
}
