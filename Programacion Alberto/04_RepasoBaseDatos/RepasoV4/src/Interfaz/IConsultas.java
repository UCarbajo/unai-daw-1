package Interfaz;

import java.util.ArrayList;

import Coches.Coches;

public interface IConsultas {

	ArrayList<Coches> getCoches();
	
	ArrayList<Coches> buscarCoches(Coches coche);
}
