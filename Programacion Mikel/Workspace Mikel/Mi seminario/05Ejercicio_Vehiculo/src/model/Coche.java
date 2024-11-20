package model;

public class Coche implements ITerrestre{

	@Override
	public void arrancar() {
		System.out.println("Brrr soy un coche");
		
	}
	private String modelo;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", getModelo()=" + getModelo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
