package Juego.interfaces;

import Juego.excepciones.JuegoException;

public interface IJugable {
	
	void juega() throws JuegoException;
	
	void muestraNombre();
	
	void muestraInfo();
}
