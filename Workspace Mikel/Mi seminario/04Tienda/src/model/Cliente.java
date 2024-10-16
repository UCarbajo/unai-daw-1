package model;
import model.Producto;

public class Cliente {
		
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
