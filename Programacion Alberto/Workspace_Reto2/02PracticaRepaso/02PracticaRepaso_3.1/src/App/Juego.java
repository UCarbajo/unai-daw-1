package App;

public abstract class Juego {
	private int vidas;
	private int vidasIniciales;
	private static int record = 0;
	
	public Juego (int vidas) {
		super();
		this.vidas = vidas;
		vidasIniciales = this.vidas;
	}
	
	public int getVidas() {
		return vidas;
	}

	public void muestraVidasRestantes() {
		System.out.println("Vidas restantes: " + vidas);
	}
	
	public boolean quitaVida() {
		this.vidas--;
		if (this.vidas > 0) {
			return true;
		}else {
			System.out.println("Juego Terminado");
			return false;
		}
	}
	
	public void reiniciarPartida() {
		this.vidas = vidasIniciales;
	}
	
	public void actualizaRecord() {
		if(this.vidas == record) {
			System.out.println("Has alcanzado el récord");
		}else if(this.vidas > record) {
			record++;
			System.out.println("Has batido el récord. Récord actual: " + record);
		} 
	}
	
}
