package com.empresa.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empresa.model.Producto;
import com.empresa.service.ProductoService;


@WebServlet("/editarproducto")
public class ProductoEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProductoService productoService; 

	public void init(ServletConfig config) throws ServletException {
		productoService = new ProductoService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = (String) request.getSession().getAttribute("id");
		Producto p = productoService.getProductoPorID(id);
		request.setAttribute("producto", p); 
		request.getRequestDispatcher("private/editarProducto.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = (String) request.getSession().getAttribute("id");
		String nombre = request.getParameter("nombre");
		String precio = request.getParameter("precio");
		String stock = request.getParameter("stock");
		String descripcion = request.getParameter("descripcion");
		
		Producto p = new Producto();
		p.setId(Integer.parseInt(id));
		p.setNombre(nombre);
		p.setDescripcion(descripcion);
		p.setPrecio(Double.parseDouble(precio));
		p.setStock(Integer.parseInt(stock));
		
		productoService.updateProducto(p);
		
		request.getRequestDispatcher("editarProducto.jsp").forward(request, response);
	}

}
