package App;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculadora {

	public static int resultado = 0;
	public static boolean usoBotonNumero = false;
	public static boolean usoBotonOperacion = false;
	public static boolean usoBotonIgual = false;
	public static boolean usoBotonComa = false;
	public static boolean usoResultado = false;
	public static String operacionSeleccionada = "";

	public static void main(String[] args) {

		JFrame ventana = new JFrame();
		ventana.setBounds(100, 100, 400, 500);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);

		JTextField txtResultado = new JTextField();
		txtResultado.setText("0");
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setBounds(37, 65, 313, 37);
		ventana.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		JButton btnUno = new JButton("1");
		btnUno.setBounds(37, 298, 66, 37);
		ventana.getContentPane().add(btnUno);
		btnUno.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				comprobarUsoBotonNumero(txtResultado);
				usoBotonIgual = false;
				txtResultado.setText(txtResultado.getText() + "1");
			}
		});

		JButton btnDos = new JButton("2");
		btnDos.setBounds(113, 298, 66, 37);
		ventana.getContentPane().add(btnDos);
		btnDos.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				comprobarUsoBotonNumero(txtResultado);
				usoBotonIgual = false;
				txtResultado.setText(txtResultado.getText() + "2");
			}
		});

		JButton btnTres = new JButton("3");
		btnTres.setBounds(189, 298, 66, 37);
		ventana.getContentPane().add(btnTres);
		btnTres.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				comprobarUsoBotonNumero(txtResultado);
				usoBotonIgual = false;
				txtResultado.setText(txtResultado.getText() + "3");
			}
		});

		JButton btnCuatro = new JButton("4");
		btnCuatro.setBounds(37, 250, 66, 37);
		ventana.getContentPane().add(btnCuatro);
		btnCuatro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				comprobarUsoBotonNumero(txtResultado);
				usoBotonIgual = false;
				txtResultado.setText(txtResultado.getText() + "4");
			}
		});

		JButton btnCinco = new JButton("5");
		btnCinco.setBounds(113, 250, 66, 37);
		ventana.getContentPane().add(btnCinco);
		btnCinco.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				comprobarUsoBotonNumero(txtResultado);
				usoBotonIgual = false;
				txtResultado.setText(txtResultado.getText() + "5");
			}
		});

		JButton btnSeis = new JButton("6");
		btnSeis.setBounds(189, 250, 66, 37);
		ventana.getContentPane().add(btnSeis);
		btnSeis.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				comprobarUsoBotonNumero(txtResultado);
				usoBotonIgual = false;
				txtResultado.setText(txtResultado.getText() + "6");
			}
		});

		JButton btnSiete = new JButton("7");
		btnSiete.setBounds(37, 200, 66, 37);
		ventana.getContentPane().add(btnSiete);
		btnSiete.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				comprobarUsoBotonNumero(txtResultado);
				usoBotonIgual = false;
				txtResultado.setText(txtResultado.getText() + "7");
			}
		});

		JButton btnOcho = new JButton("8");
		btnOcho.setBounds(113, 200, 66, 37);
		ventana.getContentPane().add(btnOcho);

		btnOcho.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				comprobarUsoBotonNumero(txtResultado);
				usoBotonIgual = false;
				txtResultado.setText(txtResultado.getText() + "8");
			}
		});

		JButton btnNueve = new JButton("9");
		btnNueve.setBounds(189, 200, 66, 37);
		ventana.getContentPane().add(btnNueve);
		btnNueve.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				comprobarUsoBotonNumero(txtResultado);
				usoBotonIgual = false;
				txtResultado.setText(txtResultado.getText() + "9");
			}
		});

		JButton btnCero = new JButton("0");
		btnCero.setBounds(113, 346, 66, 37);
		ventana.getContentPane().add(btnCero);
		btnCero.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {

				if (usoBotonComa == false) {
					comprobarUsoBotonNumero(txtResultado);
					try {
						if (txtResultado.getText().charAt(0) != '0') {
							txtResultado.setText(txtResultado.getText() + "0");
						}
					} catch (StringIndexOutOfBoundsException e) {
						txtResultado.setText("0");
						if (operacionSeleccionada == "") {
							usoBotonNumero = false;
						}
					}
				}
				if (usoBotonComa == true) {
					txtResultado.setText(txtResultado.getText() + "0");
				}
				usoBotonIgual = false;
			}
		});

		JButton btnSumar = new JButton("+");
		btnSumar.setBounds(284, 298, 66, 37);
		ventana.getContentPane().add(btnSumar);
		btnSumar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				try {
					calcularOperacion(txtResultado);

					if (usoBotonIgual == false) {
						if (usoBotonOperacion == false) {
							usoBotonOperacion = true;
							usoBotonNumero = false;
							resultado += Integer.parseInt(txtResultado.getText());
							txtResultado.setText(String.valueOf(resultado));
							operacionSeleccionada = "suma";
						}
					}
					usoBotonOperacion = true;
					usoBotonNumero = false;
					operacionSeleccionada = "suma";
				} catch (ArithmeticException e) {
					reinicioPorError(txtResultado, e);
				}
			}

		});

		JButton btnRestar = new JButton("-");
		btnRestar.setBounds(284, 250, 66, 37);
		ventana.getContentPane().add(btnRestar);
		btnRestar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				try {
					calcularOperacion(txtResultado);

					if (usoBotonIgual == false) {
						if (usoBotonOperacion == false) {
							usoBotonOperacion = true;
							usoBotonNumero = false;
							resultado -= Integer.parseInt(txtResultado.getText());
							txtResultado.setText(String.valueOf(resultado));
							operacionSeleccionada = "resta";
						}
					}
					usoBotonOperacion = true;
					usoBotonNumero = false;
					operacionSeleccionada = "resta";
				} catch (ArithmeticException e) {
					reinicioPorError(txtResultado, e);
				}
			}
		});

		JButton btnMultiplicar = new JButton("X");
		btnMultiplicar.setBounds(284, 200, 66, 37);
		ventana.getContentPane().add(btnMultiplicar);
		btnMultiplicar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				try {
					calcularOperacion(txtResultado);

					if (usoBotonIgual == false) {
						if (usoBotonOperacion == false) {
							usoBotonOperacion = true;
							usoBotonNumero = false;
							if (usoResultado == false) {
								resultado = 1;
								usoResultado = true;
							}
							resultado *= Integer.parseInt(txtResultado.getText());
							txtResultado.setText(String.valueOf(resultado));
							operacionSeleccionada = "multiplicar";
						}
					}
					usoBotonOperacion = true;
					usoBotonNumero = false;
					operacionSeleccionada = "multiplicar";
				} catch (ArithmeticException e) {
					reinicioPorError(txtResultado, e);
				}
			}
		});

		JButton btnDividir = new JButton("/");
		btnDividir.setBounds(284, 152, 66, 37);
		ventana.getContentPane().add(btnDividir);
		btnDividir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {

				try {
					if (usoBotonNumero == true) {
						if (usoBotonOperacion == true) {
							if (usoBotonIgual == false) {
								switch (operacionSeleccionada) {
								case "suma":
									resultado += Integer.parseInt(txtResultado.getText());
									txtResultado.setText(String.valueOf(resultado));
									usoBotonIgual = true;
									operacionSeleccionada = "";
									break;
								case "resta":
									resultado -= Integer.parseInt(txtResultado.getText());
									txtResultado.setText(String.valueOf(resultado));
									usoBotonIgual = true;
									operacionSeleccionada = "";
									break;
								case "multiplicar":
									resultado *= Integer.parseInt(txtResultado.getText());
									txtResultado.setText(String.valueOf(resultado));
									usoBotonIgual = true;
									operacionSeleccionada = "";
									break;
								case "dividir":
									resultado /= Integer.parseInt(txtResultado.getText());
									txtResultado.setText(String.valueOf(resultado));
									usoBotonIgual = true;
									operacionSeleccionada = "";
									break;
								}
							}
						}
					}

					if (usoBotonIgual == false) {
						if (usoBotonOperacion == false) {
							usoBotonOperacion = true;
							usoBotonNumero = false;
							if (usoResultado == false) {
								resultado = Integer.parseInt(txtResultado.getText());
								usoResultado = true;
							} else {
								resultado /= Integer.parseInt(txtResultado.getText());
							}
							txtResultado.setText(String.valueOf(resultado));
							operacionSeleccionada = "dividir";
						}
					}
					usoBotonOperacion = true;
					usoBotonNumero = false;
					operacionSeleccionada = "dividir";

				} catch (ArithmeticException e) {
					reinicioPorError(txtResultado, e);
				}
			}
		});

		JButton btnReinicio = new JButton("C");
		btnReinicio.setBounds(37, 346, 66, 37);
		ventana.getContentPane().add(btnReinicio);
		btnReinicio.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				resultado = 0;
				txtResultado.setText("0");
				usoBotonNumero = false;
				usoBotonComa = false;
				usoBotonIgual = false;
				usoBotonOperacion = false;
				usoResultado = false;
				operacionSeleccionada = "";

			}
		});

		JButton btnResultado = new JButton("=");
		btnResultado.setBounds(284, 346, 66, 37);
		ventana.getContentPane().add(btnResultado);
		btnResultado.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				try {
					if (usoBotonNumero == true) {
						if (usoBotonOperacion == true) {
							if (usoBotonIgual == false) {
								switch (operacionSeleccionada) {
								case "suma":
									resultado += Integer.parseInt(txtResultado.getText());
									txtResultado.setText(String.valueOf(resultado));
									usoBotonIgual = true;
									operacionSeleccionada = "";
									break;
								case "resta":
									resultado -= Integer.parseInt(txtResultado.getText());
									txtResultado.setText(String.valueOf(resultado));
									usoBotonIgual = true;
									operacionSeleccionada = "";
									break;
								case "multiplicar":
									resultado *= Integer.parseInt(txtResultado.getText());
									txtResultado.setText(String.valueOf(resultado));
									usoBotonIgual = true;
									operacionSeleccionada = "";
									break;
								case "dividir":
									resultado /= Integer.parseInt(txtResultado.getText());
									txtResultado.setText(String.valueOf(resultado));
									usoBotonIgual = true;
									operacionSeleccionada = "";
									break;
								}
							}
						}
					}

					if (usoResultado == false) {
						resultado = Integer.parseInt(txtResultado.getText());
						usoResultado = true;
						usoBotonNumero = false;
						usoBotonIgual = true;
					} else {
						txtResultado.setText(String.valueOf(resultado));
						usoBotonNumero = false;
						usoBotonIgual = true;
					}
				} catch (ArithmeticException e) {
					reinicioPorError(txtResultado, e);
				}
			}
		});

		JButton btnComa = new JButton(",");
		btnComa.setBounds(189, 346, 66, 37);
		ventana.getContentPane().add(btnComa);
		btnComa.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < txtResultado.getText().length(); i++) {
					if (',' == (txtResultado.getText().charAt(i))) {
						usoBotonComa = true;
						break;
					}
				}

				if (usoBotonNumero == false) {
					txtResultado.setText("0,");
					usoBotonComa = true;
				}

				if (usoBotonComa == false && usoBotonNumero == true) {
					txtResultado.setText(txtResultado.getText() + ",");
					usoBotonComa = true;
				}
				if ('0' == (txtResultado.getText().charAt(0)) && usoBotonNumero == false) {
					usoBotonNumero = true;
				}
			}
		});
		ventana.setVisible(true);
	}

	// METODOS

	public static void comprobarUsoBotonNumero(JTextField txtResultado) {
		if (usoBotonNumero == false) {
			txtResultado.setText("");
			usoBotonNumero = true;
		}
	}

	public static void calcularOperacion(JTextField textoResultado) throws ArithmeticException {
		if (usoBotonNumero == true) {
			if (usoBotonOperacion == true) {
				if (usoBotonIgual == false) {
					switch (operacionSeleccionada) {
					case "suma":
						resultado += Integer.parseInt(textoResultado.getText());
						textoResultado.setText(String.valueOf(resultado));
						usoBotonIgual = true;
						operacionSeleccionada = "";
						break;
					case "resta":
						resultado -= Integer.parseInt(textoResultado.getText());
						textoResultado.setText(String.valueOf(resultado));
						usoBotonIgual = true;
						operacionSeleccionada = "";
						break;
					case "multiplicar":
						resultado *= Integer.parseInt(textoResultado.getText());
						textoResultado.setText(String.valueOf(resultado));
						usoBotonIgual = true;
						operacionSeleccionada = "";
						break;
					case "dividir":
						resultado /= Integer.parseInt(textoResultado.getText());
						textoResultado.setText(String.valueOf(resultado));
						usoBotonIgual = true;
						operacionSeleccionada = "";
						break;
					}
				}
			}
		}
	}

	public static void reinicioPorError(JTextField txtResultado, Exception e) {
		resultado = 0;
		txtResultado.setText("Error: " + e.getMessage());
		usoBotonNumero = false;
		usoBotonComa = false;
		usoBotonIgual = false;
		usoBotonOperacion = false;
		usoResultado = false;
		operacionSeleccionada = "";
	}
}
