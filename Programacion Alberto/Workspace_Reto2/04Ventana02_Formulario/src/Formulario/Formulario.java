package Formulario;

import java.util.List;

public class Formulario {

	public static Persona crearUsuario(String nombre, String apellidoUno, String apellidoDos, String genero, List<String> gustos) {
		Persona usuario = new Persona();
		usuario.setNombre(nombre);
		usuario.setApellidoUno(apellidoUno);
		usuario.setApellidoDos(apellidoDos);
		usuario.setGenero(genero);
		usuario.setGustos(gustos);
		return usuario;
	}
	
}
