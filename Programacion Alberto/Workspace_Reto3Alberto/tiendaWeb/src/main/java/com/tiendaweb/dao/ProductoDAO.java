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
			String sql = "SELECT * FROM producto";
			ps = con.prepareStatement(sql);		
			rs = ps.executeQuery();
			while(rs.next()) {
				Producto p = new Producto();
				Categoria c = new Categoria();
				
				p.setId(rs.getInt("id"));
				p.setNombre(rs.getString("nombre"));
				p.setPrecio(rs.getDouble("precio"));
				p.setStock(rs.getInt("stock"));
				p.setDescripcionCorta(rs.getString("descripcion_corta"));
				p.setDescripcionLarga(rs.getString("descripcion_larga"));
				p.setRutaImagen(rs.getString("ruta_imagen"));
				c.setId(rs.getInt("categoria"));
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

}
