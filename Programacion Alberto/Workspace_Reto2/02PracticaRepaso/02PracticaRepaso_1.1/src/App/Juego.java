package App;

public class Juego {
	public int vidas = 3;
	
	public Juego (int vidas) {
		super();
		this.vidas = vidas;
	}
	
	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public void muestraVidasRestantes() {
		System.out.println(vidas);
	}
	
	public static void main(String[] args) {
		Juego juego1 = new Juego(5);
		juego1.muestraVidasRestantes();
		juego1.setVidas(4);
		
		Juego juego2 = new Juego(5);
		juego2.muestraVidasRestantes();
		juego1.muestraVidasRestantes();
		
	}
}