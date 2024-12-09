package Aplicacion;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import Juego.excepciones.JuegoException;
import Juego.interfaces.*;
import Juego.letras.JuegoAhorcado;
import Juego.numeros.*;
import Juego.pelea.JuegoPelea;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		try {
			do {
				IJugable partida = eligeJuego();

				partida.muestraNombre();
				partida.muestraInfo();
				partida.juega();

				System.out.println("¿Quieres seguir jugando?");
				System.out.println("1. SI!");
				System.out.println("2. No...");
				opcion = entrada.nextInt();

			} while (opcion != 2);
		} catch (JuegoException e) {
			e.getMessage();
		}
		System.out.println("Fin del juego");
		entrada.close();
	}

	public static IJugable eligeJuego() throws JuegoException {
		Vector<IJugable> vector = new Vector<>(3, 2);
		infoVector(vector);

		vector.add(new JuegoAdivinaNumero(3));
		vector.add(new JuegoAdivinaPar(3));
		vector.add(new JuegoAdivinaImpar(3));
		infoVector(vector);

		vector.add(new JuegoAhorcado(3, "palabrear"));
		infoVector(vector);
		vector.add(new JuegoPelea(3));

		Scanner entrada = new Scanner(System.in);
		int opcion = 0;

		do {

			System.out.println("Elije el juego que quieres jugar");
			System.out.println("1. El juego de ADIVINA EL NUMERO");
			System.out.println("2. El juego de ADIVINA EL NUMERO PAR");
			System.out.println("3. El juego de ADIVINA EL NUMERO IMPAR");
			System.out.println("4. El juego del AHORCADO");
			System.out.println("5. El juego de las PELEAS");

			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				return vector.get(0);
			case 2:
				return vector.get(1);
			case 3:
				return vector.get(2);
			case 4:
				return vector.get(3);
			case 5:
				return vector.get(4);
			}
			entrada.close();
		} while (true);
	}

	public static void infoVector(Vector<IJugable> vector) {
		System.out.println("Capacidad: " + vector.capacity());
		System.out.println("Tamaño: " + vector.size());

	}
}
