package com.centrosanluis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.centrosanluis.model.Usuario;

public class UsuarioDAO{

	public Usuario login(Usuario usuario) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Usuario u = null;
		
		String sql = "SELECT username, name, lastname, mail, phonenumber "
				+ "FROM usuarios "
				+ "WHERE username = ? AND password = ?";

		try {
			ps = con.prepareStatement(sql);
			
			ps.setString(1, usuario.getUserName());
			ps.setString(2, usuario.getPassWord());
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
				u = new Usuario();
				u.setName(rs.getString("name"));
				u.setLastName(rs.getString("lastname"));
				u.setMail(rs.getString("mail"));
				u.setPhoneNumber(Integer.parseInt(rs.getString("phonenumber")));
				u.setUserName(rs.getString("username"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(rs, ps, con);
		}
		
		return u;
	}

	public boolean addUser(Usuario nuevoUsuario) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		
		String sql = "INSERT INTO usuarios (name, lastname, phonenumber, mail, username, password, id_rol) VALUES (?,?,?,?,?,?,?)";
		
		try {
			ps = con.prepareStatement(sql);
			
			ps.setString(1, nuevoUsuario.getName());
			ps.setString(2, nuevoUsuario.getLastName());
			ps.setString(3, String.valueOf(nuevoUsuario.getPhoneNumber()));
			ps.setString(4, nuevoUsuario.getMail());
			ps.setString(5, nuevoUsuario.getUserName());
			ps.setString(6, nuevoUsuario.getPassWord());
			ps.setInt(7, nuevoUsuario.getRol().getId());
			
			if(ps.executeUpdate() > 0) {
				return true;
			}else {
				return false;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		return false;
	}

	public void deleteUser(String mail) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		
		String sql = "DELETE FROM usuarios WHERE mail = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mail);
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}
	
	}
}
