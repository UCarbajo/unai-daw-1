package com.empresa.model;

public class Usuario {

	private String username, password, tipo;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(username).append(" ").append(password).append(" ").append(tipo);
		return str.toString();
	}
	
}
