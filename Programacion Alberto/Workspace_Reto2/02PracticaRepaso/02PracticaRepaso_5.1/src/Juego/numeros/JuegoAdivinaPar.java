package Juego.numeros;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

	public JuegoAdivinaPar(int vidas) {
		super(vidas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validaNumero(int numeroUsuario) {
		if (numeroUsuario % 2 == 0) {
			return true;
		} else {
			System.out.println("El numero introducido es impar");
			return false;
		}
	}

	@Override
	public void muestraNombre() {
		System.out.println("Juego: Adivina un número Par");
	}

	@Override
	public void muestraInfo() {
		System.out.println("Adivina el número Par entre el 0 y al 10");
		System.out.println("Intentos restantes: " + this.getVidas());
	}
	
}
