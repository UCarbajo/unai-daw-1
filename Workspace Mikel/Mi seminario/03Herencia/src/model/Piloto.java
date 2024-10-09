package model;

public class Piloto extends Persona{
	public String coche;
	
	public void pilotar() {
		System.out.println("Brooooom ñiiiiii ñiiiii broooom");
		
	}
	@Override
	public void saludar() {
		System.out.println("Te fundo ñiiiii");
	}
	public void saludar(String saludo) {
		System.out.println(saludo);
	}
}
