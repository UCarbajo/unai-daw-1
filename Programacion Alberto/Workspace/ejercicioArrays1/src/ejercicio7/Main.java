package ejercicio7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// que lea 5 numeros enteros y los almacene en un array
		// encuentra y muestra el numero mas alta del array
		Scanner entrada = new Scanner(System.in);
		int[] numero = new int[5];
		int numeroAlto = numero[0];

		System.out.println("Introduce el primer numero");
		numero[0] = entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		numero[1] = entrada.nextInt();
		System.out.println("Introduce el tercer numero");
		numero[2] = entrada.nextInt();
		System.out.println("Introduce el cuarto numero");
		numero[3] = entrada.nextInt();
		System.out.println("Introduce el quinto numero");
		numero[4] = entrada.nextInt();

		// numero.length es 5, representa la informacion maxima que almacena el array
		for (int i = 0; i < numero.length; i++) {
			//Podemos poner i = 1, no necesitamos comparar el mismo numero.
			if (numeroAlto < numero[i]) {
				numeroAlto = numero[i];
			}
		}
		System.out.println("El numero mas alto es " + numeroAlto);

	}

}
