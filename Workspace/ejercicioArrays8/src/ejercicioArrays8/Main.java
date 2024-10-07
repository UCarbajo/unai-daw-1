package ejercicioArrays8;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] numero = new int[4][4];

		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				numero[i][j] = (int) (Math.random() * 100) + 1;
			}
		}
		int numeroAlto = 0;
		
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				if (numero[i][j] > numeroAlto) {
					numeroAlto = numero[i][j];
				}
				System.out.println("Numeros de " + i + " es " + numero[i][j]);
			}
		}
		System.out.println("Numero alto " + numeroAlto);
	}

}
