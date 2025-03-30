package com.testweb.service;

import java.util.ArrayList;

import com.testweb.dao.LibroDAO;
import com.testweb.model.Libro;

public class LibroService {

	LibroDAO libroDAO;

	public LibroService() {
		super();
		libroDAO = new LibroDAO();
	}

	public boolean addOrUpdateLibro(Libro libro) {
		// TODO Auto-generated method stub
		return libroDAO.addOrUpdateLibro(libro);
	}

	public ArrayList<Libro> getLibros() {
		// TODO Auto-generated method stub
		return libroDAO.getLibros();
	}

	public ArrayList<Libro> filtrarLibros(String titulo, String autor, String categoria) {
		// TODO Auto-generated method stub
		return libroDAO.filtrarLibros(titulo, autor, categoria);
	}
	
	
}
