package com.testweb.service;

import java.util.ArrayList;

import com.testweb.dao.CategoriaDAO;
import com.testweb.model.Categoria;

public class CategoriaService {
	
	CategoriaDAO categoriaDAO;

	public CategoriaService() {
		super();
		categoriaDAO = new CategoriaDAO();
	}

	public ArrayList<Categoria> getCategoria() {
		// TODO Auto-generated method stub
		return categoriaDAO.getCategoria();
	}
	
	
}
