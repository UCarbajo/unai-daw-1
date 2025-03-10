package com.centrosanluis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.centrosanluis.model.Rol;
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

	public Usuario getUser(String mail) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Usuario u = new Usuario();
		Rol r = new Rol();
		try {
			String sql = "SELECT u.name, u.lastname, u.phonenumber, u.username, u.mail, u.id_rol, r.rol FROM usuarios u, roles r WHERE mail = ? AND r.id = u.id_rol";
			ps = con.prepareStatement(sql);
			ps.setString(1, mail);
			rs = ps.executeQuery();
			if(rs.next()) {
				u.setName(rs.getString("name"));
				u.setLastName(rs.getString("lastname"));
				u.setUserName(rs.getString("username"));
				u.setPhoneNumber(rs.getInt("phonenumber"));
				u.setMail(rs.getString("mail"));
				r.setId(rs.getInt("u.id_rol"));
				r.setRol(rs.getString("r.rol"));
				u.setRol(r);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(rs, ps, con);
		}
		return u;
	}

	public void updateUsuario(Usuario u) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		
		try {
			String sql = "UPDATE usuarios SET name = ?, lastname = ?, phonenumber = ?, username = ?, id_rol = ? WHERE mail = ?";
			ps =  con.prepareStatement(sql);
			ps.setString(1, u.getName());
			ps.setString(2, u.getLastName());
			ps.setInt(3, u.getPhoneNumber());
			ps.setString(4, u.getUserName());
			ps.setInt(5, u.getRol().getId());
			ps.setString(6, u.getMail());
			
			ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		
	}
}
