package Constructor_Personajes;

import java.util.ArrayList;

public class GestorEnemigos {

	private ArrayList<Personaje> enemigo;

	public GestorEnemigos() {
		enemigo = new ArrayList<Personaje>();

		enemigo.add(new Personaje("Dragon", 200, 20, 35, 15));
		enemigo.add(new Personaje("Hombre lobo", 160, 15, 25, 10));
		enemigo.add(new Personaje("Vampiro", 120, 10, 20, 8));
		enemigo.add(new Personaje("Orco", 180, 18, 28, 12));
		enemigo.add(new Personaje("Cíclope", 300, 10, 20, 20));
		enemigo.add(new Personaje("Espectro", 100, 25, 40, 5));
		enemigo.add(new Personaje("Gólem", 280, 8, 18, 25));
		enemigo.add(new Personaje("Nigromante", 130, 18, 30, 12));
		enemigo.add(new Personaje("Troll", 220, 15, 25, 18));
	}

	public ArrayList<Personaje> getEnemigo() {
		return enemigo;
	}
}