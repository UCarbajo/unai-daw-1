package com.testweb.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testweb.model.Categoria;
import com.testweb.model.Libro;
import com.testweb.service.CategoriaService;
import com.testweb.service.LibroService;

@WebServlet("/listalibros")
public class ListaLibrosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    LibroService libroService;
    CategoriaService categoriaService;
    
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		libroService = new LibroService();
		categoriaService = new CategoriaService();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		String categoria = request.getParameter("categoria");
		
		if( (titulo != null && !titulo.isEmpty()) || (autor != null && !autor.isEmpty()) || (categoria != null && !"0".equals(categoria))) {
			ArrayList<Libro> listaLibros = libroService.filtrarLibros(titulo, autor, categoria);
			request.setAttribute("listaLibros", listaLibros);
		}else {
			ArrayList<Libro> listaLibros = libroService.getLibros();
			request.setAttribute("listaLibros", listaLibros);
		}
		ArrayList<Categoria> listaCategoria = categoriaService.getCategoria();
		request.setAttribute("listaCategoria", listaCategoria);
		request.getRequestDispatcher("listaLibros.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

}
