import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		ArrayList<String> listaNombres = new ArrayList<>();

		System.out.println("Introduce una serie de nombres");
		String nombre = entrada.nextLine();
		String[] arrayNombres = nombre.split("[., ]+");

		System.out.println("Introduce una letra");
		char letra = entrada.next().charAt(0);

		for (String c : arrayNombres) {
			if ((c.charAt(0) == Character.toLowerCase(letra)) || (c.charAt(0) == Character.toUpperCase(letra))) {
				listaNombres.add(c);
			}
		}
		if (0 == listaNombres.size()) {
			System.out.println("No hay ningun nombre que empieza por la letra " + letra);
		} else {
			System.out.println("Los nombres que aparecen con la letra " + letra + " son");
			for (int i = 0; i < listaNombres.size(); i++) {
				System.out.print(listaNombres.get(i));
				if (i < listaNombres.size() - 1) {
					System.out.print(", ");
				}
			}
			System.out.println(".");
		}
	}

}
