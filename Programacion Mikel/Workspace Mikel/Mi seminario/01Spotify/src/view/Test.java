package view;

public class Test {

	public static void main(String[] args) {
		
		//sumar(2,5);
		int total = sumar(2,5);
		sumar(total,5);
		sumar(total,5);
	}
	
	public static int sumar(int primerNumero, int segundoNumero) {
		
		int resultado = primerNumero + segundoNumero;
		return resultado;
		
		//System.out.println("Resultado = "+(primerNumero+segundoNumero));
		
	}

}
