import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main {

	public static void main(String[] args) {
		
		JFrame ventana = new JFrame("Ventana de pruebas");
	
		ventana.setBounds(50, 50, 400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);

		JLabel etiqueta = new JLabel("Esto es mi primera ventana");
		etiqueta.setBounds(50, 50, 200, 30);
		ventana.add(etiqueta);
		
		JButton boton = new JButton("Cambiar texto");
		boton.setBounds(50, 100, 150, 30);
		ventana.add(boton);
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText("El texto ha cambiado");
				
			}
		});
		
		ventana.setVisible(true);
	}

}
