package com.centrosanluis.service;

import com.centrosanluis.controller.Usuario;
import com.centrosanluis.dao.UsuarioDAO;

public class UsuarioService {

	UsuarioDAO usuarioModel;
	
	
	public UsuarioService() {
		super();
		usuarioModel = new UsuarioDAO();
	}


	public Usuario login(Usuario user) {
		return null;
		
	}
	
}
