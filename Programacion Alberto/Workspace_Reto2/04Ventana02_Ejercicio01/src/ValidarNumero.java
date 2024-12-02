import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ValidarNumero {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Ventana de pruebas");

		ventana.setBounds(50, 50, 400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);
		
		JLabel lblNumero = new JLabel("Escribir numero");
		lblNumero.setBounds(50,50,100,20);
		ventana.add(lblNumero);
		
		JTextArea txtNumero = new JTextArea();
		txtNumero.setBounds(150, 50, 100, 20);
		ventana.add(txtNumero);
		
		JButton btnValidar = new JButton("Validar numero");
		btnValidar.setBounds(80, 100, 150, 20);
		ventana.add(btnValidar);
		
		JLabel lblValidar = new JLabel();
		lblValidar.setBounds(50, 200, 100, 29);
		ventana.add(lblValidar);
		
		btnValidar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int numero = Integer.parseInt(txtNumero.getText());
					lblValidar.setText("Es un numero");
				}catch (NumberFormatException e1) {
			        lblValidar.setText("No es un numero");;
			    }
				
				
			}
		});
		
		ventana.setVisible(true);

	}

}
