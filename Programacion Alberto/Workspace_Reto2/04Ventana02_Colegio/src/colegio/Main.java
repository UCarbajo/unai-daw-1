package colegio;

import java.util.ArrayList;

import colegio.model.Estudiante;
import colegio.ui.estudiante.AltaEstudiante;
import colegio.ui.estudiante.ListadoEstudiante;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		/** TODO
		 * añadir estudiantes al arraylist (new Estudiante....)
		 */
		
		AltaEstudiante window = new AltaEstudiante(estudiantes);
		ListadoEstudiante window2 = new ListadoEstudiante(estudiantes);
		
		window.setVisible(true);
		window2.setVisible(true);
		
	}

}
