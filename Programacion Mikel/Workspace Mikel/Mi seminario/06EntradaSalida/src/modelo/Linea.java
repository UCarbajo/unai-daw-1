package modelo;

public class Linea {
	int numeroLinea;
	String texto;
	
	public Linea(int numeroLinea, String texto) {
		super();
		this.numeroLinea = numeroLinea;
		this.texto = texto;
	}
	
	public void imprimirLinea( ) {
		System.out.println(this.numeroLinea+": " + this.texto);
	}
	
}
