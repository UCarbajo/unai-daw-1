package Coches;

public class Coches {

	private String matricula, marca, modelo;
	private Double precio;
	
	public Coches(String matricula, String marca, String modelo, Double precio) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Coches [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ "]";
	}
	
	
}
