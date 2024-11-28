package Aplicacion;

import java.util.Random;
import java.util.Scanner;

import Juego.interfaces.*;
import Juego.numeros.*;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		
		do {
		IJugable partida = eligeJuego();
		
		partida.muestraNombre();
		partida.muestraInfo();
		partida.juega();
		
		System.out.println("¿Quieres seguir jugando?");
		System.out.println("1. SI!");
		System.out.println("2. No...");
		opcion = entrada.nextInt();
		
		}while(opcion != 2);
	}

	public static IJugable eligeJuego() {
		Random ramon = new Random();

		JuegoAdivinaNumero juegoAdivinar = new JuegoAdivinaNumero(3, ramon.nextInt(11));
		JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3, ramon.nextInt(11));
		JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3, ramon.nextInt(11));

		IJugable[] juegos = new IJugable[3];
		juegos[0] = juegoAdivinar;
		juegos[1] = juegoPar;
		juegos[2] = juegoImpar;
		
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		
		do {
			
			System.out.println("Elije el juego que quieres jugar");
			System.out.println("1. El juego de ADIVINA EL NUMERO");
			System.out.println("2. El juego de ADIVINA EL NUMERO PAR");
			System.out.println("3. El juego de ADIVINA EL NUMERO IMPAR");

			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				return juegos[0];
			case 2:
				return juegos[1];
			case 3:
				return juegos[2];
			}
			
		} while (true);
	}
	
}
