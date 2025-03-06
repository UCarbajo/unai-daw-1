package com.empresa.service;

import java.util.ArrayList;

import com.empresa.dao.ProductoDAO;
import com.empresa.model.Producto;

public class ProductoService {

	ProductoDAO productoDAO;

	public ProductoService() {
		super();
		productoDAO = new ProductoDAO();
	}
	
	public void anadirProducto(Producto producto) {
		productoDAO.anadirProducto(producto);
	}

	public ArrayList<Producto> getProductos(int offSet, String producto, int min, int max) {
		
		return productoDAO.getProductos(offSet, producto, min, max);
	}
	public Producto getProductoPorID(String id) {
		return productoDAO.getProductoPorID(id);
		
	}

	public void updateProducto(Producto p) {
		productoDAO.updateProducto(p);
		
	}

	public void deleteProducto(String id) {
		productoDAO.deleteProducto(id);
		
	}
	
}
