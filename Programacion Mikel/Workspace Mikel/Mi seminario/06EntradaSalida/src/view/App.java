package view;

import java.util.ArrayList;

import entradaFicheros.Lectura;
import modelo.Linea;

public class App {

	public static void main(String[] args) {
		ArrayList<Linea> chistes = Lectura.leerFichero("D:\\Chistes.txt");

	}

}
