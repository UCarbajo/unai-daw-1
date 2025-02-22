package App;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import Metodos.Calculadora;

public class VentanaCalculadora {

	public static void main(String[] args) {
		
		JFrame ventana = new JFrame("Calculadora");
		ventana.getContentPane().setForeground(new Color(0, 0, 0));
		ventana.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		ventana.getContentPane().setBackground(new Color(51, 51, 51));
		ventana.setBounds(100, 100, 400, 500);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);

		JTextField txtResultado = new JTextField();
		txtResultado.setFont(new Font("Arial", Font.PLAIN, 35));
		txtResultado.setText("0");
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setBounds(0, 59, 384, 52);
		ventana.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		JButton btnUno = new JButton("1");
		btnUno.setForeground(new Color(255, 255, 255));
		btnUno.setBackground(new Color(102, 102, 102));
		btnUno.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnUno.setBounds(0, 369, 95, 45);
		ventana.getContentPane().add(btnUno);
		btnUno.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				Calculadora.usoBotonUno(txtResultado);
			}
		});

		JButton btnDos = new JButton("2");
		btnDos.setForeground(new Color(255, 255, 255));
		btnDos.setBackground(new Color(102, 102, 102));
		btnDos.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnDos.setBounds(96, 369, 95, 45);
		ventana.getContentPane().add(btnDos);
		btnDos.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Calculadora.usoBotonDos(txtResultado);
			}

		});

		JButton btnTres = new JButton("3");
		btnTres.setForeground(new Color(255, 255, 255));
		btnTres.setBackground(new Color(102, 102, 102));
		btnTres.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnTres.setBounds(192, 369, 95, 45);
		ventana.getContentPane().add(btnTres);
		btnTres.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Calculadora.usoBotonTres(txtResultado);
			}
		});

		JButton btnCuatro = new JButton("4");
		btnCuatro.setForeground(new Color(255, 255, 255));
		btnCuatro.setBackground(new Color(102, 102, 102));
		btnCuatro.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnCuatro.setBounds(0, 323, 95, 45);
		ventana.getContentPane().add(btnCuatro);
		btnCuatro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Calculadora.usoBotonCuatro(txtResultado);
			}
		});

		JButton btnCinco = new JButton("5");
		btnCinco.setForeground(new Color(255, 255, 255));
		btnCinco.setBackground(new Color(102, 102, 102));
		btnCinco.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnCinco.setBounds(96, 323, 95, 45);
		ventana.getContentPane().add(btnCinco);
		btnCinco.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Calculadora.usoBotonCinco(txtResultado);
			}
		});

		JButton btnSeis = new JButton("6");
		btnSeis.setForeground(new Color(255, 255, 255));
		btnSeis.setBackground(new Color(102, 102, 102));
		btnSeis.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnSeis.setBounds(192, 323, 95, 45);
		ventana.getContentPane().add(btnSeis);
		btnSeis.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Calculadora.usoBotonSeis(txtResultado);
			}
		});

		JButton btnSiete = new JButton("7");
		btnSiete.setBackground(new Color(102, 102, 102));
		btnSiete.setForeground(new Color(255, 255, 255));
		btnSiete.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnSiete.setBounds(0, 277, 95, 45);
		ventana.getContentPane().add(btnSiete);
		btnSiete.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Calculadora.usoBotonSiete(txtResultado);
			}
		});

		JButton btnOcho = new JButton("8");
		btnOcho.setForeground(new Color(255, 255, 255));
		btnOcho.setBackground(new Color(102, 102, 102));
		btnOcho.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnOcho.setBounds(96, 277, 95, 45);
		ventana.getContentPane().add(btnOcho);
		btnOcho.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Calculadora.usoBotonOcho(txtResultado);
			}
		});

		JButton btnNueve = new JButton("9");
		btnNueve.setForeground(new Color(255, 255, 255));
		btnNueve.setBackground(new Color(102, 102, 102));
		btnNueve.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNueve.setBounds(192, 277, 95, 45);
		ventana.getContentPane().add(btnNueve);
		btnNueve.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {

				Calculadora.usoBotonNueve(txtResultado);
			}
		});

		JButton btnCero = new JButton("0");
		btnCero.setForeground(new Color(255, 255, 255));
		btnCero.setBackground(new Color(102, 102, 102));
		btnCero.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnCero.setBounds(96, 415, 95, 45);
		ventana.getContentPane().add(btnCero);
		btnCero.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {

				Calculadora.usoBotonCero(txtResultado);
			}
		});

		JButton btnSumar = new JButton("+");
		btnSumar.setForeground(new Color(255, 255, 255));
		btnSumar.setBackground(new Color(102, 102, 102));
		btnSumar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnSumar.setBounds(289, 369, 95, 45);
		ventana.getContentPane().add(btnSumar);
		btnSumar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				Calculadora.usoBotonSuma(txtResultado);
			}

		});

		JButton btnRestar = new JButton("-");
		btnRestar.setForeground(new Color(255, 255, 255));
		btnRestar.setBackground(new Color(102, 102, 102));
		btnRestar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnRestar.setBounds(289, 323, 95, 45);
		ventana.getContentPane().add(btnRestar);
		btnRestar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				Calculadora.usoBotonResta(txtResultado);
			}

		});

		JButton btnMultiplicar = new JButton("X");
		btnMultiplicar.setForeground(new Color(255, 255, 255));
		btnMultiplicar.setBackground(new Color(102, 102, 102));
		btnMultiplicar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnMultiplicar.setBounds(289, 277, 95, 45);
		ventana.getContentPane().add(btnMultiplicar);
		btnMultiplicar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				Calculadora.usoBotonMultiplicar(txtResultado);
			}

		});

		JButton btnDividir = new JButton("\u00F7");
		btnDividir.setForeground(new Color(255, 255, 255));
		btnDividir.setBackground(new Color(102, 102, 102));
		btnDividir.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnDividir.setBounds(289, 231, 95, 45);
		ventana.getContentPane().add(btnDividir);
		btnDividir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				Calculadora.usoBotonDividir(txtResultado);
			}

		});

		JButton btnReinicio = new JButton("C");
		btnReinicio.setForeground(new Color(255, 255, 255));
		btnReinicio.setBackground(new Color(102, 102, 102));
		btnReinicio.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnReinicio.setBounds(192, 185, 95, 45);
		ventana.getContentPane().add(btnReinicio);
		btnReinicio.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				Calculadora.usoBotonReiniciar(txtResultado);

			}
		});

		JButton btnResultado = new JButton("=");
		btnResultado.setForeground(new Color(51, 51, 51));
		btnResultado.setBackground(new Color(204, 255, 0));
		btnResultado.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnResultado.setBounds(289, 415, 95, 45);
		ventana.getContentPane().add(btnResultado);
		btnResultado.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				Calculadora.usoBotonResultado(txtResultado);
			}

		});

		JButton btnEliminar = new JButton("Del");
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnEliminar.setBackground(new Color(102, 102, 102));
		btnEliminar.setBounds(289, 185, 95, 45);
		ventana.getContentPane().add(btnEliminar);
		btnEliminar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Calculadora.usoBotonEliminar(txtResultado);
			}

		});
		
		JButton btnComa = new JButton(",");
		btnComa.setForeground(new Color(255, 255, 255));
		btnComa.setBackground(new Color(102, 102, 102));
		btnComa.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnComa.setBounds(192, 415, 95, 45);
		ventana.getContentPane().add(btnComa);
		btnComa.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Calculadora.usoBotonPunto(txtResultado);
			}
			
		});
		
		JButton btnPositivoNegativo = new JButton("+/-");
		btnPositivoNegativo.setForeground(Color.WHITE);
		btnPositivoNegativo.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnPositivoNegativo.setBackground(new Color(102, 102, 102));
		btnPositivoNegativo.setBounds(0, 415, 95, 45);
		ventana.getContentPane().add(btnPositivoNegativo);
		btnPositivoNegativo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Calculadora.usoBotonPositivoNegativo(txtResultado);
			}
		});
		
		JButton btnAlCuadrado = new JButton("x\u00B2");
		btnAlCuadrado.setForeground(Color.WHITE);
		btnAlCuadrado.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnAlCuadrado.setBackground(new Color(102, 102, 102));
		btnAlCuadrado.setBounds(96, 231, 95, 45);
		ventana.getContentPane().add(btnAlCuadrado);
		btnAlCuadrado.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Calculadora.usoBotonAlCuadrado(txtResultado);
			}
		});
		
		JButton btnRaizCuadrada = new JButton("\u00B2\u221Ax");
		btnRaizCuadrada.setForeground(Color.WHITE);
		btnRaizCuadrada.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnRaizCuadrada.setBackground(new Color(102, 102, 102));
		btnRaizCuadrada.setBounds(192, 231, 95, 45);
		ventana.getContentPane().add(btnRaizCuadrada);
		btnRaizCuadrada.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Calculadora.usoBotonRaizCuadrada(txtResultado);
			}
		});
		
		
		JButton btnUnaFraccion = new JButton("\u00B9/x");
		btnUnaFraccion.setForeground(Color.WHITE);
		btnUnaFraccion.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnUnaFraccion.setBackground(new Color(102, 102, 102));
		btnUnaFraccion.setBounds(0, 231, 95, 45);
		ventana.getContentPane().add(btnUnaFraccion);
		btnUnaFraccion.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Calculadora.usoBotonUnaFraccion(txtResultado);
			}
		});
		
		ventana.setVisible(true);
	}
}
