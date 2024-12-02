package Juego.pelea;

public class Personajes {
	private int salud;
	private int ataque;
	private int defensa;
	private String nombre;
	
	public Personajes(String nombre, int salud, int ataque, int defensa) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.ataque = ataque;
		this.defensa = defensa;
	}

	public void atacar(Personajes enemigo) {
	    int da�o = this.ataque/enemigo.getDefensa();
	    if (da�o <= 0) {
	        da�o = 1;
	    }
	    
	    enemigo.setSalud(enemigo.getSalud() - da�o);
	    
	    System.out.println(this.nombre + " atac� a " + enemigo.getNombre() + " causando " + da�o + " de da�o.");
	}
	
	void defensa (int ataque, int salud, int defensa) {
		
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
