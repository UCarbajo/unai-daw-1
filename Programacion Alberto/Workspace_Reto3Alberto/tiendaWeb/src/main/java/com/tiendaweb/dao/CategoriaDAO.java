package com.tiendaweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.tiendaweb.model.Categoria;

public class CategoriaDAO {

	public ArrayList<Categoria> getCategoria() {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		ArrayList<Categoria> listaCategoria = new ArrayList<Categoria>();
		try {
			String sql = "SELECT id, nombre FROM categoria";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Categoria c = new Categoria();
				c.setId(rs.getInt("id"));
				c.setCategoria(rs.getString("nombre"));
				listaCategoria.add(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al obtener categorias");
		} finally {
			AccesoBD.closeConnection(rs, ps, con);
		}
		
		return listaCategoria;
	}

}
