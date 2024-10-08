package ejercicioArrays9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numero = new int[10];

		for (int i = 0; i <= numero.length-1; i++) {
			System.out.println("Introduce el numero " + (i+1));
			numero[i] = entrada.nextInt();
		}

		for (int i = numero.length-1; i > 0; i--) {
			int aux = numero[i];
			numero[i] = numero[i-1];
			numero[i-1] = aux;
		}
		for (int i = 0; i < numero.length; i++) {
			System.out.println("El numero en el espacio "+ (i+1) + " es " + numero[i]);
		}
	}

}
