package view;

import model.Cliente;
import model.Vendedor;
import model.Producto;

public class Main {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Oro", 50, "Ramon");
		Cliente c2 = new Cliente ("Normal", 20, "Unai");
		Producto p1 = new Producto("Salmon Ahumado", 15);
		Vendedor v1 = new Vendedor("Juan");
		
		p1.aplicarDescuento(c2.tipoCliente);
		c2.restarDinero(c2.dineroCartera, p1.costeProducto);
		v1.compraFinalizada(p1.nombreProducto);
		
	}

}
