package com.centrosanluis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.centrosanluis.model.Rol;
import com.centrosanluis.model.Usuario;

public class UsuarioDAO {

	public Usuario login(Usuario usuario) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		Usuario u = null;

		String sql = "SELECT u.username, u.name, u.lastname, u.mail, u.phonenumber, u.id_rol, r.rol FROM usuarios u INNER JOIN roles r ON u.id_rol = r.id WHERE u.username = ? AND u.password = ?";

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

				Rol r = new Rol();
				r.setId(rs.getInt("id_rol"));
				r.setRol(rs.getString(7));
				u.setRol(r);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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

			if (ps.executeUpdate() > 0) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		return false;
	}

<<<<<<< HEAD
	public void deleteUsuario(String mail) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;

=======
	public void deleteUser(String mail) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		
>>>>>>> 00e4e0ae15845b234043eadb7250b96d0bb5c519
		String sql = "DELETE FROM usuarios WHERE mail = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mail);
<<<<<<< HEAD
			ps.execute();
=======
			ps.executeUpdate();
			
>>>>>>> 00e4e0ae15845b234043eadb7250b96d0bb5c519
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}
<<<<<<< HEAD
=======
	
>>>>>>> 00e4e0ae15845b234043eadb7250b96d0bb5c519
	}
}
