package Constructor_Personajes;

import java.util.ArrayList;

public class GestorPersonajes {

	private ArrayList<Personaje> clases;
	
	public GestorPersonajes() {
		clases = new ArrayList<Personaje>();
		clases.add(new Personaje("Humano", 150, 15, 15, 3));
		clases.add(new Personaje("Elfo", 120, 25, 5, 3));
		clases.add(new Personaje("Enano", 100, 20, 25, 3));
	}

	public ArrayList<Personaje> getClases() {
		return clases;
	}	
}
