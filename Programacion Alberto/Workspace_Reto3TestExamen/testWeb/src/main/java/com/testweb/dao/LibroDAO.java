package com.testweb.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

import com.testweb.model.Categoria;
import com.testweb.model.Libro;

public class LibroDAO {

	public boolean addOrUpdateLibro(Libro libro) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;

		try {
			String sql = "";
			
			if(libro.getId() != 0) {
				sql = "UPDATE libro SET titulo = ?, autor = ?, fecha_publicacion = ?, categoria_id = ?, rutaImagen = ? WHERE id = ?";
			}else {
				sql = "INSERT INTO libro (titulo, autor, fecha_publicacion, categoria_id, rutaImagen) VALUES (?, ?, ?, ?, ?)";
			}
			ps = con.prepareStatement(sql);
			ps.setString(1, libro.getTitulo());
			ps.setString(2, libro.getAutor());
			ps.setDate(3, Date.valueOf(libro.getAnioPublicacion()));
			ps.setInt(4, libro.getCategoria().getId());
			ps.setString(5, libro.getRutaImg());
			
			if(libro.getId() != 0) {
				ps.setInt(6, libro.getId());
			}
			if(ps.executeUpdate() > 0) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(con, null, ps);
		}
		
		return false;
	}

	public ArrayList<Libro> getLibros() {
		Connection con = AccesoBD.getConnection();
		ResultSet rs = null;
		PreparedStatement ps = null;
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		
		try {
			String sql = "SELECT libro.*, categoria.tipo "
					+ "FROM libro "
					+ "LEFT JOIN categoria ON categoria.id = libro.categoria_id";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Libro l = new Libro();
				l.setId(rs.getInt(1));
				l.setTitulo(rs.getString(2));
				l.setAutor(rs.getString(3));
				l.setAnioPublicacion(rs.getDate(4).toLocalDate());
				l.setRutaImg(rs.getString(5));
				Categoria c = new Categoria();
				c.setId(rs.getInt(6));
				c.setTipo(rs.getString(7));
				l.setCategoria(c);
				
				listaLibros.add(l);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			AccesoBD.closeConnection(con, rs, ps);
		}
		
		return listaLibros;
	}

	public ArrayList<Libro> filtrarLibros(String titulo, String autor, String categoria) {
		Connection con = AccesoBD.getConnection();
		ResultSet rs = null;
		PreparedStatement ps = null;
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		ArrayList<String> consulta = new ArrayList<String>();
		try {
			String sql = "SELECT libro.*, categoria.tipo FROM libro LEFT JOIN categoria ON categoria.id = libro.categoria_id WHERE ";
			StringBuilder stb = new StringBuilder();
			stb.append(sql);
			
			StringBuilder stbConsulta = new StringBuilder();
			
			if(!titulo.isEmpty()) {
				stbConsulta.append("titulo LIKE ? ");
				consulta.add("%"+titulo+"%");
			}
			if(!autor.isEmpty()) {
				if(stbConsulta.length() > 0) {
					stbConsulta.append("AND ").append("autor LIKE ? ");
					consulta.add("%"+autor+"%");
				}else {
					stbConsulta.append("autor LIKE ? ");
					consulta.add("%"+autor+"%");
				}
			
			}
			if(!"0".equals(categoria)) {
				if(stbConsulta.length() > 0) {
					stbConsulta.append("AND ").append("categoria_id LIKE ? ");
					consulta.add(categoria);
				}else {
					stbConsulta.append("categoria_id LIKE ? ");
					consulta.add(categoria);
				}
			}
			stb.append(stbConsulta.toString());
	
			
			ps = con.prepareStatement(stb.toString());
			for(int i = 1; i <= consulta.size(); i++) {
				ps.setString(i, consulta.get(i-1));
			}
			rs = ps.executeQuery();
			while (rs.next()) {
				Libro l = new Libro();
				l.setId(rs.getInt(1));
				l.setTitulo(rs.getString(2));
				l.setAutor(rs.getString(3));
				l.setAnioPublicacion(rs.getDate(4).toLocalDate());
				l.setRutaImg(rs.getString(5));
				Categoria c = new Categoria();
				c.setId(rs.getInt(6));
				c.setTipo(rs.getString(7));
				l.setCategoria(c);
				
				listaLibros.add(l);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(con, rs, ps);
		}
		
		return listaLibros;
	}

}
