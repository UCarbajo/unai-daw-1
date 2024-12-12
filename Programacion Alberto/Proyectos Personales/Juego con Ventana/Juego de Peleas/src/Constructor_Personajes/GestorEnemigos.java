package Constructor_Personajes;

import java.util.ArrayList;

public class GestorEnemigos {

	private ArrayList<Personaje> enemigo;

	public GestorEnemigos() {
		enemigo = new ArrayList<Personaje>();
		enemigo.add(new Personaje("Dragon", 200, 15, 20, 5));
		enemigo.add(new Personaje("Hombre lobo", 150, 20, 25, 5));
		enemigo.add(new Personaje("Vampiro", 100, 10, 15, 10));
		enemigo.add(new Personaje("Orco", 170, 25, 30, 10));
		enemigo.add(new Personaje("Ciclope", 300, 5, 10, 10));
	}

	public ArrayList<Personaje> getEnemigo() {
		return enemigo;
	}
}
