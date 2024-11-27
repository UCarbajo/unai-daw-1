package View;
import java.util.Random;

import App.JuegoAdivinaNumero;

public class Aplicacion {

	public static void main(String[] args) {
		Random ramon = new Random();
	
		JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(5, ramon.nextInt(11));
		
		juego1.juega();
	}

}
