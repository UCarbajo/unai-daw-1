package com.testweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.testweb.model.Categoria;

public class CategoriaDAO {

	public ArrayList<Categoria> getCategoria() {
		Connection con = AccesoBD.getConnection();
		ResultSet rs = null;
		PreparedStatement ps = null;
		ArrayList<Categoria> listaCategoria = new ArrayList<Categoria>();
		try {
			String sql = "SELECT * FROM categoria";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Categoria c = new Categoria();
				c.setId(rs.getInt("id"));
				c.setTipo(rs.getString("tipo"));
				listaCategoria.add(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(con, rs, ps);
		}
		
		return listaCategoria;
	}

}
