package com.tiendaweb.service;

import java.util.ArrayList;

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

}
