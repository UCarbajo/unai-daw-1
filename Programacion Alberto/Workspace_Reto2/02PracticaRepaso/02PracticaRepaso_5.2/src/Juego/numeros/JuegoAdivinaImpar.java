package Juego.numeros;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{

	public JuegoAdivinaImpar(int vidas) {
		super(vidas);
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

	@Override
	public void reiniciarPartida() {
		super.reiniciarPartida();
		do {
		this.numeroAdivinar = ramon.nextInt(11);
		}while(this.numeroAdivinar % 2 == 0);
	}
	
	
}
