package Producto;

public class Mandarinas {

	public String marca;
	public String pais;
	public double precio;
	
	public Mandarinas(String marca, String pais, double precio) {
		super();
		this.marca = marca;
		this.pais = pais;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
