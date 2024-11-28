import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] array = { 1, 2, 3, 2, 5, 1, 2, 4, 4, 5, 4, 4, 3, 2, 1 };
		boolean[] arrayAux = new boolean[array.length];

		for (int i = 0; i < array.length; i++) {
			int repetidos = 0;

			if (arrayAux[i] == false) {
				arrayAux[i] = true;

				for (int j = i + 1; j < array.length; j++) {
					if (arrayAux[j] == false) {
						if (array[i] == array[j]) {
							arrayAux[j] = true;
							repetidos++;
						}
					}
				}
					System.out.println("El numero " + array[i] + " se repite " + repetidos + " veces");
				

			}
		}

	}

}
