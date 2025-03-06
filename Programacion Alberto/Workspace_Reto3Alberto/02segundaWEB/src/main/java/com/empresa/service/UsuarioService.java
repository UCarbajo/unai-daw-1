package com.empresa.service;

import com.empresa.dao.UsuarioDAO;
import com.empresa.model.Usuario;

public class UsuarioService {

	private UsuarioDAO usuarioDao;

	public UsuarioService() {
		super();
		usuarioDao = new UsuarioDAO();
	}

	public Usuario getUsuario(String username, String password) {

		return usuarioDao.getUsuario(username, password);
	}

}
