package model;
import model.Producto;

import model.Producto;
import model.Vendedor;

public class Cliente {
<<<<<<< HEAD
		
		public String tipoCliente;
		public int dineroCartera;
		public String nombreCliente;
		
		public Cliente (String tipoCliente, int dineroCartera, String nombreCliente) {
			this.tipoCliente = tipoCliente;
			this.dineroCartera = dineroCartera;
			this.nombreCliente = nombreCliente;
		}
		public void restarDinero(int dineroCartera, int costeProducto) {
			this.dineroCartera -= costeProducto;
			System.out.println("El cliente " + nombreCliente + " se ha quedado con " + this.dineroCartera + "€ en su cartera");
		}
	}
=======

	public String tipoCliente;
	public int dineroCartera;
	public String nombreCliente;

	public Cliente(String tipoCliente, int dineroCartera, String nombreCliente) {
		this.tipoCliente = tipoCliente;
		this.dineroCartera = dineroCartera;
		this.nombreCliente = nombreCliente;
	}

	public void comprar(String nombreProducto, int costeProducto, String nombreVendedor) {
		if (costeProducto > this.dineroCartera) {
			System.out.println("Lo siento " + this.nombreCliente + " no tienes suficiente dinero.");
		} else {
			System.out.println("El cliente " + this.nombreCliente + " va a comprar el producto " + nombreProducto
					+ " que tiene un coste de " + costeProducto + "€ vendido por " + nombreVendedor);
		}
	}
}
>>>>>>> cc1c5c0 (Programacion)
