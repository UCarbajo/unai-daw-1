import java.util.Scanner;

public class App extends Operaciones {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int opcion = 0;
		do {
			System.out.println("Selecciona una operación:");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Media de un array");
			System.out.println("5. Numero mas alto en un array");
			System.out.println("6. Numero mas bajo en un array");
			System.out.println("7. Factorial");
			System.out.println("8. Comprobar si es impar");
			System.out.println("9. Comprobar si es primo");
			System.out.println("10. Crear una matriz NxM con numeros aleatorios");
			System.out.println("0. Salir");
			opcion = entrada.nextInt();
			int num1 = 0;
			int num2 = 0;
			int[] array = new int[0];

			switch (opcion) {
			case 1:
				System.out.println("Introduce el primer número:");
				num1 = entrada.nextInt();
				System.out.println("Introduce el segundo número:");
				num2 = entrada.nextInt();
				System.out.println("Resultado: " + suma(num1, num2));
				break;
			case 2:
				System.out.println("Introduce el primer número:");
				num1 = entrada.nextInt();
				System.out.println("Introduce el segundo número:");
				num2 = entrada.nextInt();
				System.out.println("Resultado: " + resta(num1, num2));
				break;
			case 3:
				System.out.println("Introduce el primer número:");
				num1 = entrada.nextInt();
				System.out.println("Introduce el segundo número:");
				num2 = entrada.nextInt();
				System.out.println("Resultado: " + multiplicar(num1, num2));
				break;
			case 4:
				array = crearArray(entrada);
				System.out.println("Media " + media(array));
				break;
			case 5:
				array = crearArray(entrada);
				System.out.println("Numero mas alto " + numeroAlto(array));
				break;
			case 6:
				array = crearArray(entrada);
				System.out.println("Numero mas bajo " + numeroBajo(array));
				break;
			case 7:
				System.out.println("Introduce el número:");
				num1 = entrada.nextInt();
				System.out.println("El factorial del numero: " + num1 + " es " +factorial(num1));
				break;
			case 8:
				System.out.println("Introduce elnúmero:");
				num1 = entrada.nextInt();
				System.out.println("¿Es impar?: " + esImpar(num1));
				break;
			case 9:
				System.out.println("Introduce el número:");
				num1 = entrada.nextInt();
				System.out.println("¿Es primo?: " + esPrimo(num1));
				break;
			case 10:
				System.out.println("Introduce el numero de filas");
				num1 = entrada.nextInt();
				System.out.println("Introduce el numero de columnas");
				num2 = entrada.nextInt();
				
				int[][] mostrarArray = matriz(num1, num2);
				for(int i = 0; i < mostrarArray.length; i++) {
					for(int j = 0; j < mostrarArray[i].length; j++) {
						System.out.print(mostrarArray[i][j] + " ");
					}
					System.out.println();
				}
				break;
			default:
				System.out.println("Adios...");
				break;
			}
			System.out.println();
		} while (opcion != 0);

	}

	private static int[] crearArray(Scanner entrada) {
		int tamaño;
		int[] array;
		System.out.println("Ingresa el tamaño del array:");
		tamaño = entrada.nextInt();
		array = new int[tamaño];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Numero " + (i + 1));
			array[i] = entrada.nextInt();
		}
		return array;
	}

}
