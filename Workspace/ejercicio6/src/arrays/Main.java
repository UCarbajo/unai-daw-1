package arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String[] mes = { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		System.out.println("Introduce el numero de mes:");
		int numeroMes = entrada.nextInt();

		if (numeroMes > 0 && numeroMes <= 12) {
			System.out.println(mes[numeroMes]);
		} else {
			System.out.println("Mes incorrecto. Introduzca un numero entre el 1-12");
		}
	}

}
