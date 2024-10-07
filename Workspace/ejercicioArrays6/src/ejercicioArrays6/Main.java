package ejercicioArrays6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numero = new int[10];

		for (int i = 0; i < numero.length; i++) {
			System.out.println("Introduce un numero");
			numero[i] = entrada.nextInt();
		}

		for (int i = 0; i < numero.length - 1; i++) {
			for (int j = 0; j < numero.length - 1 - i; j++) {
				if (numero[j] > numero[j+1]) {
					int aux = numero[j];
					numero[j] = numero[j+1];
					numero[j+1] = aux;
				}
			}

		}
	}
}
