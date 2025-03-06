package com.empresa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.empresa.model.Producto;

public class ProductoDAO {

	public void anadirProducto(Producto producto) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;

		try {
			String sql = "INSERT INTO productos(nombre, descripcion, precio, stock) VALUES (?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, producto.getNombre());
			ps.setString(2, producto.getDescripcion());
			ps.setDouble(3, producto.getPrecio());
			ps.setInt(4, producto.getStock());

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}

	}

	public ArrayList<Producto> getProductos(int offSet, String producto, int min, int max) {
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT id, nombre, descripcion, precio, stock FROM productos WHERE nombre LIKE ? AND precio BETWEEN ? AND ? LIMIT 10 OFFSET ?";
			
			ps = con.prepareStatement(sql);
			ps.setString(1,"%"+producto+"%");
			ps.setInt(2, min);
			ps.setInt(3, max);
			ps.setInt(4, offSet);
			rs = ps.executeQuery();
			while (rs.next()) {
				Producto p = new Producto();
				p.setId(rs.getInt("id"));
				p.setNombre(rs.getString("nombre"));
				p.setDescripcion(rs.getString("descripcion"));
				p.setPrecio(rs.getDouble("precio"));
				p.setStock(rs.getInt("stock"));
				listaProductos.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(rs, ps, con);
		}
		return listaProductos;
	}

	public Producto getProductoPorID(String id) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Producto p = null;
		try {
			String sql = "SELECT nombre, descripcion, precio, stock FROM productos WHERE id = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(id));
			rs = ps.executeQuery();

			if (rs.next()) {
				p = new Producto();
				p.setId(Integer.parseInt(id));
				p.setNombre(rs.getString("nombre"));
				p.setDescripcion(rs.getString("descripcion"));
				p.setPrecio(rs.getDouble("precio"));
				p.setStock(rs.getInt("stock"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(rs, ps, con);
		}

		return p;
	}

	public void updateProducto(Producto p) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;

		try {
			String sql = "UPDATE productos SET nombre = ?, descripcion = ?, precio = ?, stock = ? WHERE ID = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, p.getNombre());
			ps.setString(2, p.getDescripcion());
			ps.setDouble(3, p.getPrecio());
			ps.setInt(4, p.getStock());
			ps.setInt(5, p.getId());

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}

	}

	public void deleteProducto(String id) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;

		try {
			String sql = "DELETE FROM productos WHERE id = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(id));
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}
	}
}
