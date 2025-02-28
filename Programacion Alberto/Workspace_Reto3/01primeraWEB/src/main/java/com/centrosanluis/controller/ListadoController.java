package com.centrosanluis.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.model.Usuario;
import com.centrosanluis.service.ListadoService;


@WebServlet("/listadoUsuarios")
public class ListadoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Usuario> listaUsuarios;
	ListadoService listadoService;
	
    public ListadoController() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	listadoService = new ListadoService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//llamo al service para obtener todos los usuarios
		
		//añado en la request el atributo (no sesion) listado usuarios
				
		//encadeno la peticion y la envio a listado.jsp
		
		listaUsuarios = listadoService.getListado();
		request.setAttribute("listaUsuarios", listaUsuarios);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
