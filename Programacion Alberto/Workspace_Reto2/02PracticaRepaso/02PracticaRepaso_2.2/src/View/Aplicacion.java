package View;
import java.util.Random;

import App.JuegoAdivinaImpar;
import App.JuegoAdivinaNumero;
import App.JuegoAdivinaPar;

public class Aplicacion {

	public static void main(String[] args) {
		Random ramon = new Random();
	
		JuegoAdivinaNumero jAdivinar = new JuegoAdivinaNumero(3, ramon.nextInt(11));
		JuegoAdivinaPar jPar = new JuegoAdivinaPar(3, 6);
		JuegoAdivinaImpar jImpar = new JuegoAdivinaImpar(3, 3);
		
		jAdivinar.juega();
		jPar.juega();
		jImpar.juega();
	}

}
