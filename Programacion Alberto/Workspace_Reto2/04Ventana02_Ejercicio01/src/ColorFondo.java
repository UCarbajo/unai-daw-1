import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorFondo {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Ventana de pruebas");

		ventana.setBounds(50, 50, 400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);
		
		JButton btbRojo = new JButton("Calcular");
		btbRojo.setBounds(50, 120, 100, 30);
		ventana.add(btbRojo);
		
		JButton btbVerde = new JButton("Calcular");
		btbVerde.setBounds(150, 120, 100, 30);
		ventana.add(btbVerde);
		
		JButton btbAzul = new JButton("Calcular");
		btbAzul.setBounds(250, 120, 100, 30);
		ventana.add(btbAzul);
		
		btbRojo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana.getContentPane().setBackground(Color.red);
				
			}
		});
		
		btbVerde.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana.getContentPane().setBackground(Color.green);
				
			}
		});
		
		btbAzul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana.getContentPane().setBackground(Color.blue);
				
			}
		});
		
		ventana.setVisible(true);

	}

}
