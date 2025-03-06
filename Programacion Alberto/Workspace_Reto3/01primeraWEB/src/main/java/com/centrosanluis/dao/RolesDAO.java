package com.centrosanluis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.centrosanluis.model.Rol;

public class RolesDAO {

	public ArrayList<Rol> getRoles() {
		ArrayList<Rol> listaRoles = new ArrayList<Rol>();
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT id, rol FROM roles";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Rol r = new Rol();
				r.setId(rs.getInt("id"));
				r.setRol(rs.getString("rol"));
				listaRoles.add(r);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(rs, ps, con);
		}
		
		return listaRoles;
	}
}
