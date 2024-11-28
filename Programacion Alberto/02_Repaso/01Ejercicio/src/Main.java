import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantos numero quieres introducir? ");
		int numeros = entrada.nextInt();
		int[] array = new int[numeros];
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Introduce el numero de la posicion " + i);
			array[i] = entrada.nextInt();
		}
		
		int sumaPositivo = 0;
		double mediaPositivo = 0;
		int sumaNegativo = 0;
		double mediaNegativo = 0;
		
		for(int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				sumaPositivo += array[i];
				mediaPositivo++;
			}else {
				sumaNegativo += array[i];
				mediaNegativo++;
			}
		}
		System.out.println("La suma total de los numeros positivos es " + sumaPositivo + " y la media es " + sumaPositivo/mediaPositivo);
		System.out.println("La suma total de los numeros negativos es " + sumaNegativo + " y la media es " + sumaNegativo/mediaNegativo);
	}

}
