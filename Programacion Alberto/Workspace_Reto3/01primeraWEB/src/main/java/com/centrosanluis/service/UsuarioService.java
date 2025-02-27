package com.centrosanluis.service;

import com.centrosanluis.model.Usuario;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.centrosanluis.dao.UsuarioDAO;

public class UsuarioService {

UsuarioDAO usuarioDAO;
	
	public UsuarioService() {
		usuarioDAO = new UsuarioDAO();
	}
	
	public Usuario login(Usuario usuario) {
		usuario.setPassWord(hashPassword(usuario.getPassWord()));
		
		return usuarioDAO.login(usuario);
	}

	public boolean addUser(Usuario nuevoUsuario) {
		String hashedPass = hashPassword(nuevoUsuario.getPassWord());
		
		nuevoUsuario.setPassWord(hashedPass);
		
		return usuarioDAO.addUser(nuevoUsuario);
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
	
}
