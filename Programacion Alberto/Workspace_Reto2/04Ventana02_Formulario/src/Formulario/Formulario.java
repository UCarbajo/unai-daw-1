package Formulario;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class Formulario {
	private static JTextField textApellidoUno;
	private static JTextField textApellidoDos;

	public static void main(String[] args) {
		
		ButtonGroup grupoGenero = new ButtonGroup();
		
		JFrame formulario = new JFrame();
		formulario.setBounds(100,100, 400, 500);
		formulario.getContentPane().setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNombre = new JLabel("Introduce tu nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setBounds(27, 32, 152, 26);
		formulario.getContentPane().add(lblNombre);
		
		JTextField textNombre = new JTextField();
		textNombre.setBounds(27, 59, 152, 20);
		formulario.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblGenero = new JLabel("Selecciona tu genero");
		lblGenero.setHorizontalAlignment(SwingConstants.LEFT);
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGenero.setBounds(27, 147, 152, 26);
		formulario.getContentPane().add(lblGenero);
		
		JRadioButton rdbtnGeneroMasculino = new JRadioButton("Masculino");
		rdbtnGeneroMasculino.setFont(new Font("Dialog", Font.PLAIN, 12));
		grupoGenero.add(rdbtnGeneroMasculino);
		rdbtnGeneroMasculino.setBounds(27, 182, 86, 23);
		formulario.getContentPane().add(rdbtnGeneroMasculino);
		
		JRadioButton rdbtnGeneroFemenino = new JRadioButton("Femenino");
		rdbtnGeneroFemenino.setFont(new Font("Dialog", Font.PLAIN, 12));
		grupoGenero.add(rdbtnGeneroFemenino);
		rdbtnGeneroFemenino.setBounds(113, 182, 85, 23);
		formulario.getContentPane().add(rdbtnGeneroFemenino);
		
		JRadioButton rdbtnGeneroApache = new JRadioButton("Helicoptero Apache");
		rdbtnGeneroApache.setFont(new Font("Dialog", Font.PLAIN, 12));
		grupoGenero.add(rdbtnGeneroApache);
		rdbtnGeneroApache.setBounds(200, 182, 152, 23);
		formulario.getContentPane().add(rdbtnGeneroApache);
		
		JLabel lblGustos = new JLabel("\u00BFCuales son tus gustos?");
		lblGustos.setHorizontalAlignment(SwingConstants.LEFT);
		lblGustos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGustos.setBounds(27, 214, 325, 26);
		formulario.getContentPane().add(lblGustos);
		
		textApellidoUno = new JTextField();
		textApellidoUno.setColumns(10);
		textApellidoUno.setBounds(27, 114, 152, 20);
		formulario.getContentPane().add(textApellidoUno);
		
		JLabel lblApellidoUno = new JLabel("Apellido 1");
		lblApellidoUno.setHorizontalAlignment(SwingConstants.LEFT);
		lblApellidoUno.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellidoUno.setBounds(27, 92, 119, 19);
		formulario.getContentPane().add(lblApellidoUno);
		
		textApellidoDos = new JTextField();
		textApellidoDos.setEnabled(false);
		textApellidoDos.setColumns(10);
		textApellidoDos.setBounds(200, 114, 152, 20);
		formulario.getContentPane().add(textApellidoDos);
		
		JLabel lblApellidoDos = new JLabel("Apellido 2 (Opcional)");
		lblApellidoDos.setHorizontalAlignment(SwingConstants.LEFT);
		lblApellidoDos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellidoDos.setBounds(200, 92, 152, 19);
		formulario.getContentPane().add(lblApellidoDos);
		
		JButton btnEnviar = new JButton("ENVIAR");
		btnEnviar.setBounds(141, 412, 99, 38);
		formulario.getContentPane().add(btnEnviar);
		
		JCheckBox chckbxMusica = new JCheckBox("M\u00FAsica");
		chckbxMusica.setFont(new Font("Dialog", Font.PLAIN, 12));
		chckbxMusica.setBounds(27, 249, 94, 24);
		formulario.getContentPane().add(chckbxMusica);
		
		JCheckBox chckbxCine = new JCheckBox("Cine");
		chckbxCine.setFont(new Font("Dialog", Font.PLAIN, 12));
		chckbxCine.setBounds(27, 278, 94, 24);
		formulario.getContentPane().add(chckbxCine);
		
		JCheckBox chckbxComer = new JCheckBox("Comer");
		chckbxComer.setFont(new Font("Dialog", Font.PLAIN, 12));
		chckbxComer.setBounds(27, 307, 94, 24);
		formulario.getContentPane().add(chckbxComer);
		
		JCheckBox chckbxBailar = new JCheckBox("Bailar");
		chckbxBailar.setFont(new Font("Dialog", Font.PLAIN, 12));
		chckbxBailar.setBounds(27, 336, 94, 24);
		formulario.getContentPane().add(chckbxBailar);
		
		JCheckBox chckbxVideojuegos = new JCheckBox("Videojuegos");
		chckbxVideojuegos.setFont(new Font("Dialog", Font.PLAIN, 12));
		chckbxVideojuegos.setBounds(142, 249, 99, 24);
		formulario.getContentPane().add(chckbxVideojuegos);
		
		JCheckBox chckbxLeer = new JCheckBox("Leer");
		chckbxLeer.setFont(new Font("Dialog", Font.PLAIN, 12));
		chckbxLeer.setBounds(142, 278, 98, 24);
		formulario.getContentPane().add(chckbxLeer);
		
		JCheckBox chckbxCantar = new JCheckBox("Cantar");
		chckbxCantar.setFont(new Font("Dialog", Font.PLAIN, 12));
		chckbxCantar.setBounds(142, 307, 98, 24);
		formulario.getContentPane().add(chckbxCantar);
		
		JCheckBox chckbxDormir = new JCheckBox("Dormir");
		chckbxDormir.setFont(new Font("Dialog", Font.PLAIN, 12));
		chckbxDormir.setBounds(142, 336, 99, 24);
		formulario.getContentPane().add(chckbxDormir);
		
		formulario.setVisible(true);

	}
}
