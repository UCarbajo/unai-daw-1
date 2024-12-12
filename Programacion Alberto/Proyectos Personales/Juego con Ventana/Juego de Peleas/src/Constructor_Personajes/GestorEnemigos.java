package Constructor_Personajes;

import java.util.ArrayList;

public class GestorEnemigos {
	
	private ArrayList<Personaje> enemigo;
	
	public GestorEnemigos() {
		enemigo = new ArrayList<Personaje>();
		enemigo.add(new Personaje("Dragon", 200, 20, 5));
		enemigo.add(new Personaje("Hombre lobo", 150, 25, 0));
		enemigo.add(new Personaje("Vampiro", 100, 15, 10));
		enemigo.add(new Personaje("Orco", 170, 30, 0));
		enemigo.add(new Personaje("Ciclope", 300, 10, 10));
	}

	public ArrayList<Personaje> getEnemigo() {
		return enemigo;
	}	
}
