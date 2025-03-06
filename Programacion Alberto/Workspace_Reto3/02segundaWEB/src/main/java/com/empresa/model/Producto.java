package com.empresa.model;

public class Producto {

	private String nombre, descripcion;
	private double precio;
	private int stock, id;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int cantidad) {
		this.stock = cantidad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(nombre).append(" ").append(descripcion).append(" ").append(precio).append(" ").append(stock);
		return str.toString();
	}
	
}
