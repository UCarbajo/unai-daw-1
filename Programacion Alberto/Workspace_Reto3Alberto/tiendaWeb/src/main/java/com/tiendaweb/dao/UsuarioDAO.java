package com.tiendaweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tiendaweb.model.Usuario;

public class UsuarioDAO {

	public Usuario getUsuario(Usuario u) {
		
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Usuario usuario = new Usuario();
		
		try {
			String sql = "SELECT id FROM usuarios WHERE usuario = ? AND password = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, u.getUsuario());
			ps.setString(2, u.getPassword());
			
			rs = ps.executeQuery();
			if(rs.next()) {
				usuario.setId(rs.getInt("id"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al obtener usuario");
		} finally {
			AccesoBD.closeConnection(rs, ps, con);
		}
		
		return usuario;
	}

	public Usuario getUsuarioById(int id) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Usuario usuario = new Usuario();
		
		try {
			String sql = "SELECT usuario FROM usuarios WHERE id = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
	
			rs = ps.executeQuery();
			if(rs.next()) {
				usuario.setId(id);
				usuario.setUsuario(rs.getString("usuario"));
			}
			
		} catch (Exception e) {
			System.out.println("Error al obtener usuario por ID");
		} finally {
			AccesoBD.closeConnection(rs, ps, con);
		}
		
		return usuario;
	}

}
