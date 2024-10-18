package collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Profesor();
		Persona p2 = new Alumno();
		
		//ARRAYS
		//definicion
		String[] dias = new String[7];
		
		//Dar valor
		dias[0] = "Lunes";
		
		//Obtener el valor
		System.out.println(dias[0]);
		
		//Obtener dimension del array
		System.out.println(dias.length);
		
		//para recorrerlo
		for(int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		//Ampliar NO se puede
		
		//ARRAYLIST - implementa la interfaz List con lo que es un Iterable, Collection y LIst
		//Definición
		ArrayList<String> lista = new ArrayList<>();
		
		//Dar valor
		lista.add("Alberto");
		lista.add("Sergio");
		
		//Obtener valor
		System.out.println(lista.get(0));
		
		//Eliminar el valor
		lista.remove(0);
		
		//Obtener la dimension
		System.out.println(lista.size());
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
