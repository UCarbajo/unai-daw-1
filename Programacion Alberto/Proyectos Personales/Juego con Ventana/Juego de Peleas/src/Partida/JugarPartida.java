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

	public static void Atacar(Personaje clase, Personaje enemigo, JTextArea InformacionCombate,
			JProgressBar barraSaludEnemigo, JProgressBar barraSaludJugador, JButton btnAtaque, JButton btnDefensa, JButton btnPocion) {

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
		ajustarSalud(enemigo, InformacionCombate, barraSaludEnemigo, daño);
		comprobarSalud(clase, enemigo, InformacionCombate, barraSaludEnemigo, barraSaludJugador, btnAtaque, btnDefensa, btnPocion);
		InformacionCombate.append("Al enemigo le queda " + enemigo.getSalud() + " de salud.\n");
		InformacionCombate.append("\n");
		turnoEnemigo(clase, enemigo, InformacionCombate, barraSaludEnemigo, barraSaludJugador);
		
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
			InformacionCombate.append(enemigo.getNombre() + " ha atacado y las realizado " + daño + " puntos de daño.\n");
		} else {
			daño = (int) (ataque * 1.5) / (int) (defensa * 0.5);
			if (daño <= 0) {
				daño = 1;
				InformacionCombate.append(enemigo.getNombre() + " ha atacado y las realizado " + daño + " puntos de daño.\n");
			} else {
				InformacionCombate.append(enemigo.getNombre() + " ha atacado y las realizado " + daño + " puntos de daño.\n");
			}
		}
		ajustarSalud(clase, InformacionCombate, barraSaludJugador, daño);
		InformacionCombate.append("Te queda " + clase.getSalud() + " de salud.\n");
		InformacionCombate.append("\n");
	}

	private static void comprobarSalud(Personaje clase, Personaje enemigo, JTextArea informacionCombate,
			JProgressBar barraSaludEnemigo, JProgressBar barraSaludJugador, JButton btnAtaque, JButton btnDefensa, JButton btnPocion) {
		if(clase.getSalud() <= 0) {
			informacionCombate.append("Has sido derrotado!");
			informacionCombate.append("\n");
			barraSaludJugador.setString("0");
			desactivarBotones(btnAtaque, btnDefensa, btnPocion);
		}
		if(enemigo.getSalud() <= 0) {
			informacionCombate.append("Has derrotado al enemigo!");
			informacionCombate.append("\n");
			barraSaludEnemigo.setString("0");
			desactivarBotones(btnAtaque, btnDefensa, btnPocion);
		}

	}
	
	private static void ajustarSalud(Personaje objetivo, JTextArea InformacionCombate, JProgressBar barraSalud,
			int daño) {
		objetivo.setSalud(objetivo.getSalud() - daño);
		barraSalud.setValue(objetivo.getSalud());
		barraSalud.setString(String.valueOf(objetivo.getSalud()));
		
	}

	private static void desactivarBotones(JButton btnAtaque, JButton btnDefensa, JButton btnPocion) {
		btnAtaque.setEnabled(false);
		btnDefensa.setEnabled(false);
		btnPocion.setEnabled(false);
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
	
	public static int getSaludJugador() {
		return saludJugador;
	}

}
