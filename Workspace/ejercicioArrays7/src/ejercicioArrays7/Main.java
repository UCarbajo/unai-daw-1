package ejercicioArrays7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int [][] numero = new int [3][3];
		
		for(int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
			System.out.println("Introduce el numero de la columna " + i + " fila " + j);
			numero[i][j] = entrada.nextInt();
			}
		} 
	}

}
