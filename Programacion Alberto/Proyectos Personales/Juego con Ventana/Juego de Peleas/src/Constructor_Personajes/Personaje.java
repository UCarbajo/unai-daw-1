package Constructor_Personajes;

public class Personaje {

	private String nombre;
	private String clase;
	private int salud;
	private int ataque;
	private int defensa;
	private int pociones;
	
	public Personaje(String clase, int saludo, int ataque, int defensa, int pociones) {
		super();
		this.clase = clase;
		this.salud = saludo;
		this.ataque = ataque;
		this.defensa = defensa;
		this.pociones = pociones;
	}
	
	public Personaje(String nombre, int salud, int ataque, int defensa) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.ataque = ataque;
		this.defensa = defensa;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getSalud() {
		return salud;
	}
	public void setSalud(int saludo) {
		this.salud = saludo;
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
	public int getPociones() {
		return pociones;
	}
	public void setPociones(int pociones) {
		this.pociones = pociones;
	}
	
	
}
