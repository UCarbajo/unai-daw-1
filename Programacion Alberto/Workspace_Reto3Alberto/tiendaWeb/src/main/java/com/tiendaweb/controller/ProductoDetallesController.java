package com.tiendaweb.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tiendaweb.model.Producto;


@WebServlet("/detalles")
public class ProductoDetallesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException {
	
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String rutaImagen = request.getParameter("rutaImagen");
		String descripcionLarga = request.getParameter("descripcionLarga");
		String stock = request.getParameter("stock");
		String id = request.getParameter("id");

		if(rutaImagen != null && descripcionLarga != null && stock != null && id != null) {
			Producto producto = new Producto();
			producto.setDescripcionLarga(descripcionLarga);
			producto.setRutaImagen(rutaImagen);
			producto.setStock(Integer.parseInt(stock));
			producto.setId(Integer.parseInt(id));
			
			request.setAttribute("producto", producto);
		}
		
		request.getRequestDispatcher("listadoProductoDetallado.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
