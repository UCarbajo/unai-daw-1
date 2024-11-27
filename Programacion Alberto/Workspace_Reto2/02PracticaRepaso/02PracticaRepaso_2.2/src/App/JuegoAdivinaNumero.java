package App;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
	Scanner entrada = new Scanner(System.in);

	int numeroAdivinar;

	public JuegoAdivinaNumero(int vidas, int numeroAdivinar) {
		super(vidas);
		this.numeroAdivinar = numeroAdivinar;
	}
	
	public boolean validaNumero(int numeroUsuario) {
		return true;
	}

	@Override
	public void juega() {
		reinicaPartida();

		while (true) {
			System.out.println("Adivina el numero entre el 0 y el 10");
			int numeroUsuario = entrada.nextInt();
			if (numeroUsuario == this.numeroAdivinar) {
				System.out.println("Acertaste!!");
				actualizaRecord();
				break;
			}else if (validaNumero(numeroUsuario) == false){
				continue;
			} else if (quitaVida() == true) {
				if (numeroUsuario > numeroAdivinar) {
					System.out.println("El numero es mas bajo");
				} else {
					System.out.println("El numero es mas alto");
				}
			} else {
				break;
			}
		}
	}

}
