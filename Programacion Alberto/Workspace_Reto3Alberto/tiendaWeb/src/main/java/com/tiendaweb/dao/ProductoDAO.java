package com.tiendaweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

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
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Producto p = new Producto();
		
		try {
			String sql = "SELECT nombre, descripcion_corta, descripcion_larga, precio, stock, ruta_imagen, categoria "
					+ "FROM producto "
					+ "WHERE id = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, Integer.valueOf(id));
			rs = ps.executeQuery();
			if(rs.next()) {
				
				Categoria c = new Categoria();
				
				p.setId(Integer.valueOf(id));
				p.setNombre(rs.getString(1));
				p.setDescripcionCorta(rs.getString(2));
				p.setDescripcionLarga(rs.getString(3));
				p.setPrecio(rs.getDouble(4));
				p.setStock(rs.getInt(5));
				p.setRutaImagen(rs.getString(6));
				c.setId(rs.getInt(7));
				p.setCategoria(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(rs, ps, con);
		}
		
		return p;
	}

	public Map<Producto, Integer> getProductoByIDArray(Map<String, String> carroItem) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Map<Producto, Integer> listaProducto = new LinkedHashMap<Producto, Integer>();
		
		try {
			String sql = "SELECT p.* FROM producto p WHERE id = ?";
			
			for(String id : carroItem.keySet()) {
				ps = con.prepareStatement(sql);
				ps.setString(1, id);
				rs = ps.executeQuery();
				if(rs.next()) {
					Producto p = new Producto();
					Categoria cat = new Categoria();
					
					p.setId(rs.getInt(1));
					p.setNombre(rs.getString(2));
					p.setDescripcionCorta(rs.getString(3));
					p.setDescripcionLarga(rs.getString(4));
					p.setPrecio(rs.getDouble(5));
					p.setStock(rs.getInt(6));
					p.setRutaImagen(rs.getString(7));
					cat.setId(rs.getInt(8));
					p.setCategoria(cat);
					
					int cantidad = Integer.parseInt(carroItem.get(id));
					listaProducto.put(p, cantidad);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();	
			System.out.println("Error al obtener producto con array");
		} finally {
			AccesoBD.closeConnection(rs, ps, con);
		}
		
		return listaProducto;
	}

	public boolean addOrUpdateProducto(Producto p) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		
		try {
			String sql = "";
			if (p.getId() != 0) {
		        sql = "UPDATE producto "
		            + "SET nombre = ?, descripcion_corta = ?, descripcion_larga = ?, precio = ?, stock = ?, ruta_imagen = ?, categoria = ? "
		            + "WHERE id = ?";
		    } else {
		        sql = "INSERT INTO producto (nombre, descripcion_corta, descripcion_larga, precio, stock, ruta_imagen, categoria) "
		            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
		    }
			
			ps = con.prepareStatement(sql);
			
			ps.setString(1, p.getNombre());
			ps.setString(2, p.getDescripcionCorta());
			ps.setString(3, p.getDescripcionLarga());
			ps.setDouble(4, p.getPrecio());
			ps.setInt(5, p.getStock());
			ps.setString(6, p.getRutaImagen());
			ps.setInt(7, p.getCategoria().getId());
			if(p.getId() != 0) {
				ps.setInt(8, p.getId());
			}
			if(ps.executeUpdate() > 0) {
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error al añadir o actualizar producto");
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		return false;
	}

}
