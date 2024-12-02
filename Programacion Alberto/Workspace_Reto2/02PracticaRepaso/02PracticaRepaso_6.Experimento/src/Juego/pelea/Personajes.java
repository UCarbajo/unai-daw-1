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
	    int daño = this.ataque/enemigo.getDefensa();
	    if (daño <= 0) {
	        daño = 1;
	    }
	    
	    enemigo.setSalud(enemigo.getSalud() - daño);
	    
	    System.out.println(this.nombre + " atacó a " + enemigo.getNombre() + " causando " + daño + " de daño.");
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
