import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Suma {

	public static void main(String[] args) {
		
		JFrame ventana = new JFrame("Ventana de pruebas");
		
		ventana.setBounds(50, 50, 400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);
		
		JLabel lblNumero1 = new JLabel("Numero 1");
		lblNumero1.setBounds(50, 50, 200, 30);
		ventana.add(lblNumero1);
		
		JTextField txtNumero1 = new JTextField();
		txtNumero1.setBounds(120, 50, 100, 30);
		ventana.add(txtNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero 2");
		lblNumero2.setBounds(50, 80, 200, 30);
		ventana.add(lblNumero2);
		
		JTextField txtNumero2 = new JTextField();
		txtNumero2.setBounds(120, 80, 100, 30);
		ventana.add(txtNumero2);
		
		JButton btbSumar = new JButton("Calcular");
		btbSumar.setBounds(50, 120, 180, 30);
		ventana.add(btbSumar);
		
		JLabel lblResultado = new JLabel();
		lblResultado.setBounds(50, 160, 200, 30);
		ventana.add(lblResultado);
		
		btbSumar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txtNumero1.getText());
				int num2 = Integer.parseInt(txtNumero2.getText());
				
				lblResultado.setText(String.valueOf("Resultado: " + (num1+num2)));
				
			}
		});
		
		ventana.setVisible(true);
	}

}
