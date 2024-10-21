package view;

import java.util.ArrayList;
import java.util.Random;

import model.Cancion;

public class App {

	public static void main(String[] args) {
		
		/*String nombre = "Mikel";
		int edad = 38;
		System.out.println(":) Te llamas "+nombre+" y tienes "+edad);
		*/
		//Crear objetos: NombreClase nombreObjeto = new NombreClase;
		
		ArrayList<Cancion> listaCanciones = new ArrayList<>();
		
		//Cancion c1 = new Cancion("Macarena", "Dale a tu cuerpo", 130);
		listaCanciones.add(new Cancion("Macarena1", "Dale a tu cuerpo", 130));
		listaCanciones.add(new Cancion("Macarena2", "Dale a tu cuerpo", 130));
		listaCanciones.add(new Cancion("Macarena3", "Dale a tu cuerpo", 130));
		listaCanciones.add(new Cancion("Macarena4", "Dale a tu cuerpo", 130));
		listaCanciones.add(new Cancion("Macarena5", "Dale a tu cuerpo", 130));
		
		for(int i = 0; i < listaCanciones.size(); i++) {
			Cancion c = listaCanciones.get(i);
			System.out.println(c);
		}
		
		for (Cancion c: listaCanciones) {
			System.out.println(c);
		}
		
		
		/*boolean[] reproducidas = new boolean[listaCanciones.size()];
		int cancionesRestantes = listaCanciones.size();
		Random random = new Random();
		
		while(cancionesRestantes > 0) {
			int indice = random.nextInt(listaCanciones.size());
			if(reproducidas[indice] == false) {
				System.out.println(listaCanciones.get(indice));
				reproducidas[indice] = true;
				cancionesRestantes--;
			}
		}*/ 
		
		//for(int i = 0; i < listaCanciones.size(); i++) {
			//System.out.println(listaCanciones.get(random.nextInt(listaCanciones.size())));
		//}
	}
	
	
	
}
