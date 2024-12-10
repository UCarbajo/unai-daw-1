package Formulario;

import java.util.List;

public class Persona {

	private String nombre;
	private String apellidoUno;
	private String apellidoDos;
	private String genero;
	private List<String> gustos;
	
	public Persona() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoUno() {
		return apellidoUno;
	}
	public void setApellidoUno(String apellidoUno) {
		this.apellidoUno = apellidoUno;
	}
	public String getApellidoDos() {
		return apellidoDos;
	}
	public void setApellidoDos(String apellidoDos) {
		this.apellidoDos = apellidoDos;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public List<String> getGustos() {
		return gustos;
	}
	public void setGustos(List<String> gustos) {
		this.gustos = gustos;
	}

	@Override
	public String toString() {
		return  "Nombre: " + nombre + " " +  apellidoUno +" "+ apellidoDos +" Genero: "+ genero + " Gustos: " +  gustos;
	}
	
	
}
