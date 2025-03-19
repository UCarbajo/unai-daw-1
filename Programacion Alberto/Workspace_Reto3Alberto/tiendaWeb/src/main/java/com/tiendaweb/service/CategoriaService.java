package com.tiendaweb.service;

import java.util.ArrayList;

import com.tiendaweb.dao.CategoriaDAO;
import com.tiendaweb.model.Categoria;

public class CategoriaService {

	CategoriaDAO categoriaDAO;
	
	public CategoriaService() {
		categoriaDAO = new CategoriaDAO();
	}

	public ArrayList<Categoria> getCategoria() {
		// TODO Auto-generated method stub
		return categoriaDAO.getCategoria();
	}

}
