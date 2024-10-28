import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la altura de la piramide");
		int altura = entrada.nextInt();
		
		int repeticiones = 1;
		for(int i = 0; i < altura; i++) {
			for(int j = 0; j < altura - i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < repeticiones; j++) {
				Random rand = new Random();
				int numeroAleatorio = rand.nextInt(9)+1;
				System.out.print(numeroAleatorio);
			}
			System.out.println();
			repeticiones += 2;	
		}
		
	}

}
