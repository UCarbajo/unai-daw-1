import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int[] resultado = new int[100];
		boolean[] auxiliar = new boolean[resultado.length];

		Random ramon = new Random();
		for (int i = 0; i < resultado.length; i++) {
			int primerDado = ramon.nextInt(6) + 1;
			int segundoDado = ramon.nextInt(6) + 1;
			int sumaDado = primerDado + segundoDado;
			resultado[i] = sumaDado;
		}

		for (int i = 0; i < resultado.length; i++) {

			int aux = 0;
			for (int j = i + 1; j < resultado.length; j++) {
				if (resultado[i] > resultado[j]) {
					aux = resultado[i];
					resultado[i] = resultado[j];
					resultado[j] = aux;
				}
			}
		}

		for (int i = 0; i < resultado.length; i++) {
			int repeticiones = 1;
			if (auxiliar[i] == false) {
				auxiliar[i] = true;

				for (int j = i + 1; j < resultado.length; j++) {
					if (resultado[i] == resultado[j]) {
						auxiliar[j] = true;
						repeticiones++;
					}
				}
				System.out.println("El resultado de la suma de los dados " + resultado[i] + " aparece " + repeticiones
						+ " vez/veces");
			}
		}

	}

}
