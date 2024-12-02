import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main {

	public static void main(String[] args) {
		
		JFrame ventana = new JFrame();
		ventana.setBounds(50, 50, 300, 400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);
		
		JLabel etiqueta = new JLabel("0", SwingConstants.CENTER);
		etiqueta.setBounds(50, 50, 200, 30);
		ventana.add(etiqueta);
		
		JButton botonRestar = new JButton("-1");
		JButton botonSumar = new JButton("+1");
		
		botonRestar.setBounds(85,90, 100, 30);
		botonSumar.setBounds(85, 140, 100, 30);
		
		ventana.add(botonRestar);
		ventana.add(botonSumar);

		ventana.setVisible(true);
		
		botonRestar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int numero = Integer.parseInt(etiqueta.getText());
				numero--;
				etiqueta.setText(String.valueOf(numero));
				
			}
		});
		
		botonSumar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int numero = Integer.parseInt(etiqueta.getText());
				numero++;
				etiqueta.setText(String.valueOf(numero));
				
			}
		});
	}

}
