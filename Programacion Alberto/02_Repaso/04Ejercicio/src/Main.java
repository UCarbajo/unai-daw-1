
public class Main {

	public static void main(String[] args) {
		String frase = "yo y tu y el y nosotros pero yo y tu pero el o nosotros";
		String[] resultado = frase.split("[., ]+");
		boolean[] auxiliar = new boolean[resultado.length];

		for (int i = 0; i < resultado.length; i++) {
			int repeticion = 1;

			if (auxiliar[i] == false) {
				auxiliar[i] = true;

				for (int j = i + 1; j < resultado.length; j++) {
					if (auxiliar[j] == false) {
						if (resultado[i].equals(resultado[j])) {
							repeticion++;
							auxiliar[j] = true;
						}
					}
				}
				System.out.println("La palabra " + resultado[i] + " aparece " + repeticion + " vez/veces");
			}
			
		}
	}

}
