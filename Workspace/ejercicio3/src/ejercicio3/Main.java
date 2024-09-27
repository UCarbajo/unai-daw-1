package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero");
		long numero = entrada.nextLong();
		//long total = 1;
		//for (int i = 1; i <= numero ; i++) {
		//	System.out.println(total *= i);
		//}
		for (int i = 1; i <= 100; i++){
			if (i % numero == 0) {
				System.out.println(i);
			}
		}
	}
}
