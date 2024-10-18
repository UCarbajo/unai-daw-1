package main;

import herencia.Alumno;
import herencia.Persona;

public class Main {

	public static void main(String[] args) {
		Persona p = new Persona();
		Alumno a = new Alumno();

		p.saludar();
		a.saludar();
	}

}
