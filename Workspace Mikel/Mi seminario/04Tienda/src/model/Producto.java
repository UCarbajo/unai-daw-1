package model;

import model.Cliente;

public class Producto {

	public int costeProducto;
	public String nombreProducto;
	public int costeProductoDescuento;

	public Producto(String nombreProducto, int costeProducto) {
		this.nombreProducto = nombreProducto;
		this.costeProducto = costeProducto;
	}

	public void aplicarDescuento(String tipoCliente) {
		if (tipoCliente.toLowerCase().equals("oro")) {
			costeProducto = (int) (costeProducto * 0.85);
		}
		System.out.println("El precio total es " + costeProducto);
	}
}
