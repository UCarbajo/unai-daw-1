package com.tiendaweb.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tiendaweb.dao.UsuarioDAO;
import com.tiendaweb.model.Usuario;

public class UsuarioService {

	UsuarioDAO usuarioDAO;
	
	public UsuarioService() {
		usuarioDAO = new UsuarioDAO();
	}

	public Usuario getUsuario(HttpServletRequest request, HttpServletResponse response) {
		Usuario u = new Usuario();
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		u.setUsuario(usuario);
		u.setPassword(password);
		
		return usuarioDAO.getUsuario(u);
	}

	public Usuario getUsuarioById(int id) {
		// TODO Auto-generated method stub
		return usuarioDAO.getUsuarioById(id);
	}

}
