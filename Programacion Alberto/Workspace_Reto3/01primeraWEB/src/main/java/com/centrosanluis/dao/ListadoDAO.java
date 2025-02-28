package com.centrosanluis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.centrosanluis.model.Usuario;

public class ListadoDAO {

	ArrayList<Usuario> listadoUsuarios;

	public ArrayList<Usuario> getListado() {

		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		listadoUsuarios = new ArrayList<Usuario>();
		Usuario u = new Usuario();
		
		try {
			String sql = "SELECT username, name, lastname, phonenumber, mail FROM usuarios";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery(sql);

			while (rs.next()) {
				u.setName(rs.getString("username"));
				u.setName(rs.getString("name"));
				u.setLastName(rs.getString("lastname"));
				u.setPhoneNumber(Integer.parseInt(rs.getString("phonenumber")));
				u.setMail(rs.getString("mail"));
				listadoUsuarios.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		return listadoUsuarios;
	}

}
