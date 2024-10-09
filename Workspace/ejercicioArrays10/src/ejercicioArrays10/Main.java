package ejercicioArrays10;

public class Main {

	public static void main(String[] args) {
		int[][] numero = {  { 1, 2, 3 }, 
							{ 4, 5, 6 }, 
							{ 7, 8, 9 } };

		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; i++) {
				int aux = 0;
				aux = numero[j][i+1];
				numero[j][i+1] = numero[i+1][j];
				numero[i+1][j] = aux;
			}
		}
	}

}
