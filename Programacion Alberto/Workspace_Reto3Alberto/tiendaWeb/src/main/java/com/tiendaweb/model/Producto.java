package com.tiendaweb.model;

import java.util.Objects;

public class Producto {

	private int id, stock;
	private String nombre, descripcionCorta, descripcionLarga, rutaImagen;
	private double precio;
	private Categoria categoria;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcionCorta() {
		return descripcionCorta;
	}

	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}

	public String getDescripcionLarga() {
		return descripcionLarga;
	}

	public void setDescripcionLarga(String descripcionLarga) {
		this.descripcionLarga = descripcionLarga;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Producto producto = (Producto) o;
		return Objects.equals(id, producto.id); // Usamos el id para comparar los productos
	}

	@Override
	public int hashCode() {
		return Objects.hash(id); // Usamos el id para generar el c�digo hash
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", stock=" + stock + ", nombre=" + nombre + ", descripcionCorta="
				+ descripcionCorta + ", descripcionLarga=" + descripcionLarga + ", rutaImagen=" + rutaImagen
				+ ", precio=" + precio + ", categoria=" + categoria + "]";
	}

}
