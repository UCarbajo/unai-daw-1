package AccesoBD;

import java.util.ArrayList;

import Coches.Coches;
import Interfaz.IConsultas;

public class ConcesionarioBD extends AccesoBD implements IConsultas{

	public ConcesionarioBD() {
		super(AccesoBD.DRIVER_MYSQL, "Concesionario", "root", "1234");
		
	}

	@Override
	public ArrayList<Coches> getCoches() {
		
		return null;
	}

	@Override
	public ArrayList<Coches> buscarCoches(Coches coche) {
		return null;
		
	}

}
