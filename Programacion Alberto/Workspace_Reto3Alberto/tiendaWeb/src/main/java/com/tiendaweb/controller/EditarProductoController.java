package com.tiendaweb.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tiendaweb.model.Categoria;
import com.tiendaweb.model.Producto;
import com.tiendaweb.service.CategoriaService;
import com.tiendaweb.service.ProductoService;
import com.tiendaweb.service.UsuarioService;

@WebServlet("/EditarProducto")
public class EditarProductoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UsuarioService usuarioService;
    ProductoService productoService;
    CategoriaService CategoriaService;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		usuarioService = new UsuarioService();
		productoService = new ProductoService();
		CategoriaService = new CategoriaService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Producto p = productoService.getProductoByID(id);
		ArrayList<Categoria> listaCategoria = CategoriaService.getCategoria();
		request.setAttribute("listaCategoria", listaCategoria);
		request.setAttribute("producto", p);
		request.getRequestDispatcher("private/AnadirProducto.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

}
