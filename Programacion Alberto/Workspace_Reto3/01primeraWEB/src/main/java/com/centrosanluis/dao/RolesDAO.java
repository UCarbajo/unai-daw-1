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
			while (rs.next()) {
				Rol r = new Rol();
				r.setId(rs.getInt("id"));
				r.setRol(rs.getString("rol"));
				listaRoles.add(r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(rs, ps, con);
		}

		return listaRoles;
	}

	public void addRol(Rol r) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;

		String sql = "";
		if (r.getId() != 0) {
			sql = "UPDATE roles SET rol = ? WHERE id = ?";
		} else {
			sql = "INSERT INTO roles (rol) VALUES (?)";
		}

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, r.getRol());
			
			if (r.getId() != 0) {
				ps.setInt(2, r.getId());
			}
			
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}
	}
}
