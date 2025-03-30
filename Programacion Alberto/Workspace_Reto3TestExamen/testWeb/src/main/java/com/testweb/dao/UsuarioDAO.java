package com.testweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.testweb.model.Rol;
import com.testweb.model.Usuario;

public class UsuarioDAO {

	public Usuario getUsuario(String usuario, String password) {
		Connection con = AccesoBD.getConnection();
		ResultSet rs = null;
		PreparedStatement ps = null;
		Usuario u = null;
		
		try {
			String sql = "SELECT id, usuario, rol FROM Usuarios WHERE usuario = ? AND password = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, usuario);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if(rs.next()) {
				u = new Usuario();
				Rol r = new Rol();
				u.setId(rs.getInt("id"));
				u.setUsuario(rs.getString("usuario"));	
				r.setId(rs.getInt("rol"));
				u.setRol(r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(con, rs, ps);
		}
		return u;
	}

	public boolean anadirUsuario(Usuario u) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		try {
			String sql = "INSERT INTO Usuarios (usuario, password, rol) VALUES (?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, u.getUsuario());
			ps.setString(2, u.getPassword());
			ps.setInt(3, u.getRol().getId());
			
			if(ps.executeUpdate() > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(con, null, ps);
		}
		
		return false;
	}

	public Usuario getUsuarioByID(String id) {
		Connection con = AccesoBD.getConnection();
		ResultSet rs = null;
		PreparedStatement ps = null;
		Usuario u = null;
		try {
			String sql = "SELECT id, usuario, rol FROM Usuarios WHERE id = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(id));
			rs = ps.executeQuery();
			if(rs.next()) {
				u = new Usuario();
				u.setId(rs.getInt("id"));
				u.setUsuario(rs.getString("usuario"));
				Rol r = new Rol();
				r.setId(rs.getInt("rol"));
				u.setRol(r);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			AccesoBD.closeConnection(con, rs, ps);
		}
		
		
		return u;
	}

}
