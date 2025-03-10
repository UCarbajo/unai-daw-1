package com.centrosanluis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.centrosanluis.model.Rol;
import com.centrosanluis.model.Usuario;

public class ListadoDAO {

	ArrayList<Usuario> listadoUsuarios;

	public ArrayList<Usuario> getListado() {

		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		listadoUsuarios = new ArrayList<Usuario>();
	
		
		try {
			String sql = "SELECT u.username, u.name, u.lastname, u.phonenumber, u.mail, u.id_rol, r.rol FROM usuarios u, roles r WHERE u.id_rol = r.id ORDER BY u.id_rol";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery(sql);

			while (rs.next()) {
				Usuario u = new Usuario();
				u.setUserName(rs.getString("username"));
				u.setName(rs.getString("name"));
				u.setLastName(rs.getString("lastname"));
				u.setPhoneNumber(Integer.parseInt(rs.getString("phonenumber")));
				u.setMail(rs.getString("mail"));
				
				Rol r = new Rol();
				r.setId(rs.getInt("id_rol"));
				r.setRol(rs.getString(7));
				u.setRol(r);
				
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
