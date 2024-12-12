package UI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Constructor_Personajes.GestorEnemigos;
import Constructor_Personajes.GestorPersonajes;
import Constructor_Personajes.Personaje;
import Enum_listaClases.Clases;
import Partida.JugarPartida;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class EleccionClaseUI extends JFrame {

	public static void main(String[] args) {
		JFrame claseUI = new JFrame("Eleccion de clase");
		claseUI.getContentPane().setLayout(null);
		claseUI.setBounds(150, 150,350, 225);
		
		JLabel lblTitulo = new JLabel("ELIGE TU CLASE");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 11, 314, 32);
		claseUI.getContentPane().add(lblTitulo);
		
		JComboBox<Enum> comboBox = new JComboBox<Enum>();
		comboBox.setModel(new DefaultComboBoxModel<Enum>(Clases.values()));
		comboBox.setBounds(114, 64, 102, 22);
		claseUI.getContentPane().add(comboBox);
		
		JButton btnPelear = new JButton("PELEAR");
		btnPelear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPelear.setBounds(114, 143, 102, 32);
		claseUI.getContentPane().add(btnPelear);
		claseUI.setVisible(true);
		btnPelear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JugarPartida.empezarPartida(comboBox);
				
			}

		});
	}
}
