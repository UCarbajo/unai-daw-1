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

<<<<<<< HEAD
	public void aplicarDescuento(String tipoCliente) {
		if (tipoCliente.toLowerCase().equals("oro")) {
			costeProducto = (int) (costeProducto * 0.85);
		}
		System.out.println("El precio total es " + costeProducto);
	}
}
=======
	public void aplicarDescuento(int costeProducto, String tipoCliente, String nombreCliente) {
		if (tipoCliente.toLowerCase().equals("oro")) {
			this.costeProducto = (int) (this.costeProducto * 0.85);
			System.out.println("El cliente " + nombreCliente + " tiene descuento y el producto le cuesta " + this.costeProducto);
		}else {
			System.out.println("El cliente " + nombreCliente + " no tiene descuento y el producto le cuesta " + this.costeProducto);
		}
	}
}
>>>>>>> cc1c5c0 (Programacion)
