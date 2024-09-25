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
		/*if (edad >= 18) {
			System.out.println("Acceso permitido");
		} else {
			System.out.println("Acceso denegado");
		}*/
		
		if(edad >= 16 && edad < 18) {
			System.out.println("Acceso permitido con tutor");
		}else if (edad >= 18) {
			System.out.println("Acceso permitido");
		}else {
			System.out.println("Acceso denegado");
		}
		
		/*if(edad >= 16 && edad < 18) {
			System.out.println("Acceso permitido con tutor");
		}
		if (edad >= 18) {
			System.out.println("Acceso permitido");
		}
		if (edad < 18) {
			System.out.println("Acceso denegado");
		}*/
		
		System.out.println("Introduce la incial del dia de la semana:");
		String dia = entrada.next();
		
		switch(dia) {
		case "l":
			System.out.println("Lunes");
			break; //terminal un sontrol de flujo
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
		}
		// Repetitivas - bucles
	}
