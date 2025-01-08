package view;

import java.sql.SQLException;

import model.AccesoBD;
import model.AccesoBDCoches;
import model.Coche;

public class App {

	public static void main(String[] args) {
		try {
			AccesoBDCoches bd = new AccesoBDCoches();
			Coche cFerrari = bd.getCoche(1);
			System.out.println(cFerrari.getModelo());
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el driver");
		} catch (SQLException e) {
			System.out.println("Error al conectar con la bd");
		}

	}

}
