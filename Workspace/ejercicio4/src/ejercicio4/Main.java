package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//System.out.println("Introduce un numero");
		//int numero = entrada.nextInt();
		for (int i = 1; i<= 10; i++) {
			System.out.println();
			System.out.println("Tabla del "+ i);
			System.out.println();
			for (int o = 1 ; o <= 10; o++){
			System.out.println("Multiplicar " + i + " x " + o + " = " + (i*o));
			}
		}
	}

}
