
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("De cuantas posiciones quieres crear tu array?");
		int longitud = 0;

		while (true) {
			if (entrada.hasNextInt()) {
				longitud = entrada.nextInt();
				if (longitud > 1 ) {
					break;
				} else {
					System.out.println("Introduce un valor mayor o igual a 2");
				}
			} else {
				System.out.println("Introduce un numero correcto");
				entrada.next();
			}
		}
		int[] array = new int[longitud];

		System.out.println("Como quieres inicializar tu array");
		System.out.println("1.- Con ceros");
		System.out.println("2.- Con n�meros aleatorios del 1 al 100");
		System.out.println("3.- Insertando los n�meros manualmente.");
		String respuesta = entrada.next();

		while (!"1".equals(respuesta) && !"2".equals(respuesta) && !"3".equals(respuesta)) {
			System.out.println("Respuesta no valida, seleccione una de las siguientes");
			System.out.println("1.- Con ceros");
			System.out.println("2.- Con n�meros aleatorios del 1 al 100");
			System.out.println("3.- Insertando los n�meros manualmente.");
			respuesta = entrada.next();
		}

		if ("2".equals(respuesta)) {
			Random rand = new Random();
			for (int i = 0; i < array.length; i++) {
				array[i] = rand.nextInt(100)+1;
			}
		} else if ("3".equals(respuesta)) {
			for (int i = 0; i < array.length; i++) {
				System.out.println("Introduce los numeros en el hueco " + (i + 1));
				array[i] = entrada.nextInt();
			}
		}

		mostrarArray(array);
		System.out.println();

		String segundaRespuesta;
		do {
		
		System.out.println("�Qu� quieres hacer con tu array?");
		System.out.println("1.- Cambiar valores de todo el array");
		System.out.println("2.- Cambiar un valor del array");
		System.out.println("3.- Reiniciar el array");
		System.out.println("4.- Mostrar Array");
		System.out.println("5.- Suma");
		System.out.println("6.- Multiplicaci�n");
		System.out.println("7.- Media");
		System.out.println("8.- Factorial de cada valor");
		System.out.println("9.- Ordenar de menor a mayor");
		System.out.println("10.- Ordenar de mayor a menor");
		System.out.println("0.- Salir");
		segundaRespuesta = entrada.next();

		System.out.println("");

		switch (segundaRespuesta) {
		case "1":
			for (int i = 0; i < array.length; i++) {
				array[i] = entrada.nextInt();
			}
			mostrarArray(array);
			break;
		case "2":
			System.out.println("Que posicion del array quieres cambiar");
			int posicion = entrada.nextInt();
			System.out.println("Introduce el numero para la posicion " + posicion);
			array[posicion - 1] = entrada.nextInt();
			mostrarArray(array);
			break;
		case "3":
			//array = new int[longitud];
			System.out.println("Estas seguro que equieres eliminar los numeros del array? (S/N)");
			String borradoRespuesta = entrada.next();
			if ("S".equals(borradoRespuesta.toUpperCase())) {
				for (int i = 0; i < array.length; i++) {
					array[i] = 0;
				}
			}
			break;
		case "4":
			mostrarArray(array);
			break;
		case "5":
			int suma = 0;
			for (int i = 0; i < array.length; i++) {
				suma += array[i];
			}
			System.out.println("La suma del array es " + suma);
			break;
		case "6":
			int multiplicar = 1;
			for (int i = 0; i < array.length; i++) {
				multiplicar *= array[i];
			}
			System.out.println("La multiplicaci�n del array es " + multiplicar);
			break;
		case "7":
			int sumaMedia = 0;
			for (int i = 0; i < array.length; i++) {
				sumaMedia += array[i];
			}
			System.out.println("La media del array es " + (sumaMedia / longitud));
			break;
		case "8":
			for (int i = 0; i < array.length; i++) {
				BigInteger factorial;
				factorial = BigInteger.valueOf(1);
				for (int j = 1; j <= array[i]; j++) {
					factorial = factorial.multiply(BigInteger.valueOf(j));
				}
				System.out.println("El factorial numero " + array[i] + " es " + factorial);
			}
			break;
		case "9":
			//Arrays.short(array);
			int menor = 0;
			for (int i = 0; i < array.length; i++) {
				for (int j = i; j < array.length; j++) {
					if (array[i] > array[j]) {
						menor = array[i];
						array[i] = array[j];
						array[j] = menor;
					}
				}
			}
			break;
		case "10":
			int mayor = 0;
			for (int i = 0; i < array.length; i++) {
				for (int j = i; j < array.length; j++) {
					if (array[i] < array[j]) {
						mayor = array[i];
						array[i] = array[j];
						array[j] = mayor;
					}
				}
			}
			break;
		default:
			if (!"0".equals(segundaRespuesta))
			System.out.println("Opcion no valida");
			System.out.println();
		}
		} while (!"0".equals(segundaRespuesta));
		System.out.println("Adios . . . .");
	}

	private static void mostrarArray(int[] array) {
		System.out.print("El array esta compuesto por [");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}