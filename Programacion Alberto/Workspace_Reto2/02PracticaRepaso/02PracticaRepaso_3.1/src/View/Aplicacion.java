package View;
import java.util.Random;

import App.JuegoAdivinaImpar;
import App.JuegoAdivinaNumero;
import App.JuegoAdivinaPar;

public class Aplicacion {

	public static void main(String[] args) {
		Random ramon = new Random();
	
		JuegoAdivinaNumero jAdivinar = new JuegoAdivinaNumero(3, ramon.nextInt(11));
		JuegoAdivinaPar jPar = new JuegoAdivinaPar(3, ramon.nextInt(11));
		JuegoAdivinaImpar jImpar = new JuegoAdivinaImpar(3, ramon.nextInt(11));
		
		jAdivinar.muestraNombre();
		jAdivinar.muestraInfo();
		jAdivinar.juega();
		System.out.println();
		
		jPar.muestraNombre();
		jPar.muestraInfo();
		jPar.juega();
		System.out.println();
		
		jImpar.muestraNombre();
		jImpar.muestraInfo();
		jImpar.juega();
	}

}
