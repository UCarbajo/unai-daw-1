import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 2, 4, 5, 2, 4, 3, 4, 4, 5, 6, 2};
		boolean[] auxiliar = new boolean[array.length];
		int numeroMayor = 0;
		ArrayList<Integer> listaArray = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			int comprobador = 0;
			if (auxiliar[i] == false) {
				auxiliar[i] = true;
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] == array[j]) {
						auxiliar[j] = true;
						comprobador++;
					}
				}
				if(numeroMayor == comprobador) {
					listaArray.add(array[i]);
				}else if (numeroMayor < comprobador) {
					listaArray.clear();
					listaArray.add(array[i]);
					numeroMayor = comprobador;
				}
			}
		}
		for(int i = 0; i < listaArray.size(); i++) {
		System.out.println("La moda del array es el numero " + listaArray.get(i));
		
		}
	}

}
