package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tipo de cliente (VIP - Socio - Normal)");
		String tipo = entrada.next().toLowerCase();
		System.out.println("Importe");
		float total = entrada.nextFloat();
		
		switch (tipo) {
		case "vip":
			System.out.println(total -(total*0.20));
			break;
		case "socio":
			System.out.println(total - (total*0.05));
			break;
		case "normal":
			System.out.println(total);
		default:
			System.out.println("Error. Tipo de cliente incorrecto");
		}

		/*System.out.println("Tipo de cliente (VIP - Socio - Normal)");
		String tipo = entrada.next().toLowerCase();
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
		}*/

		entrada.close();

	}

}
