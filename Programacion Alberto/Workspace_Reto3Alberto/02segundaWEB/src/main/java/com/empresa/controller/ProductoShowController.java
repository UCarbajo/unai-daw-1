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

@WebServlet("/productomostrar")
public class ProductoShowController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductoService productoService;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		productoService = new ProductoService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int pagina = 0;
		try {
			pagina = Integer.parseInt(request.getParameter("pagina"));
		} catch (NumberFormatException e) {
			pagina = 0;
		}
		String producto = request.getParameter("producto");
		if (producto == null) {
			producto = "";
		}
		int min = 0;
		try {
			min = Integer.parseInt(request.getParameter("precioMin"));
		} catch (NumberFormatException e) {
			min = 0;
		}
		int max = 1000;
		try {
			max = Integer.parseInt(request.getParameter("precioMax"));
		} catch (NumberFormatException e) {
			max = 1000;
		}
		ArrayList<Producto> listaProducto = productoService.getProductos(pagina, producto, min, max);
		request.setAttribute("listaProductos", listaProducto);
		request.setAttribute("producto", producto);
		request.setAttribute("pagina", pagina);
		request.setAttribute("min", min);
		request.setAttribute("max", max);

		request.getRequestDispatcher("private/productos.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String accion = request.getParameter("action");

		if (accion.equals("editar")) {
			String id = request.getParameter("id");
			request.getSession().setAttribute("id", id);
			response.sendRedirect("editarproducto");

		} else if (accion.equals("eliminar")) {
			String id = request.getParameter("id");
			productoService.deleteProducto(id);
			response.sendRedirect("productomostrar");
		}
	}
}
