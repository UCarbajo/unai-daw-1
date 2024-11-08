import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una contraseña");
		String contraseña = entrada.next();
		String[] arrayContraseña = contraseña.split("");
		boolean[] verificador = new boolean[arrayContraseña.length];

		for (int i = 0; i < arrayContraseña.length; i++) {
			if(arrayContraseña)
		}
		
		if (arrayContraseña.length < 8) {
			System.out.println("La contraseña introducida no es valida");
		}
	}

}
