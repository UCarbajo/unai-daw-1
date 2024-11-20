package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainRunTimeException {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		try {
			
		System.out.println("Introduce un numero:");
		int num1 = entrada.nextInt();
		System.out.println("Introduce un numero:");
		int num2 = entrada.nextInt();

		System.out.println("La division de los numeros es: " + num1/num2 );
		
		int[] array = {1,2};
		array[4] = 6;
		
		} catch(ArithmeticException | InputMismatchException e) { 
			// el OR se pone con una barra | no con ||
			//No es necesario identficiar el tipo de Exception, si pones solo Exception e, te lo agrupa en uno solo.
			//Exception Malo, no usar.
			System.out.println("No se puede dividir por cero, melón");
		}catch(Exception e){ //Exception siempre al final de todos los catch
			System.out.println("Error: " + e.getLocalizedMessage());
		}finally { //Esta linea de codigo siempre se ejecutara, aunque de error.
			entrada.close();
		}
		
		System.out.println("Fin del juego");
		
		

	}

}
