package com.testweb.model;

import java.time.LocalDate;

public class Libro {

	private int id;
	private String titulo, autor, rutaImg;
	private LocalDate anioPublicacion;
	private Categoria categoria;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public LocalDate getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(LocalDate anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getRutaImg() {
		return rutaImg;
	}
	public void setRutaImg(String rutaImg) {
		this.rutaImg = rutaImg;
	}
	
	
}
