import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el tamaño del array ");
		int numeros = entrada.nextInt();
		int[][] array = new int[numeros][numeros];
		
		Random ramon = new Random();
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = ramon.nextInt(100)+1;
			}
		}
		mostrarArray(array);
		System.out.println();
		
		int sumaDiagonal = 0;
		for(int i = 0; i < array.length; i++) {
			sumaDiagonal += array[i][i];
		}
		System.out.println("La suma de la diagonal es " + sumaDiagonal);
	}

	public static void mostrarArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print("[ ");
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
				if(j < array[i].length - 1) {
					System.out.print(", ");
				}else {
					System.out.print(" ]");
				}
			}
			System.out.println();
		}
	}
}
