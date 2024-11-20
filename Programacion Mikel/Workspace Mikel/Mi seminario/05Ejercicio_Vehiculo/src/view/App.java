package view;
import model.Coche;
import model.Anfibio;
import model.Barco;

public class App {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		System.out.println(c1.ruedas);
		c1.arrancar();
		Anfibio a1 = new Anfibio();
		a1.arrancar();
		System.out.println(a1.eslora);
		Barco b1 = new Barco();
		b1.arrancar();

	}

}
