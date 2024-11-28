import java.util.Random;

public class Operaciones {
	
	public static int suma(int num1, int num2) {
		int total = num1+num2;
		return total;
	}
	public static int resta(int num1, int num2) {
		int total = num1-num2;
		return total;
	}
	public static int multiplicar(int num1, int num2) {
		int total = num1*num2;
		return total;
	}
	public static double media(int[] array) {
		int suma = 0;
		for(int i = 0;i < array.length;i++) {
			suma += array[i];
		}
		double total = suma/array.length;
		return total;
	}
	public static int numeroAlto(int[] array) {
		int mayor = array[0];
		for(int numero: array) {
			if (mayor < numero) {
				mayor = numero;
			}
		}
		return mayor;
	}
	public static int numeroBajo(int[] array) {
		int menor = array[0];
		for(int numero: array) {
			if (menor > numero) {
				menor = numero;
			}
		}
		return menor;
	}
	public static int factorial(int num) {
		int total = num;
		for(int i = 1; i < num; i++) {
			total *= i;
		}
		return total;
	}
	public static boolean esImpar(int num) {
		boolean verificador = false;
		if((num%2) == 1) {
			verificador = true;
		}
		return verificador;
	}
	public static boolean esPrimo(int num) {
		boolean verificador = false;
		if((num%2) == 0) {
			verificador = true;
		} 
		return verificador;
	}
	public static int[][] matriz(int filas, int columnas) {
		int[][] matriz = new int[filas][columnas];
		Random ramon = new Random();
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = ramon.nextInt(100);
			}
		}
		return matriz;
	}

}
