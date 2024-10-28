import java.util.Scanner;

public class Solucion {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la mitad del rombo:");
        int mitad = entrada.nextInt();
        
        int huecos = mitad - 1; // Inicializa los espacios para centrar la parte superior
        int asteriscos = 1; // Empieza con un asterisco en la fila superior

        // Parte superior del rombo
        for (int i = 0; i < mitad; i++) {
            for (int j = 0; j < huecos; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
            System.out.println();
            huecos -= 1;
            asteriscos += 2;
        }

        // Parte inferior del rombo
        huecos = 1;
        asteriscos -= 4;
        for (int i = 0; i < mitad - 1; i++) {
            for (int j = 0; j < huecos; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
            System.out.println();
            huecos += 1;
            asteriscos -= 2;
        }

        entrada.close();
    }

}
