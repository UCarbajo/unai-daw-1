import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("De cuantas posiciones quieres crear tu array?");
		int longitud = entrada.nextInt();
		int[] array = new int[longitud];
		
		mostrarArray(array);
	}

	private static void mostrarArray(int[] array) {
		System.out.print("El array esta compuesto por [");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i < array.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
		
}