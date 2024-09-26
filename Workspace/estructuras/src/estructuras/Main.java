package estructuras;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ESTRUCTURA CONTROL DE FLUJO

		// Condicionales
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu edad: ");
		int edad = entrada.nextInt();

		// edad >= 18
		// Acceso permitido
		/*
		 * if (edad >= 18) { System.out.println("Acceso permitido"); } else {
		 * System.out.println("Acceso denegado"); }
		 */

		if (edad >= 16 && edad < 18) {
			System.out.println("Acceso permitido con tutor");
		} else if (edad >= 18) {
			System.out.println("Acceso permitido");
		} else {
			System.out.println("Acceso denegado");
		}

		/*
		 * if(edad >= 16 && edad < 18) {
		 * System.out.println("Acceso permitido con tutor"); } if (edad >= 18) {
		 * System.out.println("Acceso permitido"); } if (edad < 18) {
		 * System.out.println("Acceso denegado"); }
		 */

		System.out.println("Introduce la incial del dia de la semana:");
		String dia = entrada.next();

		switch (dia) {
		case "l":
			System.out.println("Lunes");
			break; // terminal un sontrol de flujo
		case "m":
			System.out.println("Martes");
			break;
		case "x":
			System.out.println("Miercoles");
			break;
		case "j":
			System.out.println("Jueves");
			break;
		case "v":
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Dia no valido");
		}
		// Repetitivas - bucles (for, while, do..while)
		// for(iniciaalizacion (variables);condicion;cadaVuelta)
		for (int i = 0; i < 10; i++) {
			System.out.println("Mensaje " + i);
		}

		System.out.println("Introdu tu nombre");
		String nombre = entrada.next();

		nombre.length();
		for (int i = 0; i < nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}

		for (int i = nombre.length() - 1; i >= 0; i--) {
			System.out.println(nombre.charAt(i));

		}

		// while(condicion)

		int numeroOculto = (int) (Math.random() * 10) + 1;

		while (true) {
			System.out.println("Introduce un numero");
			int numeroUsuario = entrada.nextInt();
			
			if (numeroUsuario == numeroOculto) {
				System.out.println("Has ganado");
				break;
			}
		}

		}

	}

