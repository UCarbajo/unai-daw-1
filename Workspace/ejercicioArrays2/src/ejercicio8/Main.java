package ejercicio8;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		//10 notas por teclado
		//sacar media
		Scanner entrada = new Scanner(System.in);
		float [] nota = new float[10];
		
		System.out.println("Introduce la primera nota");
		nota[0] = entrada.nextFloat();
		System.out.println("Introduce la segunda nota");
		nota[1] = entrada.nextFloat();
		System.out.println("Introduce la tercera nota");
		nota[2] = entrada.nextFloat();
		System.out.println("Introduce la cuarta nota");
		nota[3] = entrada.nextFloat();
		System.out.println("Introduce la quinta nota");
		nota[4] = entrada.nextFloat();
		System.out.println("Introduce la sexta nota");
		nota[5] = entrada.nextFloat();
		System.out.println("Introduce la septima nota");
		nota[6] = entrada.nextFloat();
		System.out.println("Introduce la octava nota");
		nota[7] = entrada.nextFloat();
		System.out.println("Introduce la novena nota");
		nota[8] = entrada.nextFloat();
		System.out.println("Introduce la decima nota");
		nota[9] = entrada.nextFloat();
		
		float media = 0;
		for (int i = 0; i < nota.length; i++) {
			media = nota[i] + media;
		}
		System.out.println("La nota media es " + media/nota.length);

	}

}
