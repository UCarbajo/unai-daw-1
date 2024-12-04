import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculadora {
	private static final JButton button = new JButton("New button");
	private static JTextField txtResultado;

	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		ventana.setBounds(100, 100, 400, 500);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().add(button, BorderLayout.CENTER);
		ventana.getContentPane().setLayout(null);
		
		int num1 = 0;
		int num2 = 0;
		int resultado = 0;

		txtResultado = new JTextField();
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setBounds(37, 29, 313, 37);
		ventana.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		JButton btnSeis = new JButton("6");
		btnSeis.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "6");
			}
		});
		btnSeis.setBounds(189, 203, 66, 37);
		ventana.getContentPane().add(btnSeis);

		JButton btnNueve = new JButton("9");
		btnNueve.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "9");
			}
		});
		btnNueve.setBounds(189, 153, 66, 37);
		ventana.getContentPane().add(btnNueve);

		JButton btnTres = new JButton("3");
		btnTres.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "3");
			}
		});
		btnTres.setBounds(189, 251, 66, 37);
		ventana.getContentPane().add(btnTres);

		JButton btnDos = new JButton("2");
		btnDos.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "2");
			}
		});
		btnDos.setBounds(113, 251, 66, 37);
		ventana.getContentPane().add(btnDos);

		JButton btnCinco = new JButton("5");
		btnCinco.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "5");
			}
		});
		btnCinco.setBounds(113, 203, 66, 37);
		ventana.getContentPane().add(btnCinco);

		JButton btnOcho = new JButton("8");
		btnOcho.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "8");
			}
		});
		btnOcho.setBounds(113, 153, 66, 37);
		ventana.getContentPane().add(btnOcho);

		JButton btnUno = new JButton("1");
		btnUno.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "1");
			}
		});
		btnUno.setBounds(37, 251, 66, 37);
		ventana.getContentPane().add(btnUno);

		JButton btnCuatro = new JButton("4");
		btnCuatro.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "4");
			}
		});
		btnCuatro.setBounds(37, 203, 66, 37);
		ventana.getContentPane().add(btnCuatro);

		JButton btnSiete = new JButton("7");
		btnSiete.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "7");
			}
		});
		btnSiete.setBounds(37, 153, 66, 37);
		ventana.getContentPane().add(btnSiete);

		JButton btnCero = new JButton("0");
		btnCero.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "0");
			}
		});

		btnCero.setBounds(113, 299, 66, 37);
		ventana.getContentPane().add(btnCero);

		JButton btnSumar = new JButton("+");
		btnSumar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSumar.setBounds(265, 251, 66, 37);
		ventana.getContentPane().add(btnSumar);

		JButton btnRestar = new JButton("-");
		btnRestar.setBounds(265, 203, 66, 37);
		ventana.getContentPane().add(btnRestar);

		JButton btnNewButton_2_3 = new JButton("C");
		btnNewButton_2_3.setBounds(37, 299, 66, 37);
		ventana.getContentPane().add(btnNewButton_2_3);

		JButton btnComa = new JButton(",");
		btnComa.setBounds(189, 299, 66, 37);
		ventana.getContentPane().add(btnComa);

		JButton btnResultado = new JButton("=");
		btnResultado.setBounds(265, 299, 66, 37);
		ventana.getContentPane().add(btnResultado);

		JButton btnMultiplicar = new JButton("X");
		btnMultiplicar.setBounds(265, 153, 66, 37);
		ventana.getContentPane().add(btnMultiplicar);

		JButton btnDividir = new JButton("/");
		btnDividir.setBounds(265, 105, 66, 37);
		ventana.getContentPane().add(btnDividir);

		ventana.setVisible(true);
	}
}
