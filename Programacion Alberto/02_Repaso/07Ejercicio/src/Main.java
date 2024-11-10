import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Introduce una contraseña");
			String contraseña = entrada.nextLine();
			
			boolean verificarMayuscula = false;
			boolean verificarMinuscula = false;
			boolean verificarEspecial = false;
			boolean verificarNumero = false;
			
			if (contraseña.contains(" ")) {
				System.out.println("La contraseña contiene valores no validos");
			} else if (contraseña.length() < 8) {
				System.out.println("La longitud de la contraseña es inferior a 0");
			} else {
				for(int i = 0; i < contraseña.length(); i++) {
					if(Character.isUpperCase(contraseña.charAt(i))) {
						verificarMayuscula = true;
					}else if(Character.isLowerCase(contraseña.charAt(i))) {
						verificarMinuscula = true;
					}else if(!Character.isLetterOrDigit(contraseña.charAt(i))) {
						verificarEspecial = true;
					}else if(Character.isDigit(contraseña.charAt(i))) {
						verificarNumero = true;
					}
				}
				if(verificarMayuscula == true && verificarMinuscula == true && verificarEspecial == true && verificarNumero == true) {
					System.out.println("Contraseña valida");
					break;
				} else {
					System.out.println("La contraseña que has introducido no es valida");
				}
			}
		}
		entrada.close();
	}

}
