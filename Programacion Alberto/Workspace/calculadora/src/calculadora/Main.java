package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un numero");
		int n1 = entrada.nextInt();
		System.out.println("Introduce un numero");
		int n2 = entrada.nextInt();
		System.out.println("Operacion");
		String operacion = entrada.next();
		
		switch(operacion) {
		case "+":
			System.out.println(n1+n2);
			break; //terminal un sontrol de flujo
		case "-":
			System.out.println(n1-n2);
			break;
		case "/":
			System.out.println(n1/n2);
			break;
		case "*":
			System.out.println(n1*n2);
			break;
		case "%":
			System.out.println(n1%n2);
			break;
		default:
			System.out.println("Error");
		}
		entrada.close();
	}

}
