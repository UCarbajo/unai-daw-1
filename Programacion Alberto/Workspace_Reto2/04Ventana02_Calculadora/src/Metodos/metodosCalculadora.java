package Metodos;
import javax.swing.JTextField;

public class metodosCalculadora {
	
	private static int resultado = 0;
	private static boolean usoBotonNumero = false;
	private static boolean usoBotonOperacion = false;
	private static boolean usoBotonIgual = false;
	private static boolean usoBotonComa = false;
	private static boolean usoResultado = false;
	private static String operacionSeleccionada = "";

	public static int getResultado() {
		return resultado;
	}

	public static void setResultado(int resultado) {
		metodosCalculadora.resultado = resultado;
	}

	public static boolean isUsoBotonNumero() {
		return usoBotonNumero;
	}

	public static void setUsoBotonNumero(boolean usoBotonNumero) {
		metodosCalculadora.usoBotonNumero = usoBotonNumero;
	}

	public static boolean isUsoBotonOperacion() {
		return usoBotonOperacion;
	}

	public static void setUsoBotonOperacion(boolean usoBotonOperacion) {
		metodosCalculadora.usoBotonOperacion = usoBotonOperacion;
	}

	public static boolean isUsoBotonIgual() {
		return usoBotonIgual;
	}

	public static void setUsoBotonIgual(boolean usoBotonIgual) {
		metodosCalculadora.usoBotonIgual = usoBotonIgual;
	}

	public static boolean isUsoBotonComa() {
		return usoBotonComa;
	}

	public static void setUsoBotonComa(boolean usoBotonComa) {
		metodosCalculadora.usoBotonComa = usoBotonComa;
	}

	public static boolean isUsoResultado() {
		return usoResultado;
	}

	public static void setUsoResultado(boolean usoResultado) {
		metodosCalculadora.usoResultado = usoResultado;
	}

	public static String getOperacionSeleccionada() {
		return operacionSeleccionada;
	}

	public static void setOperacionSeleccionada(String operacionSeleccionada) {
		metodosCalculadora.operacionSeleccionada = operacionSeleccionada;
	}

	//METODOS
	
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
