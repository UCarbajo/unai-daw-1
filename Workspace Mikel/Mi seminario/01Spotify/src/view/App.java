package view;

import model.Cancion;

public class App {

	public static void main(String[] args) {
		
		/*String nombre = "Mikel";
		int edad = 38;
		System.out.println(":) Te llamas "+nombre+" y tienes "+edad);
		*/
		//Crear objetos: NombreClase nombreObjeto = new NombreClase;
		
		Cancion c1 = new Cancion();
		c1.nombre = "Alehop";
		c1.letra = "Ale hop hop hop blablabla...";
		c1.duracion = -150;
		c1.mostrarLetra();
		
		Cancion c2 = new Cancion();
		c2.nombre = "Alehop";
		c2.letra = "Tatatatt taatat...";
		c2.duracion = -250;
		c2.mostrarLetra();
		
		Cancion c3 = new Cancion("Macarena","Blablabaaaaaa", -200);
		System.out.println(c3.duracion);

	}

}