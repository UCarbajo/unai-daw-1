package model;

public class Coche {
	public String marca, modelo, color;

	public Coche(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
