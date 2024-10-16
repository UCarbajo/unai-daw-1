package model;
import model.Producto;

public class Vendedor {

	public String nombreVendedor;
	public Vendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	
	public void compraFinalizada(String nombreProducto) {
		System.out.println("El producto " + nombreProducto + " ha sido vendido por " + this.nombreVendedor);
	}
}
