package Juego.numeros;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import Juego.Juego;
import Juego.interfaces.IJugable;

public class JuegoAdivinaNumero extends Juego implements IJugable {
	Scanner entrada = new Scanner(System.in);
	Random ramon;
	
	int numeroAdivinar;

	public JuegoAdivinaNumero(int vidas) {
		super(vidas);
		long semilla = new Date().getTime();
		ramon = new Random(semilla);
		this.numeroAdivinar = ramon.nextInt(11);
	}
	
	public boolean validaNumero(int numeroUsuario) {
		return true;
	}

	@Override
	public void juega() {
		reiniciarPartida();

		while (true) {
			System.out.println("Adivina el numero entre el 0 y el 10");
			int numeroUsuario = entrada.nextInt();
			if (numeroUsuario == this.numeroAdivinar) {
				System.out.println("Acertaste!!");
				actualizaRecord();
				break;
			}else if (validaNumero(numeroUsuario) == false){
				continue;
			} else if (quitaVida() == true) {
				if (numeroUsuario > numeroAdivinar) {
					System.out.println("El numero es mas bajo");
				} else {
					System.out.println("El numero es mas alto");
				}
			} else {
				break;
			}
		}
	}

	@Override
	public void muestraNombre() {
		System.out.println("Juego: Adivina un número");
		
	}

	@Override
	public void muestraInfo() {
		System.out.println("Adivina un número entre el 0 y al 10");
		System.out.println("Intentos restantes: " + this.getVidas());
		
	}

	@Override
	public void reiniciarPartida() {
		super.reiniciarPartida();
		this.numeroAdivinar = ramon.nextInt(11);
	}
	
}
