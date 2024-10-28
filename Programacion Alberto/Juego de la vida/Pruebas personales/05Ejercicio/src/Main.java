import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero positivo");
		int numeroCompleto = entrada.nextInt();
		int numero = numeroCompleto;
		int acumulador = 0;

		int par = 0;
		int impar = 0;

		while (numero != 0) {
			acumulador = numero % 10;
			int division = acumulador%2;
			if (division == 0) {
				par++;
			} else {
				impar++;
			}
			numero /= 10;
		}
		
		System.out.println("En el numero " + numeroCompleto + " hay " + par + " pares y " + impar+ " impares.");
	}

}
