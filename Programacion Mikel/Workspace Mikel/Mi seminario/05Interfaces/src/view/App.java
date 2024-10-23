package view;

import model.Drone;
import model.IAeronave;
import model.IEspacial;

/*
 * INTERFACES
 * Pueden ser public o package
 * Se usa implements en lugar de extends
 * Las interfaces, entre ellas, SI QUE HACEN EXTENDS
 * Todos los sus metodos son public abstract y los atributos final static
 * 
 * */

public class App {

	public static void main(String[] args) {
		Drone d = new Drone();
		d.volar();
		d.orbitar();
		
		//Comportamientos de vehiculo espacial
		IEspacial dEspacial = d;
		dEspacial.orbitar();
		System.out.println(dEspacial.velocidad);
		
		//Comportamientos de vehiculo espacial
		IAeronave dAeronave = d;
		dAeronave.volar();
		System.out.println(dAeronave.velocidad);
		
	}

}
