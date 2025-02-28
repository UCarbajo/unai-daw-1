package com.centrosanluis.service;

import java.util.ArrayList;

import com.centrosanluis.dao.ListadoDAO;
import com.centrosanluis.model.Usuario;

public class ListadoService {

	ListadoDAO listadoDao;

	public ListadoService() {
		listadoDao = new ListadoDAO();
	}

	public ArrayList<Usuario> getListado() {

		return listadoDao.getListado();
	}
}
