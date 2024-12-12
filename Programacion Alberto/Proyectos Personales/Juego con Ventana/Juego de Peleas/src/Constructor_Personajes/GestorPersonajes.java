package Constructor_Personajes;

import java.util.ArrayList;

public class GestorPersonajes {

	private ArrayList<Personaje> clases;

	public GestorPersonajes() {
		clases = new ArrayList<Personaje>();
		clases.add(new Personaje("Guerrero", 150, 10, 20, 30, 3));
		clases.add(new Personaje("Mago", 120, 15, 40, 5, 3));
		clases.add(new Personaje("Asesino", 100, 15, 30, 15, 3));
	}

	public ArrayList<Personaje> getClases() {
		return clases;
	}
}
