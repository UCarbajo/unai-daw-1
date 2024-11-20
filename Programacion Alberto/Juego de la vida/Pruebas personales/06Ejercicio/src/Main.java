import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = entrada.nextLine();
		
		frase = frase.replace(" ", "");
		System.out.println(frase);
		
	
	}

}
