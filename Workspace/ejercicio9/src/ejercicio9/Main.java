package ejercicio9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Pedir 5 numeros
		// cuantos pares y los nones
		
		Scanner entrada = new Scanner(System.in);
		int[] numero = new int[5];
		int par = 0;
		int impar = 0;
		int resultado = 1;
		
		System.out.println("Introduce numero");
		numero [0] = entrada.nextInt();
		System.out.println("Introduce numero");
		numero [1] = entrada.nextInt();
		System.out.println("Introduce numero");
		numero [2] = entrada.nextInt();
		System.out.println("Introduce numero");
		numero [3] = entrada.nextInt();
		System.out.println("Introduce numero");
		numero [4] = entrada.nextInt();
		
		for (int i = 0; i < numero.length; i++) {
			resultado = numero[i]%2;
			if (resultado == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Pares " + par + " Impar " + impar );
	}

}
