package com.eventosweb.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.eventosweb.model.Eventos;

public class EventosDAO {

	public ArrayList<Eventos> getEventos() {
		Connection con = AccesoBD.getConnection();
		ResultSet rs = null;
		PreparedStatement ps = null;
		ArrayList<Eventos> listaEventos = new ArrayList<Eventos>();
		
		try {
			String sql = "SELECT * FROM eventos";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Eventos e = new Eventos();
				e.setId(rs.getInt("id"));
				e.setNombre(rs.getString("nombre"));
				e.setDescripcion(rs.getString("descripcion"));
				e.setFecha(rs.getDate("fecha").toLocalDate());
				listaEventos.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(rs, ps, con);
		}
		
		return listaEventos;
	}
	
	public boolean addEvento(Eventos evento) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		
		try {
			String sql = "INSERT INTO eventos (nombre, descripcion, fecha) VALUES (?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, evento.getNombre());
			ps.setString(2, evento.getDescripcion());
			ps.setDate(3, Date.valueOf(evento.getFecha()) );
			
			if(ps.executeUpdate() > 0) {
				return true;
			} else {
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		return false;
	}

	public void deleteEvento(Eventos evento) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		
		try {
			String sql = "DELETE FROM eventos WHERE id = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, evento.getId());
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		
	}

}
