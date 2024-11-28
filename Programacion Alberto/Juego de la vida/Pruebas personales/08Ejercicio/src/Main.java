
public class Main {
    public static void main(String[] args) {
    	
   int numero = 1234543342;
   int totalNumeros = numerosTotales(numero);
   int totalInvertido = numerosInvertidos(numero);
   System.out.println(totalNumeros);
   System.out.println(totalInvertido);
    }
    public static int numerosTotales(int n) {
    	int totales = 0;
    	if(n == 0) {
    		return 0;
    	}else {
    		totales = numerosTotales(n/10);
    		return totales+1;
    	}
    }
    public static int numerosInvertidos(int n) {
    	int total = 0;
    	if(n == 0) return 0;
    	total = total + numerosInvertidos(n % 10);
    	return total;
    }
}