package model;
import model.Producto;

public class Vendedor {

	public String nombreVendedor;
<<<<<<< HEAD
	public Vendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	
	public void compraFinalizada(String nombreProducto) {
		System.out.println("El producto " + nombreProducto + " ha sido vendido por " + this.nombreVendedor);
	}
}
=======
	public int totalCaja;
	
	public Vendedor(String nombreVendedor, int totalCaja) {
		this.nombreVendedor = nombreVendedor;
		this.totalCaja = totalCaja;
	}
	
	public void vende(String nombreProducto, int costeProducto) {
		this.totalCaja += costeProducto;
		System.out.println("El vendedor " + this.nombreVendedor + " ha vendido el producto " + nombreProducto + " y el total de la caja es " + this.totalCaja);
	}
}
>>>>>>> cc1c5c0 (Programacion)
