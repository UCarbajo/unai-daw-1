package App;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import Metodos.metodosCalculadora;
import java.awt.Color;
import java.awt.Font;

public class CalculadoraFinal {
	
	static int resultado = metodosCalculadora.getResultado();

	public static void main(String[] args) {

		JFrame ventana = new JFrame("Calculadora");
		ventana.getContentPane().setForeground(new Color(0, 0, 0));
		ventana.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		ventana.getContentPane().setBackground(new Color(51, 51, 51));
		ventana.setBounds(100, 100, 400, 500);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);

		JTextField txtResultado = new JTextField();
		txtResultado.setFont(new Font("Arial", Font.PLAIN, 20));
		txtResultado.setText("0");
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setBounds(37, 65, 313, 37);
		ventana.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		JButton btnUno = new JButton("1");
		btnUno.setForeground(new Color(255, 255, 255));
		btnUno.setBackground(new Color(102, 102, 102));
		btnUno.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnUno.setBounds(37, 298, 66, 37);
		ventana.getContentPane().add(btnUno);
		btnUno.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				metodosCalculadora.comprobarUsoBotonNumero(txtResultado);
				metodosCalculadora.setUsoBotonIgual(false);
				txtResultado.setText(txtResultado.getText() + "1");
			}
		});

		JButton btnDos = new JButton("2");
		btnDos.setForeground(new Color(255, 255, 255));
		btnDos.setBackground(new Color(102, 102, 102));
		btnDos.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnDos.setBounds(113, 298, 66, 37);
		ventana.getContentPane().add(btnDos);
		btnDos.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				metodosCalculadora.comprobarUsoBotonNumero(txtResultado);
				metodosCalculadora.setUsoBotonIgual(false);
				txtResultado.setText(txtResultado.getText() + "2");
			}
		});

		JButton btnTres = new JButton("3");
		btnTres.setForeground(new Color(255, 255, 255));
		btnTres.setBackground(new Color(102, 102, 102));
		btnTres.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnTres.setBounds(189, 298, 66, 37);
		ventana.getContentPane().add(btnTres);
		btnTres.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				metodosCalculadora.comprobarUsoBotonNumero(txtResultado);
				metodosCalculadora.setUsoBotonIgual(false);
				txtResultado.setText(txtResultado.getText() + "3");
			}
		});

		JButton btnCuatro = new JButton("4");
		btnCuatro.setForeground(new Color(255, 255, 255));
		btnCuatro.setBackground(new Color(102, 102, 102));
		btnCuatro.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnCuatro.setBounds(37, 250, 66, 37);
		ventana.getContentPane().add(btnCuatro);
		btnCuatro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				metodosCalculadora.comprobarUsoBotonNumero(txtResultado);
				metodosCalculadora.setUsoBotonIgual(false);
				txtResultado.setText(txtResultado.getText() + "4");
			}
		});

		JButton btnCinco = new JButton("5");
		btnCinco.setForeground(new Color(255, 255, 255));
		btnCinco.setBackground(new Color(102, 102, 102));
		btnCinco.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnCinco.setBounds(113, 250, 66, 37);
		ventana.getContentPane().add(btnCinco);
		btnCinco.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				metodosCalculadora.comprobarUsoBotonNumero(txtResultado);
				metodosCalculadora.setUsoBotonIgual(false);
				txtResultado.setText(txtResultado.getText() + "5");
			}
		});

		JButton btnSeis = new JButton("6");
		btnSeis.setForeground(new Color(255, 255, 255));
		btnSeis.setBackground(new Color(102, 102, 102));
		btnSeis.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnSeis.setBounds(189, 250, 66, 37);
		ventana.getContentPane().add(btnSeis);
		btnSeis.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				metodosCalculadora.comprobarUsoBotonNumero(txtResultado);
				metodosCalculadora.setUsoBotonIgual(false);
				txtResultado.setText(txtResultado.getText() + "6");
			}
		});

		JButton btnSiete = new JButton("7");
		btnSiete.setBackground(new Color(102, 102, 102));
		btnSiete.setForeground(new Color(255, 255, 255));
		btnSiete.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnSiete.setBounds(37, 200, 66, 37);
		ventana.getContentPane().add(btnSiete);
		btnSiete.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				metodosCalculadora.comprobarUsoBotonNumero(txtResultado);
				metodosCalculadora.setUsoBotonIgual(false);
				txtResultado.setText(txtResultado.getText() + "7");
			}
		});

		JButton btnOcho = new JButton("8");
		btnOcho.setForeground(new Color(255, 255, 255));
		btnOcho.setBackground(new Color(102, 102, 102));
		btnOcho.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnOcho.setBounds(113, 200, 66, 37);
		ventana.getContentPane().add(btnOcho);

		btnOcho.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				metodosCalculadora.comprobarUsoBotonNumero(txtResultado);
				metodosCalculadora.setUsoBotonIgual(false);
				txtResultado.setText(txtResultado.getText() + "8");
			}
		});

		JButton btnNueve = new JButton("9");
		btnNueve.setForeground(new Color(255, 255, 255));
		btnNueve.setBackground(new Color(102, 102, 102));
		btnNueve.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNueve.setBounds(189, 200, 66, 37);
		ventana.getContentPane().add(btnNueve);
		btnNueve.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				metodosCalculadora.comprobarUsoBotonNumero(txtResultado);
				metodosCalculadora.setUsoBotonIgual(false);
				txtResultado.setText(txtResultado.getText() + "9");
			}
		});

		JButton btnCero = new JButton("0");
		btnCero.setForeground(new Color(255, 255, 255));
		btnCero.setBackground(new Color(102, 102, 102));
		btnCero.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnCero.setBounds(113, 346, 66, 37);
		ventana.getContentPane().add(btnCero);
		btnCero.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {

				if (metodosCalculadora.isUsoBotonComa() == false) {
					metodosCalculadora.comprobarUsoBotonNumero(txtResultado);
					try {
						if (txtResultado.getText().charAt(0) != '0') {
							txtResultado.setText(txtResultado.getText() + "0");
						}
					} catch (StringIndexOutOfBoundsException e) {
						txtResultado.setText("0");
						metodosCalculadora.setUsoBotonNumero(false);
					}
				}
				if (metodosCalculadora.isUsoBotonComa() == true) {
					txtResultado.setText(txtResultado.getText() + "0");
				}
				metodosCalculadora.setUsoBotonIgual(false);
			}
		});

		JButton btnSumar = new JButton("+");
		btnSumar.setForeground(new Color(255, 255, 255));
		btnSumar.setBackground(new Color(102, 102, 102));
		btnSumar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnSumar.setBounds(284, 298, 66, 37);
		ventana.getContentPane().add(btnSumar);
		btnSumar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				try {
					metodosCalculadora.calcularOperacion(txtResultado);

					if (metodosCalculadora.isUsoBotonIgual() == false) {
						if (metodosCalculadora.isUsoBotonOperacion() == false) {
							metodosCalculadora.setUsoBotonOperacion(true);
							metodosCalculadora.setUsoBotonNumero(false);
							resultado += Integer.parseInt(txtResultado.getText());
							metodosCalculadora.setResultado(resultado);
							txtResultado.setText(String.valueOf(resultado));
							metodosCalculadora.setOperacionSeleccionada("suma");
						}
					}
					metodosCalculadora.setUsoBotonOperacion(true);
					metodosCalculadora.setUsoBotonNumero(false);
					metodosCalculadora.setOperacionSeleccionada("suma");
				} catch (ArithmeticException e) {
					metodosCalculadora.reinicioPorError(txtResultado, e);
				}
			}

		});

		JButton btnRestar = new JButton("-");
		btnRestar.setForeground(new Color(255, 255, 255));
		btnRestar.setBackground(new Color(102, 102, 102));
		btnRestar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnRestar.setBounds(284, 250, 66, 37);
		ventana.getContentPane().add(btnRestar);
		btnRestar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				try {
					metodosCalculadora.calcularOperacion(txtResultado);

					if (metodosCalculadora.isUsoBotonIgual() == false) {
						if (metodosCalculadora.isUsoBotonOperacion() == false) {
							metodosCalculadora.setUsoBotonOperacion(true);
							metodosCalculadora.setUsoBotonNumero(false);
							resultado -= Integer.parseInt(txtResultado.getText());
							metodosCalculadora.setResultado(resultado);
							txtResultado.setText(String.valueOf(resultado));
							metodosCalculadora.setOperacionSeleccionada("resta");
						}
					}
					metodosCalculadora.setUsoBotonOperacion(true);
					metodosCalculadora.setUsoBotonNumero(false);
					metodosCalculadora.setOperacionSeleccionada("resta");
				} catch (ArithmeticException e) {
					metodosCalculadora.reinicioPorError(txtResultado, e);
				}
			}

		});

		JButton btnMultiplicar = new JButton("X");
		btnMultiplicar.setForeground(new Color(255, 255, 255));
		btnMultiplicar.setBackground(new Color(102, 102, 102));
		btnMultiplicar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnMultiplicar.setBounds(284, 200, 66, 37);
		ventana.getContentPane().add(btnMultiplicar);
		btnMultiplicar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				try {
					metodosCalculadora.calcularOperacion(txtResultado);

					if (metodosCalculadora.isUsoBotonIgual() == false) {
						if (metodosCalculadora.isUsoBotonOperacion() == false) {
							metodosCalculadora.setUsoBotonOperacion(true);
							metodosCalculadora.setUsoBotonNumero(false);
							if (metodosCalculadora.isUsoResultado() == false) {
								resultado = 1;
								metodosCalculadora.setUsoResultado(true);
							}
							resultado *= Integer.parseInt(txtResultado.getText());
							metodosCalculadora.setResultado(resultado);
							txtResultado.setText(String.valueOf(resultado));
							metodosCalculadora.setOperacionSeleccionada("multiplicar");
						}
					}
					metodosCalculadora.setUsoBotonOperacion(true);
					metodosCalculadora.setUsoBotonNumero(false);
					metodosCalculadora.setOperacionSeleccionada("multiplicar");
				} catch (ArithmeticException e) {
					metodosCalculadora.reinicioPorError(txtResultado, e);
				}
			}
		});

		JButton btnDividir = new JButton("\u00F7");
		btnDividir.setForeground(new Color(255, 255, 255));
		btnDividir.setBackground(new Color(102, 102, 102));
		btnDividir.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnDividir.setBounds(284, 152, 66, 37);
		ventana.getContentPane().add(btnDividir);
		btnDividir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {

				try {
					metodosCalculadora.calcularOperacion(txtResultado);

					if (metodosCalculadora.isUsoBotonIgual() == false) {
						if (metodosCalculadora.isUsoBotonOperacion() == false) {
							metodosCalculadora.setUsoBotonOperacion(true);
							metodosCalculadora.setUsoBotonNumero(false);
							if (metodosCalculadora.isUsoResultado() == false) {
								resultado = Integer.parseInt(txtResultado.getText());
								metodosCalculadora.setUsoResultado(true);
							} else {
								resultado /= Integer.parseInt(txtResultado.getText());
							}
							metodosCalculadora.setResultado(resultado);
							txtResultado.setText(String.valueOf(resultado));
							metodosCalculadora.setOperacionSeleccionada("dividir");
						}
					}
					metodosCalculadora.setUsoBotonOperacion(true);
					metodosCalculadora.setUsoBotonNumero(false);
					metodosCalculadora.setOperacionSeleccionada("dividir");

				} catch (ArithmeticException e) {
					metodosCalculadora.reinicioPorError(txtResultado, e);
				}
			}
		});

		JButton btnReinicio = new JButton("C");
		btnReinicio.setForeground(new Color(255, 255, 255));
		btnReinicio.setBackground(new Color(102, 102, 102));
		btnReinicio.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnReinicio.setBounds(37, 346, 66, 37);
		ventana.getContentPane().add(btnReinicio);
		btnReinicio.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				resultado = 0;
				txtResultado.setText("0");
				metodosCalculadora.setUsoBotonNumero(false);
				metodosCalculadora.setUsoBotonComa(false);
				metodosCalculadora.setUsoBotonIgual(false);
				metodosCalculadora.setUsoBotonOperacion(false);
				metodosCalculadora.setUsoResultado(false);
				metodosCalculadora.setOperacionSeleccionada("");

			}
		});

		JButton btnResultado = new JButton("=");
		btnResultado.setForeground(new Color(255, 255, 255));
		btnResultado.setBackground(new Color(102, 102, 102));
		btnResultado.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnResultado.setBounds(284, 346, 66, 37);
		ventana.getContentPane().add(btnResultado);
		btnResultado.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				try {
					metodosCalculadora.calcularOperacion(txtResultado);
					if (metodosCalculadora.isUsoResultado() == false) {
						resultado = Integer.parseInt(txtResultado.getText());
						metodosCalculadora.setUsoResultado(true);
						metodosCalculadora.setUsoBotonNumero(false);
						metodosCalculadora.setUsoBotonIgual(true);
					} else {
						txtResultado.setText(String.valueOf(metodosCalculadora.getResultado()));
						metodosCalculadora.setUsoBotonNumero(false);
						metodosCalculadora.setUsoBotonIgual(true);
					}
				} catch (ArithmeticException e) {
					metodosCalculadora.reinicioPorError(txtResultado, e);
				}
			}
		});
		
		JButton btnEliminar = new JButton("Del");
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnEliminar.setBackground(new Color(102, 102, 102));
		btnEliminar.setBounds(189, 152, 66, 37);
		ventana.getContentPane().add(btnEliminar);
		btnEliminar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String contenido = "";
				for(int i = 0; i < txtResultado.getText().length()-1; i++) {
					contenido = contenido + txtResultado.getText().charAt(i);
					if(txtResultado.getText().charAt(i) == ',') {
						metodosCalculadora.setUsoBotonComa(false);
					}
				}
				txtResultado.setText(contenido);
				if(txtResultado.getText().length() == 0) {
					txtResultado.setText("0");
					metodosCalculadora.setUsoBotonNumero(false);
				}
			}
		});
		

		JButton btnComa = new JButton(",");
		btnComa.setForeground(new Color(255, 255, 255));
		btnComa.setBackground(new Color(102, 102, 102));
		btnComa.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnComa.setBounds(189, 346, 66, 37);
		ventana.getContentPane().add(btnComa);
		btnComa.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < txtResultado.getText().length(); i++) {
					if (',' == (txtResultado.getText().charAt(i))) {
						metodosCalculadora.setUsoBotonComa(true);
						break;
					}
				}
				
				if(metodosCalculadora.isUsoBotonNumero() == false) {
					txtResultado.setText("0,");
					metodosCalculadora.setUsoBotonComa(true);
				}
				
				if (metodosCalculadora.isUsoBotonComa() == false && metodosCalculadora.isUsoBotonNumero() == true) {
					txtResultado.setText(txtResultado.getText() + ",");
					metodosCalculadora.setUsoBotonComa(true);
				}
				if ('0' == (txtResultado.getText().charAt(0)) && metodosCalculadora.isUsoBotonNumero() == false) {
					metodosCalculadora.setUsoBotonNumero(true);
				}
			}
		});
		ventana.setVisible(true);
	}
}
