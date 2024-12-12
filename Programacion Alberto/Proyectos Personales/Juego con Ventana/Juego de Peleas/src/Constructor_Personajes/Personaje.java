package Constructor_Personajes;

public class Personaje {

	private String nombre;
	private String clase;
	private int salud;
	private int ataqueMin;
	private int ataqueMax;
	private int defensa;
	private int pociones;

	public Personaje(String clase, int salud, int ataqueMin, int ataqueMax, int defensa, int pociones) {
		this.clase = clase;
		this.salud = salud;
		this.ataqueMin = ataqueMin;
		this.ataqueMax = ataqueMax;
		this.defensa = defensa;
		this.pociones = pociones;
	}

	public Personaje(String nombre, int salud, int ataqueMin, int ataqueMax, int defensa) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.ataqueMin = ataqueMin;
		this.ataqueMax = ataqueMax;
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

	public int getAtaqueMin() {
		return ataqueMin;
	}

	public void setAtaqueMin(int ataqueMin) {
		this.ataqueMin = ataqueMin;
	}

	public int getAtaqueMax() {
		return ataqueMax;
	}

	public void setAtaqueMax(int ataqueMax) {
		this.ataqueMax = ataqueMax;
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
