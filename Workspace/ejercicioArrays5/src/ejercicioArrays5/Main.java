package ejercicioArrays5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numero = new int[6];
		
		for (int i = 0; i <numero.length; i++) {
			System.out.println("Introduce un numero");
			numero[i] = entrada.nextInt();
		}
		
		//int[] numerosAlReves = new int[numero.length];
		//for(int i = numero.length-1, j = 0; i >= 0; i--, j++){
		//	numerosAlReves[j] = numeros [i];
		//}
		
		int temp;
		int restar = numero.length-1;
		
		for(int i = 0; i<numero.length/2; i++) {
			temp = numero[i];
			numero[i] = numero[restar];
			numero[restar] = temp;
			
			restar--;
		}
		System.out.println("Numeros al reves");
		for(int i = 0; i<numero.length; i++) {
			System.out.println(numero[i]);
		}
	}

}
