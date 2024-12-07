package Metodos;

import javax.swing.JTextField;

public class metodosCalculadora {

	private static double resultado = 0;
	private static boolean usoBotonNumero = false;
	private static boolean usoBotonOperacion = false;
	private static boolean usoBotonIgual = false;
	private static boolean usoBotonPunto = false;
	private static boolean esPrimeraOperacion = true;
	private static String operacionSeleccionada = "";

	// METODOS

	public static void usoBotonUno(JTextField txtResultado) {

		if (usoBotonNumero == false) {
			txtResultado.setText("");
			usoBotonNumero = true;
		}
		usoBotonIgual = false;
		txtResultado.setText(txtResultado.getText() + "1");
	}

	public static void usoBotonDos(JTextField txtResultado) {
		if (usoBotonNumero == false) {
			txtResultado.setText("");
			usoBotonNumero = true;
		}
		usoBotonIgual = false;
		txtResultado.setText(txtResultado.getText() + "2");
	}

	public static void usoBotonTres(JTextField txtResultado) {
		if (usoBotonNumero == false) {
			txtResultado.setText("");
			usoBotonNumero = true;
		}
		usoBotonIgual = false;
		txtResultado.setText(txtResultado.getText() + "3");
	}

	public static void usoBotonCuatro(JTextField txtResultado) {
		if (usoBotonNumero == false) {
			txtResultado.setText("");
			usoBotonNumero = true;
		}
		usoBotonIgual = false;
		txtResultado.setText(txtResultado.getText() + "4");
	}

	public static void usoBotonCinco(JTextField txtResultado) {
		if (usoBotonNumero == false) {
			txtResultado.setText("");
			usoBotonNumero = true;
		}
		usoBotonIgual = false;
		txtResultado.setText(txtResultado.getText() + "5");
	}

	public static void usoBotonSeis(JTextField txtResultado) {
		if (usoBotonNumero == false) {
			txtResultado.setText("");
			usoBotonNumero = true;
		}
		usoBotonIgual = false;
		txtResultado.setText(txtResultado.getText() + "6");
	}

	public static void usoBotonSiete(JTextField txtResultado) {
		if (usoBotonNumero == false) {
			txtResultado.setText("");
			usoBotonNumero = true;
		}
		usoBotonIgual = false;
		txtResultado.setText(txtResultado.getText() + "7");
	}

	public static void usoBotonOcho(JTextField txtResultado) {
		if (usoBotonNumero == false) {
			txtResultado.setText("");
			usoBotonNumero = true;
		}
		usoBotonIgual = false;
		txtResultado.setText(txtResultado.getText() + "8");
	}

	public static void usoBotonNueve(JTextField txtResultado) {
		if (usoBotonNumero == false) {
			txtResultado.setText("");
			usoBotonNumero = true;
		}
		usoBotonIgual = false;
		txtResultado.setText(txtResultado.getText() + "9");
	}

	public static void usoBotonCero(JTextField txtResultado) {
		if (usoBotonPunto == false) {
			if (usoBotonNumero == false) {
				txtResultado.setText("");
				usoBotonNumero = true;
			}
			try {
				if (txtResultado.getText().charAt(0) != '0') {
					txtResultado.setText(txtResultado.getText() + "0");
				}
			} catch (StringIndexOutOfBoundsException e) {
				txtResultado.setText("0");
				usoBotonNumero = false;
			}
		} else {
			txtResultado.setText(txtResultado.getText() + "0");
		}
		usoBotonIgual = false;
	}

