package com.tiendaweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.tiendaweb.model.Categoria;
import com.tiendaweb.model.Producto;

public class ProductoDAO {

	public ArrayList<Producto> getProducto() {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		ArrayList<Producto> listaProducto = new ArrayList<Producto>();
		
		try {
			String sql = "SELECT p.*, c.nombre "
					+ "FROM producto p "
					+ "JOIN categoria c ON c.id = p.categoria";
			
			ps = con.prepareStatement(sql);		
			rs = ps.executeQuery();
			while(rs.next()) {
				Producto p = new Producto();
				Categoria c = new Categoria();
				
				p.setId(rs.getInt(1));
				p.setNombre(rs.getString(2));
				p.setDescripcionCorta(rs.getString(3));
				p.setDescripcionLarga(rs.getString(4));
				p.setPrecio(rs.getDouble(5));
				p.setStock(rs.getInt(6));
				p.setRutaImagen(rs.getString(7));
				c.setId(rs.getInt(8));
				c.setCategoria(rs.getString(9));
				p.setCategoria(c);
				
				listaProducto.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al obtener productos");
		} finally {
			AccesoBD.closeConnection(rs, ps, con);
		}
		return listaProducto;
	}

	public Producto getProductoByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
