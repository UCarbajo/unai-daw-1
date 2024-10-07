package ejercicioArrays4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numero = new int[8];
		int numeroP;

		for (int i = 0; i < numero.length; i++) {
			System.out.println("Introduce un numero");
			numero[i] = entrada.nextInt();
		}
		System.out.println("Introduce un numero del array");
		numeroP = entrada.nextInt();

		boolean encontrado = false;
		int posicion = 0;
		
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == numeroP) {
				encontrado = true;
				posicion = i;
				break;
			}
		}

		if (encontrado) {
			System.out.println("El numero esta en el array, en la posicion " + posicion);
		} else {
			System.out.println("El numero no esta en el array");
		}
	}

}
