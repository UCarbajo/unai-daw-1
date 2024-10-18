package view;

import model.Futbolista;
import model.Persona;
import model.Piloto;

public class Main {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		Futbolista f = new Futbolista();
		Piloto pi = new Piloto();
		
		f.saludar(); // Polimorfismo (mismo metodo diferentes classes)
		pi.saludar();
	
		
		Persona personita = new Futbolista();
		//Futbolista fut = new Persona();
		personita.saludar();
		
	}

}
