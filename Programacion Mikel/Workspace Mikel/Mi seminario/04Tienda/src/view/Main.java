package view;

import model.Cliente;
import model.Producto;
import model.Vendedor;
import model.Producto;

public class Main {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Oro", 50, "Ana");
		Cliente c2 = new Cliente("Normal", 15, "Patxito");
		Vendedor v1 = new Vendedor("Deiner", 100);
		Producto p1 = new Producto ("Unai", 20);
		
		p1.aplicarDescuento(c2.tipoCliente);
		c2.restarDinero(c2.dineroCartera, p1.costeProducto);
		v1.compraFinalizada(p1.nombreProducto);
		
		c2.comprar(p1.nombreProducto, p1.costeProducto, v1.nombreVendedor);
		p1.aplicarDescuento(p1.costeProducto, c2.tipoCliente, c2.nombreCliente);
		v1.vende(p1.nombreProducto, p1.costeProducto);
	}
}
