package com.centrosanluis.model;

public class Rol {

	private int id;
	private String rol;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	@Override
	public String toString() {
		return "Rol [id=" + id + ", rol=" + rol + "]";
	}
}
