import java.util.Random;
import java.util.Scanner;

public class ArrayBidimensional {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce las filas del array");
		int filas = entrada.nextInt();
		System.out.println("Introduce las columnas del array");
		int columnas = entrada.nextInt();

		int[][] arrayBidimensional = new int[filas][columnas];

		Random rand = new Random();
		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional[i].length; j++) {
				arrayBidimensional[i][j] = rand.nextInt(100) + 1;
			}
		}
		mostrarArray(arrayBidimensional);
		System.out.println();

		for (int i = 0; i < arrayBidimensional.length; i++) {
			int mayor = arrayBidimensional[i][0];
			for (int j = 0; j < arrayBidimensional[i].length; j++) {
				mayor = arrayBidimensional[i][j];
				for (int k = j; k < arrayBidimensional[i].length; k++) {
					int aux = 0;
					if (mayor < arrayBidimensional[i][k]) {
						aux = mayor;
						mayor = arrayBidimensional[i][k];
						arrayBidimensional[i][k] = aux;
						arrayBidimensional[i][j] = mayor;
					}
				}
			}
		}
		mostrarArray(arrayBidimensional);
	}

	private static void mostrarArray(int[][] arrayBidimensional) {
		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional[i].length; j++) {
				System.out.print(arrayBidimensional[i][j] + " ");
			}
			System.out.println();
		}
	}
}
