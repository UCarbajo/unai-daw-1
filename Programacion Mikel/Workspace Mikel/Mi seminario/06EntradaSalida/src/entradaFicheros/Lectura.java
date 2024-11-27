package entradaFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Linea;

public class Lectura {
	
	public static ArrayList<Linea> leerFichero(String ruta) throws Exception{
		ArrayList<Linea> lineas = new ArrayList<Linea>();
		//FileReader		caracter a caracter
		//BufferedReader(FR)	linea a linea
		//bf.readLine();
		//fr.close(); bf.clone();
		
		try(BufferedReader buffer = new BufferedReader(new FileReader(ruta))) {
			String texto;
			int ContadorLineas=0;
			
			while((texto = buffer.readLine()) != null) {
				//Guardar datos
				lineas.add(new Linea(ContadorLineas, texto));
			}
		}
			
		
		return null;
	}
}
