package com.empresa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mindrot.jbcrypt.BCrypt;

import com.empresa.model.Usuario;

public class UsuarioDAO {

	public Usuario getUsuario(String username, String password) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		Usuario user = null;

		try {
			String sql = "SELECT username, tipo FROM usuarios WHERE username = ? AND password = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				user = new Usuario();
				user.setUsername(username);
				user.setTipo(rs.getString("tipo"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(rs, ps, con);
		}
		return user;
	}

}
