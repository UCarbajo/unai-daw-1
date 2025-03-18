package com.tiendaweb.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tiendaweb.model.Producto;
import com.tiendaweb.service.ProductoService;

@WebServlet("/listadoProducto")
public class ListadoProductoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ProductoService productoService;
	
	public void init(ServletConfig config) throws ServletException {
		productoService = new ProductoService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Producto> listaProducto = productoService.getProducto();
		
		request.getRequestDispatcher("listadoProducto.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
