package com.tiendaweb.service;

import java.util.ArrayList;

import javax.servlet.http.Cookie;

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

	public ArrayList<Producto> getProductoByCookie(Cookie c) {
		// TODO Auto-generated method stub
		return productoDAO.getProductoByCookie(c);
	}

}
