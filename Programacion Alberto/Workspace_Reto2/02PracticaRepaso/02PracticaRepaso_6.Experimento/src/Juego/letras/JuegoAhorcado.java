package Juego.letras;

import java.util.Arrays;
import java.util.Scanner;

import Juego.Juego;
import Juego.excepciones.JuegoException;
import Juego.interfaces.IJugable;

public class JuegoAhorcado extends Juego implements IJugable {
	Scanner entrada = new Scanner(System.in);

	String palabraAdivinar;

	public JuegoAhorcado(int vidas, String palabraAdivinar) {
		super(vidas);
		this.palabraAdivinar = palabraAdivinar;
	}

	@Override
	public void juega() throws JuegoException {
		super.reiniciarPartida();

		try {
			for (int i = 0; i < this.palabraAdivinar.length(); i++) {
				if (Character.isDigit(this.palabraAdivinar.charAt(i))) {
					throw new JuegoException("La palabra contiene numeros");
				}
			}
		} catch (JuegoException e) {
			System.out.println("Error: " + e.getMessage());
			return;
		}
			char[] palabraOculta = new char[this.palabraAdivinar.length()];
			char[] palabraAcertar = new char[this.palabraAdivinar.length()];

			for (int i = 0; i < palabraOculta.length; i++) {
				palabraOculta[i] = '-';
				palabraAcertar[i] = this.palabraAdivinar.charAt(i);
			}

			do {
				for (char c : palabraOculta) {
					System.out.print(c);
				}
				System.out.println();
				this.muestraVidasRestantes();
				System.out.println("Adivina la PALABRA!");
				System.out.println("Introduce una letra");
				String letra = entrada.next();

				boolean acertar = false;
				char letraChar = letra.charAt(0);

				for (int i = 0; i < palabraOculta.length; i++) {
					if (letraChar == palabraAcertar[i]) {
						palabraOculta[i] = palabraAcertar[i];
						acertar = true;
					}
				}

				if (Arrays.equals(palabraOculta, palabraAcertar)) {
					System.out.println("Has completado la PALABRA!");
					System.out.println("La palabra oculta era: " + this.palabraAdivinar);
					actualizaRecord();
					break;
				} else if (acertar == true) {
					continue;
				} else if (quitaVida() == true) {
					System.out.println("Letra equivocada, la letra: " + letra + " no es correcta");

				} else {
					break;
				}

			} while (true);
		}

	@Override
	public void muestraNombre() {
		System.out.println("Juego: AHORCADO!");

	}

	@Override
	public void muestraInfo() {
		System.out.println("Escribe una letra y adivina la palabra");

	}

}
