import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Elige el tipo de árbol (1.- Árbol o 2.- Arbol de navidad):");
		int opcion = entrada.nextInt();
		System.out.println("Introducde la altura del árbol:");
		int altura = entrada.nextInt();
		
		int[] arrayPrincipal = new int[altura];
		int suma = 1;
		switch (opcion) {
		case 1:
			for (int i = 0; i <= arrayPrincipal.length ; i++) {
				int[] arrayAltura = new int[altura];
				int[] arrayLongitud = new int[suma];
				for (int j = 0; j < arrayAltura.length; j++) {
					if (0 == arrayAltura[j]) {
						System.out.print(" ");
					}
				}
				for(int j = 0; j < arrayLongitud.length; j++) {
					if (0 == arrayLongitud[j]) {
						System.out.print("*");
					}
				}
				System.out.println();
				suma += 2;
				altura -= 1;
			}
			break;
		case 2:
			for (int i = 0; i <= arrayPrincipal.length ; i++) {
				int[] arrayAltura = new int[altura];
				int[] arrayLongitud = new int[suma];
				for (int j = 0; j < arrayAltura.length; j++) {
					if (0 == arrayAltura[j]) {
						System.out.print(" ");
					}
				}
				for(int j = 0; j < arrayLongitud.length; j++) {
					Random rand = new Random();
					arrayLongitud[j] = rand.nextInt(2);
					if (0 == arrayLongitud[j]) {
						System.out.print(arrayLongitud[j]);
					}else if (1 == arrayLongitud[j]) {
						System.out.print("*");
					}
				}
				System.out.println();
				suma += 2;
				altura -= 1;
			}
			break;
		}
	}
}
