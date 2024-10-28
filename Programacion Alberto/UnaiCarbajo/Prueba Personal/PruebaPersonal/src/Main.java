import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		System.out.println("Ingresa valores a la matriz:");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j <matriz[i].length; j++) {
				System.out.println("Elemento " + "[" + i + "][" + j + "]:" );
				matriz[i][j] = entrada.nextInt();
			}
		}
		System.out.println();
		System.out.println("Suma de las filas:");
		for(int i = 0; i < matriz.length; i++) {
			int suma = 0;
			for(int j = 0; j <matriz[i].length; j++) {
				suma += matriz[i][j];
			}
			System.out.println("Suma de la fila " + i + ": " + suma);
		}
		System.out.println();
		System.out.println("Suma de las filas:");
		for(int i = 0; i < matriz.length; i++) {
			int suma = 0;
			for(int j = 0; j <matriz[i].length; j++) {
				suma += matriz[j][i];
			}
			System.out.println("Suma de la columna " + i + ": " + suma);
		}
		System.out.println();
		int sumaTotal = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j <matriz[i].length; j++) {
				sumaTotal += matriz[i][j];
			}
		}
		System.out.println("Suma total de todos los elementos: " + sumaTotal);
	}

}
