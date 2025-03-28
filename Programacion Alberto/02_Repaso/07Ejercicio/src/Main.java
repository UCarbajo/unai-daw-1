import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Introduce una contraseņa");
			String contraseņa = entrada.nextLine();
			
			boolean verificarMayuscula = false;
			boolean verificarMinuscula = false;
			boolean verificarEspecial = false;
			boolean verificarNumero = false;
			
			if (contraseņa.contains(" ")) {
				System.out.println("La contraseņa contiene valores no validos");
			} else if (contraseņa.length() < 8) {
				System.out.println("La longitud de la contraseņa es inferior a 0");
			} else {
				for(int i = 0; i < contraseņa.length(); i++) {
					if(Character.isUpperCase(contraseņa.charAt(i))) {
						verificarMayuscula = true;
					}else if(Character.isLowerCase(contraseņa.charAt(i))) {
						verificarMinuscula = true;
					}else if(!Character.isLetterOrDigit(contraseņa.charAt(i))) {
						verificarEspecial = true;
					}else if(Character.isDigit(contraseņa.charAt(i))) {
						verificarNumero = true;
					}
				}
				if(verificarMayuscula == true && verificarMinuscula == true && verificarEspecial == true && verificarNumero == true) {
					System.out.println("Contraseņa valida");
					break;
				} else {
					System.out.println("La contraseņa que has introducido no es valida");
				}
			}
		}
		entrada.close();
	}

}
