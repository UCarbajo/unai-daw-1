import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		String tipoFuncion;
		
		System.out.println("Introduce el primer numero");
		numero1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		numero2 = entrada.nextInt();
		System.out.println("Introduce la funcion");
		tipoFuncion = entrada.next();
		
		while(!"+".equals(tipoFuncion) && !"-".equals(tipoFuncion) && !"*".equals(tipoFuncion) && !"/".equals(tipoFuncion) ) {
			System.out.println("Introduce un valor correcto (+, -, *, /)");
			tipoFuncion = entrada.next();
		}
		
		calculadora(numero1, numero2, tipoFuncion);
	}
	
	static void calculadora(int primerNumero, int segundoNumero, String tipoFuncion) {
		switch(tipoFuncion){
		case "+":
			System.out.println(primerNumero+segundoNumero);
			break;
		case "-":
			System.out.println(primerNumero-segundoNumero);
			break;
		case "*":
			System.out.println(primerNumero*segundoNumero);
			break;
		case "/":
			System.out.println(primerNumero/segundoNumero);
			break;
		}
	}
}