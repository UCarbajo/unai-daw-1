package ejercicioArrays10;

public class Main {

	public static void main(String[] args) {
		int[][] numero = {  { 1, 2, 3, 10}, 
							{ 4, 5, 6, 11} , 
							{ 7, 8, 9, 12} };

		//for (int i = 0; i < numero.length; i++) {
			//for (int j = 0; j < numero.length; j++) {
				//int aux = 0;
				//aux = numero[j][i];
				//numero[j][i] = numero[i][j];
				//numero[i][j] = aux;
			//}
		//}
		
		int[][] aux = new int [numero[0].length][numero.length];
		
		for(int i = 0; i < numero.length; i++) {
			for( int j = 0; j < numero[i].length; j++) {
				aux[j][i] = numero[i][j];
			}
		}
		
		for (int i = 0; i < aux.length; i++) {
			for (int j = 0; j < aux[0].length; j++) {
				System.out.print(aux[i][j] + " ");
			}
			System.out.println();
		}
	}

}
