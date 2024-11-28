import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero secreto entre el 1 al 100");
		int numeroSecreto = entrada.nextInt();
		
		while(true) {
			if(numeroSecreto > 1 && numeroSecreto < 100) {
				break;
			}else {
				System.out.println("Introduce un numero valido entre el 1 al 100");
				numeroSecreto = entrada.nextInt();
			}
		}
		
		int numero;
		int intentos = 0;
		
		do {
			System.out.println("Acierta el numero secreto");
			numero = entrada.nextInt();
			
			if (numero < numeroSecreto) {
				System.out.println("Mas alto");
				System.out.println();
				intentos++;
			}else if(numero > numeroSecreto){
				System.out.println("Mas bajo");
				System.out.println();
				intentos++;
			}
			
		}while(numero != numeroSecreto);
		
		System.out.println("Has acertado!");
		System.out.println("El total de intentos ha sido: " + intentos);
	}

}
