package ejercicioArrays7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] numero = new int[3][3];

		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				System.out.println("Introduce el numero de la columna " + i + " fila " + j);
				numero[i][j] = entrada.nextInt();
			}
		}

		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				System.out.println(numero[i][j] + " ");
			}
			System.out.println();
		}

		int[] sumaFila = new int[3];
		int[] sumaColumna = new int[3];

		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				sumaFila[i] += numero[i][j];
			}
			System.out.println("La suma de la fila " + i + " es " + sumaFila[i]);
		}
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				sumaColumna[i] += numero[j][i];
			}
			System.out.println("Las suma de la columna " + i + " es " + sumaColumna[i]);
		}

	}

}
