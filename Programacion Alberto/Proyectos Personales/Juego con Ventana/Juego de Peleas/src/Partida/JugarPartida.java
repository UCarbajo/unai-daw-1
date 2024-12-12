package Partida;

import java.util.Random;

import javax.swing.JComboBox;

import Constructor_Personajes.GestorEnemigos;
import Constructor_Personajes.GestorPersonajes;
import Constructor_Personajes.Personaje;
import UI.JuegoUI;

public class JugarPartida {
	
	public static void empezarPartida(JComboBox<Enum> comboBox) {
		Random rand = new Random();
		GestorPersonajes clase = new GestorPersonajes();
		GestorEnemigos contrincante = new GestorEnemigos();
		Personaje jugador = clase.getClases().get(comboBox.getSelectedIndex());
		Personaje enemigo = contrincante.getEnemigo().get(rand.nextInt(5));
		
		JuegoUI juego = new JuegoUI(jugador, enemigo);
		juego.setVisible(true);
	}

	public static int atacar(Personaje clase, Personaje enemigo) {
		Random rand = new Random();
		int critico = rand.nextInt(11);
		int da�o = 0;
		if (critico > 8) {
			da�o = (clase.getAtaque()*2) / enemigo.getDefensa();
		} else {
			da�o = clase.getAtaque() / enemigo.getDefensa();
			if (da�o <= 0) {
				da�o = 1;
				enemigo.setSalud(enemigo.getSalud() - da�o);
			}
		}

		return da�o;
	}

}
