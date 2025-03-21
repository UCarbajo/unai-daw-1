package com.tiendaweb.service;

import java.util.ArrayList;
import java.util.Map;

import com.tiendaweb.dao.ProductoDAO;
import com.tiendaweb.model.Producto;

public class ProductoService {

	ProductoDAO productoDAO;
	
	public ProductoService() {
		productoDAO = new ProductoDAO();
	}

	public ArrayList<Producto> getProducto() {
		// TODO Auto-generated method stub
		return productoDAO.getProducto();
	}

	public Producto getProductoByID(String id) {
		// TODO Auto-generated method stub
		return productoDAO.getProductoByID(id);
	}

	public Map<Producto, Integer> getProductoByIDArray(Map<String, String> carroItem) {
		// TODO Auto-generated method stub
		return productoDAO.getProductoByIDArray(carroItem);
	}

	public boolean addOrUpdateProducto(Producto p) {
		// TODO Auto-generated method stub
		return productoDAO.addOrUpdateProducto(p);
	}

}
