package model;
// Comentarios

public class Cancion {
	// Atributos /variables -estas son las caracteristicas que tienen todos los
	// objetos-
	// TipoDato NombreVariable [= Valor];

	public String nombre;
	public String letra; // La letra completa
	public int duracion; // Segundos

	// Constructores (NombreClase (args .. )
	public Cancion() {
		System.out.println("Objeto construido");
	}

	public Cancion(String nombre, String letra, int duracion) {
		
		//0. Validar datos
		
		//1. Asignar datos
		
		//establecer los valores de los atributos
		this.nombre = nombre;
		this.letra = letra;
		//controlar valores
		if (duracion <= 0) {
			duracion = 100;
		}
		this.duracion = duracion;
	}

	// Comportamientos / metodos
	// visibilidad retorno NombreMetodo ([argumentos])
	public void mostrarLetra() {
		System.out.println(this.letra);
	}

}