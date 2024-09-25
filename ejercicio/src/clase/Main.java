package clase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce nombre alumno");
		String nombre = entrada.next();
		System.out.println("Nota matematicas");
		float n1 = entrada.nextFloat();
		System.out.println("Nota ingles");
		float n2 = entrada.nextFloat();
		System.out.println("Nota castellano");
		float n3 = entrada.nextFloat();
		System.out.println("Nota euskera");
		float n4 = entrada.nextFloat();
		System.out.println("Nota ciencia");
		float n5 = entrada.nextFloat();
		float media = (n1 + n2 + n3 + n4 + n5) / 5;

		if (media >= 5) {
			System.out.println("El alumno " + nombre + " tiene una media de " + media + " y es apto");
		} else {
			System.out.println("El alumno " + nombre + " tiene una media de " + media + " y no es apto");

		}

		entrada.close();

	}

}
