package App;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
	Scanner entrada = new Scanner(System.in);

	int numeroAdivinar;

	public JuegoAdivinaNumero(int vidas, int numeroAdivinar) {
		super(vidas);
		this.numeroAdivinar = numeroAdivinar;
	}

	@Override
	public void juega() {
		reiniciarPartida();

		while (true) {
			System.out.println("Adivina el numero entre el 0 y el 10");
			int numeroUsuario = entrada.nextInt();
			if (numeroUsuario == this.numeroAdivinar) {
				System.out.println("Acertaste!!");
				actualizaRecord();
				break;
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
