package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//introducir una palabra
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = entrada.nextLine();
		String palabraSinEspacios = "";
		String nombreDos = "";
		
		//quitar espacios a frases
		for (int i = 0; i > nombre.length(); i++) {
			if (nombre.charAt(i) != ' ') {
				palabraSinEspacios = palabraSinEspacios + nombre.charAt(i);
			}
		}
		System.out.println(palabraSinEspacios);
		
		//dar la vuelta a esa palabra
		for (int i = nombre.length()-1; i >= 0; i--) {
			nombreDos = nombreDos + nombre.charAt(i);
		}
		//for (int i = 0; i < nombre.length(); i++) {
		//	nombreDos = nombre.charAt(i) + nombreDos;
		//}
		
		//comprar la palabra y la palabra al reves
		if (nombre.equalsIgnoreCase(nombreDos)) {
			System.out.println("Palindromo");
		} else {
			System.out.println("No palindromo, tonto");
		}

	}

}