	public static void usoBotonSuma(JTextField txtResultado) {
		try {
			calcularOperacion(txtResultado);

			if (usoBotonIgual == false) {
				if (usoBotonOperacion == false) {
					usoBotonOperacion = true;
					usoBotonNumero = false;
					if (esPrimeraOperacion == true) {
						resultado = Double.parseDouble(txtResultado.getText());
						usoBotonIgual = true;
						esPrimeraOperacion = false;
					} else {
						resultado += Double.parseDouble(txtResultado.getText());
					}
					txtResultado.setText(String.valueOf(ComprobarDecimal(resultado)));
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

	public static void usoBotonResta(JTextField txtResultado) {
		try {
			calcularOperacion(txtResultado);

			if (usoBotonIgual == false) {
				if (usoBotonOperacion == false) {
					usoBotonOperacion = true;
					usoBotonNumero = false;
					if (esPrimeraOperacion == true) {
						resultado = Double.parseDouble(txtResultado.getText());
						usoBotonIgual = true;
						esPrimeraOperacion = false;
					} else {
						resultado -= Double.parseDouble(txtResultado.getText());
					}
					txtResultado.setText(String.valueOf(ComprobarDecimal(resultado)));
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

	public static void usoBotonMultiplicar(JTextField txtResultado) {
		try {
			calcularOperacion(txtResultado);

			if (usoBotonIgual == false) {
				if (usoBotonOperacion == false) {
					usoBotonOperacion = true;
					usoBotonNumero = false;
					if (esPrimeraOperacion == true) {
						resultado = 1;
						usoBotonIgual = true;
						esPrimeraOperacion = false;
					}
					resultado *= Double.parseDouble(txtResultado.getText());
					txtResultado.setText(String.valueOf(ComprobarDecimal(resultado)));
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

	public static void usoBotonDividir(JTextField txtResultado) {
		try {
			if (txtResultado.getText().equals("0")) {
				throw new ArithmeticException("División por cero");
			}

			calcularOperacion(txtResultado);

			if (usoBotonIgual == false) {
				if (usoBotonOperacion == false) {
					usoBotonOperacion = true;
					usoBotonNumero = false;
					if (esPrimeraOperacion == true) {
						resultado = Double.parseDouble(txtResultado.getText());
						usoBotonIgual = true;
						esPrimeraOperacion = false;
					} else {
						resultado /= Double.parseDouble(txtResultado.getText());
					}
					txtResultado.setText(String.valueOf(ComprobarDecimal(resultado)));
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

	public static void usoBotonReiniciar(JTextField txtResultado) {
		establecerValoresIniciales();
		txtResultado.setText("0");
	}

	public static void usoBotonResultado(JTextField txtResultado) {
		try {
			calcularOperacion(txtResultado);

			if (esPrimeraOperacion == true) {
				resultado = Double.parseDouble(txtResultado.getText());
				esPrimeraOperacion = false;
				usoBotonNumero = false;
				usoBotonIgual = true;
			} else {
				txtResultado.setText(String.valueOf(ComprobarDecimal(resultado)));
				usoBotonNumero = false;
				usoBotonIgual = true;
			}
		} catch (ArithmeticException e) {
			reinicioPorError(txtResultado, e);
		}
	}

	public static void usoBotonEliminar(JTextField txtResultado) {
		String contenido = "";
		for (int i = 0; i < txtResultado.getText().length() - 1; i++) {
			contenido += txtResultado.getText().charAt(i);
		}
		txtResultado.setText(contenido);
		if (txtResultado.getText().length() == 1 && txtResultado.getText().charAt(0) == '0') {
			usoBotonNumero = false;
		}
		if (txtResultado.getText().length() == 0) {
			txtResultado.setText("0");
			usoBotonNumero = false;
		}
	}

	public static void usoBotonPunto(JTextField txtResultado) {
		for (int i = 0; i < txtResultado.getText().length(); i++) {
			if ('.' == (txtResultado.getText().charAt(i))) {
				usoBotonPunto = true;
				break;
			} else {
				usoBotonPunto = false;
			}
		}

		if (usoBotonNumero == false) {
			txtResultado.setText("0.");
			usoBotonPunto = true;
		}

		if (usoBotonPunto == false && usoBotonNumero == true) {
			txtResultado.setText(txtResultado.getText() + ".");
			usoBotonPunto = true;
		}
		if ('0' == (txtResultado.getText().charAt(0)) && usoBotonNumero == false) {
			usoBotonNumero = true;
		}
	}

	public static void calcularOperacion(JTextField txtResultado) throws ArithmeticException {

		if (usoBotonOperacion == true) {
			if (usoBotonIgual == false) {
				switch (operacionSeleccionada) {
				case "suma":
					resultado += Double.parseDouble(txtResultado.getText());
					txtResultado.setText(String.valueOf(ComprobarDecimal(resultado)));
					usoBotonIgual = true;
					operacionSeleccionada = "";
					break;
				case "resta":
					resultado -= Double.parseDouble(txtResultado.getText());
					txtResultado.setText(String.valueOf(ComprobarDecimal(resultado)));
					usoBotonIgual = true;
					operacionSeleccionada = "";
					break;
				case "multiplicar":
					resultado *= Double.parseDouble(txtResultado.getText());
					txtResultado.setText(String.valueOf(ComprobarDecimal(resultado)));
					usoBotonIgual = true;
					operacionSeleccionada = "";
					break;
				case "dividir":
					if (txtResultado.getText().equals("0")) {
						throw new ArithmeticException("División por cero");
					}
					resultado /= Double.parseDouble(txtResultado.getText());
					txtResultado.setText(String.valueOf(ComprobarDecimal(resultado)));
					usoBotonIgual = true;
					operacionSeleccionada = "";
					break;
				}
			}
		}
	}

	public static void reinicioPorError(JTextField txtResultado, Exception e) {
		establecerValoresIniciales();
		txtResultado.setText("Error: " + e.getMessage());
	}

	public static String ComprobarDecimal(double numero) {
		if (numero == (long) numero) {
			return String.valueOf((long) numero);
		} else {
			return String.valueOf(numero);
		}
	}

	public static void establecerValoresIniciales() {
		resultado = 0;
		usoBotonNumero = false;
		usoBotonPunto = false;
		usoBotonIgual = false;
		usoBotonOperacion = false;
		esPrimeraOperacion = true;
		operacionSeleccionada = "";
	}
}
