package com.testweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.testweb.model.Rol;

public class RolDAO {

	public ArrayList<Rol> getRoles() {
		Connection con = AccesoBD.getConnection();
		ResultSet rs = null;
		PreparedStatement ps = null;
		ArrayList<Rol> listaRoles = new ArrayList<Rol>();
	
		try {
			String sql = "SELECT * FROM rol";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Rol r = new Rol();
				r.setId(rs.getInt("id"));
				r.setTipo(rs.getString("tipo"));
				listaRoles.add(r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(con, rs, ps);
		}
		return listaRoles;
	}

}
