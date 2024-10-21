import java.util.Random;
import java.util.Scanner;

public class MatrizTemperaturas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el tamaño de la matriz
        System.out.println("Introduce el número de filas de la matriz:");
        int filas = scanner.nextInt();
        while (filas <= 0) {
        	System.out.println("Lo siento, introduce un numero positivo");
        	filas = scanner.nextInt();
        }
        System.out.println("Introduce el número de columnas de la matriz:");
        int columnas = scanner.nextInt();
        while (columnas <= 0) {
        	System.out.println("Lo siento, introduce un valor positivo");
        	columnas = scanner.nextInt();
        }
        
        int[][] matrizTemperaturas = new int[filas][columnas];
        
        Random random = new Random();
        int min = -30;
        int max = 50; 
        
        // Rellenar la matriz con valores aleatorios de temperaturas entre 0 y 100
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {           
                matrizTemperaturas[i][j] = random.nextInt((max - min) + 1) + min;
            }
        }
        
        // Mostrar la matriz
        System.out.println("Matriz de temperaturas:");
        mostrarMatriz(matrizTemperaturas);
        
        // Calcular la temperatura máxima, mínima y el promedio
        int maxTemp = matrizTemperaturas[0][0];
        int minTemp = matrizTemperaturas[0][0];
        double sumaTemp = 0;
        
        for (int i = 0; i < matrizTemperaturas.length; i++) {
            for (int j = 0; j < matrizTemperaturas[0].length; j++) {
                int tempActual = matrizTemperaturas[i][j];
                sumaTemp += tempActual;
                
                if (tempActual > maxTemp)
                    maxTemp = tempActual;
                if (tempActual < minTemp)
                    minTemp = tempActual;
            }
        }
        
        // Mostrar los resultados
        System.out.println("Temperatura máxima: " + maxTemp);
        System.out.println("Temperatura mínima: " + minTemp);
        System.out.println("Temperatura promedio: " + (sumaTemp / (filas * columnas)));
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}