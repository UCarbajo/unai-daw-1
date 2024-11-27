package view;
import App.Juego;

public class Aplicacion {

	public static void main(String[] args) {
		Juego juego1 = new Juego(5);
		juego1.muestraVidasRestantes();
		
		Juego juego2 = new Juego(5);
		juego2.muestraVidasRestantes();
		juego1.muestraVidasRestantes();
		
		juego1.quitaVida();
		juego1.muestraVidasRestantes();
		juego1.reinicaPartida();
		juego1.muestraVidasRestantes();
		juego1.actualizaRecord();
		juego2.actualizaRecord();
	}

}
