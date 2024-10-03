package model;

public class Coche {
	public String marca;
	String modelo;
	int vida;
	int fuerza;
	int capacidadDeposito, combustible;
	public Coche(String marca, String modelo, int vida, int fuerza, int capacidadDeposito) {
		
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.vida = vida;
		this.fuerza = fuerza;
		this.capacidadDeposito = capacidadDeposito;
		this.combustible=capacidadDeposito; //Empieza con el tanque lleno
	}

	public void chocar(){
		
	}

	public void arrancar() {
		// Validar combustible
		if (this.combustible > 0) {
			//arrancar
			System.out.println("BROOOOOOOOOOOMMMMM");
			//restar combustible
			this.combustible--;
		}else {
			//no arrancar
			System.out.println("No hay combustible");
		}
		//informar
			
		
	}
	
	
}
