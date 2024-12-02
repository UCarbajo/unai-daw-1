package Juego.pelea;

import java.util.Scanner;

import Juego.Juego;
import Juego.excepciones.JuegoException;
import Juego.interfaces.IJugable;
import Juego.pelea.Personajes;

public class JuegoPelea extends Juego implements IJugable {

	Scanner entrada = new Scanner(System.in);
	private Personajes clase;

	public JuegoPelea(int vidas) {
		super(vidas);
	}

	@Override
	public void juega() throws JuegoException {
		reiniciarPartida();

		Personajes elfo = new Personajes("Elfo", 80, 15, 5);
		Personajes enano = new Personajes("Enano", 70, 10, 25);
		Personajes humano = new Personajes("Humano", 100, 8, 15);

		while (true) {
			System.out.println("Elige el personaje con el que quieres jugar");
			System.out.println("1. Elfo");
			System.out.println("2. Enano");
			System.out.println("3. Humano");

			int opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				clase = elfo;
				break;
			case 2:
				clase = enano;
				break;
			case 3:
				clase = humano;
				break;
			}

			clase.atacar(enano);
			System.out.println(enano.getSalud());
			System.out.println(clase.getSalud());
		}

	}

	@Override
	public void muestraVidasRestantes() {
		// TODO Auto-generated method stub
		super.muestraVidasRestantes();
	}

	@Override
	public void muestraNombre() {
		System.out.println("El juego de PELEAS");
	}

	@Override
	public void muestraInfo() {
		System.out.println("Pelea contra varios enemigos y derrotalos");

	}

}
