
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("De cuantas posiciones quieres crear tu array?");
		int longitud = entrada.nextInt();

		System.out.println("Como quieres inicializar tu array");
		System.out.println("1.- Con ceros");
		System.out.println("2.- Con n�meros aleatorios del 1 al 100");
		System.out.println("3.- Insertando los n�meros manualmente.");
		String respuesta = entrada.next();

		int[] array = new int[longitud];

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
				array[i] = rand.nextInt(100) + 1;
			}
		} else if ("3".equals(respuesta)) {
			for (int i = 0; i < array.length; i++) {
				System.out.println("Introduce los numeros en el hueco " + (i + 1));
				array[i] = entrada.nextInt();
			}
		}
		
		entrada.close();
		mostrarArray(array);
		System.out.println();

		String segundaRespuesta;

		do {
			System.out.println("�Qu� quieres hacer con tu array?");
			System.out.println("1.- Cambiar valores de todo el array");
			System.out.println("2.- Cambiar un valor del array");
			System.out.println("3.- Reiniciar el array");
			System.out.println("4.- Mostrar Array");
			System.out.println("0.- Salir");
			segundaRespuesta = entrada.next();

			switch (segundaRespuesta) {
			case "1":
				for (int i = 0; i < array.length; i++) {
					array[i] = entrada.nextInt();
				}
				break;
			case "2":
				System.out.println("Que posicion del array quieres cambiar");
				int posicion = entrada.nextInt();
				System.out.println("Introduce el numero para la posicion " + posicion);
				array[posicion - 1] = entrada.nextInt();
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
				System.out.println();
				break;
			default:	
				System.out.println("Opcion no valida");
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