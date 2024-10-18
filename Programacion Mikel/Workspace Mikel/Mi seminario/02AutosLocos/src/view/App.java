package view;

import model.Coche;
import model.Persona;

public class App {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Vicente", 39,175, new Coche("Porshe", "GT2 RS", 100, 80, 1));
		Persona p2 = new Persona("Erlantz", 18,173, new Coche("Mustang", "GT", 100, 80, 60));
		
		p1.arrancar();p1.arrancar();
		p1.chocar(p2);
		
		p1.coche.setFuerza(2);
		System.out.println(p1.coche.f);
	}

}
