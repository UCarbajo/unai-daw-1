package com.testweb.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.testweb.dao.UsuarioDAO;
import com.testweb.model.Usuario;

public class UsuarioService {

	UsuarioDAO usuarioDAO;

	public UsuarioService() {
		super();
		usuarioDAO = new UsuarioDAO();
	}

	public Usuario getUsuario(String usuario, String password) {
		String passwordHash = hashPassword(password);
		return usuarioDAO.getUsuario(usuario, passwordHash);
	}
	
	private String hashPassword(String password) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] hash = md.digest(password.getBytes());
			StringBuilder hexString = new StringBuilder();
			for(byte b: hash) {
				hexString.append(String.format("%02x", b));
			}
			return hexString.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return "";
		}
	}

	public boolean anadirUsuario(Usuario u) {
		String password = u.getPassword();
		String passwordHash = hashPassword(password);
		u.setPassword(passwordHash);
		return usuarioDAO.anadirUsuario(u);
	}

	public Usuario getUsuarioByID(String id) {
		// TODO Auto-generated method stub
		return usuarioDAO.getUsuarioByID(id);
	}
	
}
