package App;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

	public JuegoAdivinaPar(int vidas, int numeroAdivinar) {
		super(vidas, numeroAdivinar);
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
}
