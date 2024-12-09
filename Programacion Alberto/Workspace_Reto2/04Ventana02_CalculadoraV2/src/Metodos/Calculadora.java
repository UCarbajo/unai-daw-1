package Metodos;

import javax.swing.JTextField;

public class Calculadora {

	private static double resultado = 0;
	private static boolean usoBotonNumero = false;
	private static boolean usoBotonOperacion = false;
	private static boolean usoBotonIgual = true;
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
			txtResultado.setText("Error: División por cero");
			reinicioPorError(txtResultado);
		} catch (NumberFormatException e) {
			txtResultado.setText("Error: Valores introducidos incorrectos");
			reinicioPorError(txtResultado);
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
			txtResultado.setText("Error: División por cero");
			reinicioPorError(txtResultado);
		} catch (NumberFormatException e) {
			txtResultado.setText("Error: Valores introducidos incorrectos");
			reinicioPorError(txtResultado);
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
			txtResultado.setText("Error: División por cero");
			reinicioPorError(txtResultado);
		} catch (NumberFormatException e) {
			txtResultado.setText("Error: Valores introducidos incorrectos");
			reinicioPorError(txtResultado);
		}
	}

	public static void usoBotonDividir(JTextField txtResultado) {
		try {

			calcularOperacion(txtResultado);

			if (usoBotonIgual == false && usoBotonOperacion == false) {
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
			usoBotonOperacion = true;
			usoBotonNumero = false;
			operacionSeleccionada = "dividir";
		} catch (ArithmeticException e) {
			txtResultado.setText("Error: División por cero");
			reinicioPorError(txtResultado);
		} catch (NumberFormatException e) {
			txtResultado.setText("Error: Valores introducidos incorrectos");
			reinicioPorError(txtResultado);
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
			txtResultado.setText("Error: División por cero");
			reinicioPorError(txtResultado);
		} catch (NumberFormatException e) {
			txtResultado.setText("Error: Valores introducidos incorrectos");
			reinicioPorError(txtResultado);
		}
	}

	public static void usoBotonEliminar(JTextField txtResultado) {
		if (usoBotonIgual == false) {
			String contenido = "";
			for (int i = 0; i < txtResultado.getText().length() - 1; i++) {
				contenido += txtResultado.getText().charAt(i);
			}
			txtResultado.setText(contenido);
			if (txtResultado.getText().length() == 1 && txtResultado.getText().charAt(0) == '0') {
				usoBotonPunto = false;
				usoBotonNumero = false;
			}
			if (txtResultado.getText().length() == 0) {
				txtResultado.setText("0");
				usoBotonNumero = false;
			}
		} else {
			usoBotonNumero = false;
			usoBotonOperacion = false;
			operacionSeleccionada = "";
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
			usoBotonIgual = false;
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

	public static void usoBotonPositivoNegativo(JTextField txtResultado) {
		if (usoBotonNumero == true) {
			if (txtResultado.getText().charAt(0) != '-') {
				txtResultado.setText("-" + txtResultado.getText());
			} else if (txtResultado.getText().charAt(0) == '-') {
				String contenido = "";
				for (int i = 1; i < txtResultado.getText().length(); i++) {
					contenido += txtResultado.getText().charAt(i);
				}
				txtResultado.setText(contenido);
			}
		}
	}

	// TODO Falta comprobar comportamiento + fallos.
	public static void usoBotonAlCuadrado(JTextField txtResultado) {
		if (usoBotonOperacion == true) {
			double cuadrado = Double.parseDouble(txtResultado.getText()) * Double.parseDouble(txtResultado.getText());
			txtResultado.setText(ComprobarDecimal(cuadrado));
		} else {
			resultado = Double.parseDouble(txtResultado.getText()) * Double.parseDouble(txtResultado.getText());
			txtResultado.setText(ComprobarDecimal(resultado));
			usoBotonNumero = false;
		}
	}

	// TODO Falta comprobar comportamiento + fallos.
	public static void usoBotonRaizCuadrada(JTextField txtResultado) {
		if (usoBotonOperacion == true) {
			double cuadrado = Math.sqrt(Double.parseDouble(txtResultado.getText()));
			txtResultado.setText(ComprobarDecimal(cuadrado));
		} else {
			resultado = Math.sqrt(Double.parseDouble(txtResultado.getText()));
			txtResultado.setText(ComprobarDecimal(resultado));
			usoBotonNumero = false;
		}
	}

	// TODO Falta comprobar comportamiento + fallos.
	public static void usoBotonUnaFraccion(JTextField txtResultado) {
		if (usoBotonOperacion == true) {
			double fraccion = 1 / Double.parseDouble(txtResultado.getText());
			txtResultado.setText(ComprobarDecimal(fraccion));
		} else {
			resultado = 1 / Double.parseDouble(txtResultado.getText());
			txtResultado.setText(ComprobarDecimal(resultado));
			usoBotonNumero = false;
		}
	}

	public static void calcularOperacion(JTextField txtResultado) throws ArithmeticException, NumberFormatException {

		if (usoBotonOperacion == true && usoBotonIgual == false) {
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
					throw new ArithmeticException();
				}
				resultado /= Double.parseDouble(txtResultado.getText());
				txtResultado.setText(String.valueOf(ComprobarDecimal(resultado)));
				usoBotonIgual = true;
				operacionSeleccionada = "";
				break;
			}
		}
	}

	public static void reinicioPorError(JTextField txtResultado) {
		establecerValoresIniciales();
	}

	public static String ComprobarDecimal(double resultado) {
		if (resultado == (long) resultado) {
			return String.valueOf((long) resultado);
		} else {
			return String.valueOf(resultado);
		}
	}

	public static void establecerValoresIniciales() {
		resultado = 0;
		usoBotonNumero = false;
		usoBotonPunto = false;
		usoBotonIgual = true;
		usoBotonOperacion = false;
		esPrimeraOperacion = true;
		operacionSeleccionada = "";
	}
}
