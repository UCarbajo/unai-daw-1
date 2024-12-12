package UI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import Constructor_Personajes.Personaje;
import java.awt.Color;


public class JuegoUI extends JFrame{
	
	public JuegoUI(Personaje clase, Personaje enemigo) {
		
		setName("Pelea");
		setBounds(150, 150, 475, 475);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("COMBATE CONTRA EL ENEMIGO");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitulo.setBounds(106, 11, 240, 20);
		getContentPane().add(lblTitulo);
		
		JButton btnAtaque = new JButton("Ataque");
		btnAtaque.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAtaque.setBounds(10, 350, 140, 75);
		getContentPane().add(btnAtaque);
		
		JButton btnPocion = new JButton("Usar poci\u00F3n");
		btnPocion.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPocion.setBounds(309, 350, 140, 75);
		getContentPane().add(btnPocion);
		
		JButton btnDefensa = new JButton("Defensa");
		btnDefensa.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnDefensa.setBounds(160, 350, 140, 75);
		getContentPane().add(btnDefensa);
		
		JTextArea InformacionCombate = new JTextArea();
		InformacionCombate.setEditable(false);
		InformacionCombate.setBounds(10, 231, 439, 108);
		getContentPane().add(InformacionCombate);
		
		JProgressBar BarraSaludJugador = new JProgressBar();
		BarraSaludJugador.setForeground(Color.GREEN);
		BarraSaludJugador.setBounds(10, 206, 200, 14);
		BarraSaludJugador.setMaximum(clase.getSalud());
		BarraSaludJugador.setMinimum(0);
		BarraSaludJugador.setValue(clase.getSalud());
		getContentPane().add(BarraSaludJugador);
		
		JProgressBar BarraSaludEnemigo = new JProgressBar();
		BarraSaludEnemigo.setForeground(Color.GREEN);
		BarraSaludEnemigo.setBounds(249, 206, 200, 14);
		BarraSaludEnemigo.setMaximum(enemigo.getSalud());
		BarraSaludEnemigo.setMinimum(0);
		BarraSaludEnemigo.setValue(enemigo.getSalud());
		getContentPane().add(BarraSaludEnemigo);
		
		JLabel lblClaseJugador = new JLabel("Clase:");
		lblClaseJugador.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClaseJugador.setBounds(10, 70, 39, 14);
		getContentPane().add(lblClaseJugador);
		
		JLabel lblAtaqueJugador = new JLabel("Ataque:");
		lblAtaqueJugador.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAtaqueJugador.setBounds(10, 95, 53, 14);
		getContentPane().add(lblAtaqueJugador);
		
		JLabel lblDefensaJugador = new JLabel("Defensa:");
		lblDefensaJugador.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDefensaJugador.setBounds(10, 120, 58, 14);
		getContentPane().add(lblDefensaJugador);
		
		JLabel lblPocionesRestantes = new JLabel("Pociones Restantes:");
		lblPocionesRestantes.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPocionesRestantes.setBounds(10, 145, 133, 14);
		getContentPane().add(lblPocionesRestantes);
		
		JLabel lblSaludJugador = new JLabel("Barra de salud");
		lblSaludJugador.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSaludJugador.setBounds(10, 181, 200, 14);
		getContentPane().add(lblSaludJugador);
		
		JLabel lblSaludEnemigo = new JLabel("Barra de salud enemigo");
		lblSaludEnemigo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSaludEnemigo.setBounds(249, 181, 200, 14);
		getContentPane().add(lblSaludEnemigo);
		
		JLabel lblNombreEnemigo = new JLabel("Enemigo:");
		lblNombreEnemigo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombreEnemigo.setBounds(249, 70, 58, 14);
		getContentPane().add(lblNombreEnemigo);
		
		JLabel lblAtaqueEnemigo = new JLabel("Ataque:");
		lblAtaqueEnemigo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAtaqueEnemigo.setBounds(249, 95, 53, 14);
		getContentPane().add(lblAtaqueEnemigo);
		
		JLabel lblDefensaEnemigo = new JLabel("Defensa:");
		lblDefensaEnemigo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDefensaEnemigo.setBounds(249, 120, 58, 14);
		getContentPane().add(lblDefensaEnemigo);
		
		JLabel lblClaseJugador_Tipo = new JLabel(clase.getClase());
		lblClaseJugador_Tipo.setBounds(59, 71, 151, 14);
		getContentPane().add(lblClaseJugador_Tipo);
		
		JLabel lblAtaqueJugador_Total = new JLabel(String.valueOf(clase.getAtaque()));
		lblAtaqueJugador_Total.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAtaqueJugador_Total.setBounds(65, 96, 145, 14);
		getContentPane().add(lblAtaqueJugador_Total);
		
		JLabel lblDefensaJugador_Total = new JLabel(String.valueOf(clase.getDefensa()));
		lblDefensaJugador_Total.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDefensaJugador_Total.setBounds(70, 121, 137, 14);
		getContentPane().add(lblDefensaJugador_Total);
		
		JLabel lblPocionesRestantes_Total = new JLabel(String.valueOf(clase.getPociones()));
		lblPocionesRestantes_Total.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPocionesRestantes_Total.setBounds(153, 145, 53, 14);
		getContentPane().add(lblPocionesRestantes_Total);
		
		JLabel lblNombreEnemigo_Tipo = new JLabel(enemigo.getNombre());
		lblNombreEnemigo_Tipo.setBounds(309, 71, 140, 14);
		getContentPane().add(lblNombreEnemigo_Tipo);
		
		JLabel lblAtaqueEnemigo_Total = new JLabel(String.valueOf(enemigo.getAtaque()));
		lblAtaqueEnemigo_Total.setBounds(309, 96, 140, 14);
		getContentPane().add(lblAtaqueEnemigo_Total);
		
		JLabel lblDefensaEnemigo_Total = new JLabel(String.valueOf(enemigo.getDefensa()));
		lblDefensaEnemigo_Total.setBounds(309, 121, 140, 14);
		getContentPane().add(lblDefensaEnemigo_Total);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
