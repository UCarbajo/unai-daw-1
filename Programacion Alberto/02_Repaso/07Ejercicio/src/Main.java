import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Introduce una contrase�a");
			String contrase�a = entrada.nextLine();
			
			boolean verificarMayuscula = false;
			boolean verificarMinuscula = false;
			boolean verificarEspecial = false;
			boolean verificarNumero = false;
			
			if (contrase�a.contains(" ")) {
				System.out.println("La contrase�a contiene valores no validos");
			} else if (contrase�a.length() < 8) {
				System.out.println("La longitud de la contrase�a es inferior a 0");
			} else {
				for(int i = 0; i < contrase�a.length(); i++) {
					if(Character.isUpperCase(contrase�a.charAt(i))) {
						verificarMayuscula = true;
					}else if(Character.isLowerCase(contrase�a.charAt(i))) {
						verificarMinuscula = true;
					}else if(!Character.isLetterOrDigit(contrase�a.charAt(i))) {
						verificarEspecial = true;
					}else if(Character.isDigit(contrase�a.charAt(i))) {
						verificarNumero = true;
					}
				}
				if(verificarMayuscula == true && verificarMinuscula == true && verificarEspecial == true && verificarNumero == true) {
					System.out.println("Contrase�a valida");
					break;
				} else {
					System.out.println("La contrase�a que has introducido no es valida");
				}
			}
		}
		entrada.close();
	}

}
