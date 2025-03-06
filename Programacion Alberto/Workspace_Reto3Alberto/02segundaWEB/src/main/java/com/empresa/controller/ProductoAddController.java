package com.empresa.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empresa.model.Producto;
import com.empresa.service.ProductoService;

@WebServlet("/productos")
public class ProductoAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductoService productoService;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		productoService = new ProductoService();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("private/altaProducto.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Producto p = new Producto();
		p.setNombre(request.getParameter("nombre"));
		p.setDescripcion(request.getParameter("descripcion"));
		p.setPrecio(Integer.parseInt(request.getParameter("precio")));
		p.setStock(Integer.parseInt(request.getParameter("cantidad")));
		
		productoService.anadirProducto(p);
		
		response.sendRedirect("productos");
	}

}
