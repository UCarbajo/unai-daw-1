package view;

import java.util.ArrayList;

import model.Cancion;

public class App {

	public static void main(String[] args) {
		
		/*String nombre = "Mikel";
		int edad = 38;
		System.out.println(":) Te llamas "+nombre+" y tienes "+edad);
		*/
		//Crear objetos: NombreClase nombreObjeto = new NombreClase;
		
		
		Cancion c1 = new Cancion("Macarena", "Dale a tu cuerpo", 130);
		Cancion c2 = new Cancion("Macarena", "Dale a tu cuerpo", 130);
		Cancion c3 = new Cancion("Macarena", "Dale a tu cuerpo", 130);
		Cancion c4 = new Cancion("Macarena", "Dale a tu cuerpo", 130);
		Cancion c5 = new Cancion("Macarena", "Dale a tu cuerpo", 130);
		Cancion c6 = new Cancion("Macarena", "Dale a tu cuerpo", 130);
		Cancion c7 = new Cancion("Macarena", "Dale a tu cuerpo", 130);
		Cancion c8 = new Cancion("Macarena", "Dale a tu cuerpo", 130);
		Cancion c9 = new Cancion("Macarena", "Dale a tu cuerpo", 130);
		Cancion c10 = new Cancion("Macarena", "Dale a tu cuerpo", 130);
		
		ArrayList<Cancion> listaCanciones = new ArrayList<>();
		listaCanciones.add(c1);
		System.out.println(listaCanciones.get(0));
	
	}
	
	
	
}
