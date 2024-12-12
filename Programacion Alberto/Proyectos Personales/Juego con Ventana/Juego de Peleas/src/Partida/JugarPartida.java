package Partida;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

import Constructor_Personajes.GestorEnemigos;
import Constructor_Personajes.GestorPersonajes;
import Constructor_Personajes.Personaje;
import UI.JuegoUI;

public class JugarPartida {

	private static int saludJugador;
	private static int saludEnemigo;
	private static int ataqueMaxJugador;
	private static int ataqueMinJugador;
	private static int ataqueMaxEnemigo;
	private static int ataqueMinEnemigo;
	private static int defensaJugador;
	private static int defensaEnemigo;
	private static int pociones;
	private static int turno = 1;

	public static void empezarPartida(JComboBox<Enum> comboBox) {
		Random rand = new Random();
		GestorPersonajes clase = new GestorPersonajes();
		GestorEnemigos contrincante = new GestorEnemigos();
		Personaje jugador = clase.getClases().get(comboBox.getSelectedIndex());
		Personaje enemigo = contrincante.getEnemigo().get(rand.nextInt(5));

		JuegoUI juego = new JuegoUI(jugador, enemigo);
		valoresInicialesJugador(jugador);
		valoresInicialesEnemigo(enemigo);
		juego.setVisible(true);
	}

	public static void valoresInicialesJugador(Personaje jugador) {
		saludJugador = jugador.getSalud();
		ataqueMaxJugador = jugador.getAtaqueMax();
		ataqueMinJugador = jugador.getAtaqueMin();
		defensaJugador = jugador.getDefensa();
		pociones = jugador.getPociones();
	}

	public static void valoresInicialesEnemigo(Personaje enemigo) {
		saludEnemigo = enemigo.getSalud();
		ataqueMaxEnemigo = enemigo.getAtaqueMax();
		ataqueMinEnemigo = enemigo.getAtaqueMin();
		defensaEnemigo = enemigo.getDefensa();
		pociones = enemigo.getPociones();
	}

	public static void Atacar(Personaje clase, Personaje enemigo, JTextArea InformacionCombate,
			JProgressBar barraSaludEnemigo, JProgressBar barraSaludJugador, JuegoUI juegoUI) {

		Random rand = new Random();
		int critico = rand.nextInt(11);
		int ataque = rand.nextInt(clase.getAtaqueMax() - clase.getAtaqueMin() + 1) + clase.getAtaqueMin();
		int defensa = enemigo.getDefensa();
		int daño = 0;
		
		
		InformacionCombate.append("Turno " + turno + "\n");
		if (critico >= 8) {
			daño = (int) ((ataque * 1.5) * 2) / (int) (defensa * 0.5);
			InformacionCombate.append("CRITICO!\n");
			InformacionCombate.append("Has atacado y las realizado " + daño + " puntos de daño.\n");
		} else {
			daño = (int) (ataque * 1.5) / (int) (defensa * 0.5);
			if (daño <= 0) {
				daño = 1;
				InformacionCombate.append("Has atacado y las realizado " + daño + " puntos de daño.\n");
			} else {
				InformacionCombate.append("Has atacado y las realizado " + daño + " puntos de daño.\n");
			}
		}
		enemigo.setSalud(enemigo.getSalud() - daño);
		InformacionCombate.append("Al enemigo le queda " + enemigo.getSalud() + " de salud.\n");
		barraSaludEnemigo.setValue(enemigo.getSalud());
		barraSaludEnemigo.setString(String.valueOf(enemigo.getSalud()));
		InformacionCombate.append("\n");
		turnoEnemigo(clase, enemigo, InformacionCombate, barraSaludEnemigo, barraSaludJugador);
		comprobarSalud(clase, enemigo, InformacionCombate, barraSaludEnemigo, barraSaludJugador);
		turno++;
	}

	private static void turnoEnemigo(Personaje clase, Personaje enemigo, JTextArea InformacionCombate,
			JProgressBar barraSaludEnemigo, JProgressBar barraSaludJugador) {

		Random rand = new Random();
		int critico = rand.nextInt(11);
		int ataque = rand.nextInt(enemigo.getAtaqueMax() - enemigo.getAtaqueMin() + 1) + enemigo.getAtaqueMin();
		int defensa = clase.getDefensa();
		int daño = 0;
		if (critico >= 8) {
			daño = (int) ((ataque * 1.5) * 2) / (int) (defensa * 0.5);
			InformacionCombate.append("CRITICO!\n");
			InformacionCombate
					.append(enemigo.getNombre() + " ha atacado y las realizado " + daño + " puntos de daño.\n");
		} else {
			daño = (int) (ataque * 1.5) / (int) (defensa * 0.5);
			if (daño <= 0) {
				daño = 1;
				InformacionCombate
						.append(enemigo.getNombre() + " ha atacado y las realizado " + daño + " puntos de daño.\n");
			} else {
				InformacionCombate
						.append(enemigo.getNombre() + " ha atacado y las realizado " + daño + " puntos de daño.\n");
			}
		}
		clase.setSalud(clase.getSalud() - daño);
		InformacionCombate.append("Te queda " + clase.getSalud() + " de salud.\n");
		barraSaludJugador.setValue(clase.getSalud());
		barraSaludJugador.setString(String.valueOf(clase.getSalud()));
		InformacionCombate.append("\n");
	}

	private static void comprobarSalud(Personaje clase, Personaje enemigo, JTextArea informacionCombate,
			JProgressBar barraSaludEnemigo, JProgressBar barraSaludJugador) {
		

	}

	public static int getSaludJugador() {
		return saludJugador;
	}

	public static void setSaludJugador(int saludJugador) {
		JugarPartida.saludJugador = saludJugador;
	}

	public static int getSaludEnemigo() {
		return saludEnemigo;
	}

	public static void setSaludEnemigo(int saludEnemigo) {
		JugarPartida.saludEnemigo = saludEnemigo;
	}

	public static int getAtaqueMaxJugador() {
		return ataqueMaxJugador;
	}

	public static void setAtaqueMaxJugador(int ataqueMaxJugador) {
		JugarPartida.ataqueMaxJugador = ataqueMaxJugador;
	}

	public static int getAtaqueMinJugador() {
		return ataqueMinJugador;
	}

	public static void setAtaqueMinJugador(int ataqueMinJugador) {
		JugarPartida.ataqueMinJugador = ataqueMinJugador;
	}

	public static int getAtaqueMaxEnemigo() {
		return ataqueMaxEnemigo;
	}

	public static void setAtaqueMaxEnemigo(int ataqueMaxEnemigo) {
		JugarPartida.ataqueMaxEnemigo = ataqueMaxEnemigo;
	}

	public static int getAtaqueMinEnemigo() {
		return ataqueMinEnemigo;
	}

	public static void setAtaqueMinEnemigo(int ataqueMinEnemigo) {
		JugarPartida.ataqueMinEnemigo = ataqueMinEnemigo;
	}

	public static int getDefensaJugador() {
		return defensaJugador;
	}

	public static void setDefensaJugador(int defensaJugador) {
		JugarPartida.defensaJugador = defensaJugador;
	}

	public static int getDefensaEnemigo() {
		return defensaEnemigo;
	}

	public static void setDefensaEnemigo(int defensaEnemigo) {
		JugarPartida.defensaEnemigo = defensaEnemigo;
	}

	public static int getPociones() {
		return pociones;
	}

	public static void setPociones(int pociones) {
		JugarPartida.pociones = pociones;
	}

}
