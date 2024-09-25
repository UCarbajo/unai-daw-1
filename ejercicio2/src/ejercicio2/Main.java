package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Tipo de cliente (VIP - Socio - Normal)");
		String tipo = entrada.next();
		System.out.println("Importe compra");
		float importe = entrada.nextFloat();
		float vip = importe - (importe * 0.20f);
		float socio = importe - (importe * 0.05f);

		if (tipo.equals("VIP")) {
			System.out.println(vip);
		} else if (tipo.equals("Socio")) {
			System.out.println(socio);
		} else if (tipo.equals("Normal")) {
			System.out.println("Total " + importe);
		} else {
			System.out.println("Tipo incorrecto");
		}

		entrada.close();

	}

}
