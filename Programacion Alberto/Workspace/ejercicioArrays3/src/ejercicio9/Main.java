package ejercicio9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Pedir 5 numeros
		// cuantos pares y los nones
		
		Scanner entrada = new Scanner(System.in);
		int[] numero = new int[10];
		
		for(int i = 0; i<numero.length; i++) {
			System.out.println("Introduce un numero");
			numero[i] = entrada.nextInt();
		}
		
		int par = 0;
		int impar = 0;
		
		for (int i = 0; i < numero.length; i++) {
			if (numero[i]%2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Pares " + par + " Impar " + impar );
	}

}
