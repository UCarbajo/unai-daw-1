package App;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{

	public JuegoAdivinaImpar(int vidas, int numeroAdivinar) {
		super(vidas, numeroAdivinar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validaNumero(int numeroUsuario) {
		if (numeroUsuario % 2 == 0) {
			System.out.println("El numero introducido es par");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void muestraNombre() {
		System.out.println("Juego: Adivina un n�mero Impar");
	}

	@Override
	public void muestraInfo() {
		System.out.println("Adivina el n�mero Impar entre el 0 y al 10");
		System.out.println("Intentos restantes: " + this.getVidas());
	}
	
	
}
