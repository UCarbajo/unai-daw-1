import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la mitad del rombo");
		int mitad = entrada.nextInt();
		
		int huecos = mitad;
		int aux = mitad;
		int asteriscos = 1;
		for (int i = 0; i < (mitad/2)+1; i++) {
			for(int j = 0; j < huecos; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < asteriscos; j++) {
				System.out.print("*");
			}
			System.out.println();
			huecos -= 1;
			asteriscos += 2;
		}
		mitad = aux;
		for (int i = 0; i < (mitad/2)+huecos; i++) {
			for(int j = 0; j < huecos; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < asteriscos; j++) {
				System.out.print("*");
			}
			System.out.println();
			huecos += 1;
			asteriscos -= 2;
			if(asteriscos <= 0) {
				break;
			}
		}
	}

}
