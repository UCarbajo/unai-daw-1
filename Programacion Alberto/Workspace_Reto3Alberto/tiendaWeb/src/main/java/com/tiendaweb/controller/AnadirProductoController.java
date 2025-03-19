package com.tiendaweb.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tiendaweb.model.Categoria;
import com.tiendaweb.service.CategoriaService;


@WebServlet("/anadirProducto")
@MultipartConfig
public class AnadirProductoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    CategoriaService categoriaService;  
    
	public void init(ServletConfig config) throws ServletException {
		categoriaService = new CategoriaService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO enviar categoria
		ArrayList<Categoria> listaCategoria = categoriaService.getCategoria();
		request.setAttribute("listaCategoria", listaCategoria);
		request.getRequestDispatcher("private/AnadirProducto.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
