import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una contrase�a");
		String contrase�a = entrada.next();
		String[] arrayContrase�a = contrase�a.split("");
		boolean[] verificador = new boolean[arrayContrase�a.length];

		for (int i = 0; i < arrayContrase�a.length; i++) {
			if(arrayContrase�a)
		}
		
		if (arrayContrase�a.length < 8) {
			System.out.println("La contrase�a introducida no es valida");
		}
	}

}
