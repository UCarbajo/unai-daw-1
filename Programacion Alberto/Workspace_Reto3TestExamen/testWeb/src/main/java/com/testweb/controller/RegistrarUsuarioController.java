package com.testweb.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testweb.model.Rol;
import com.testweb.model.Usuario;
import com.testweb.service.RolService;
import com.testweb.service.UsuarioService;

/**
 * Servlet implementation class RegistrarUsuarioController
 */
@WebServlet("/registro")
public class RegistrarUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioService usuarioServie;
	RolService rolService;
	
	public void init(ServletConfig config) throws ServletException {
		usuarioServie = new UsuarioService();
		rolService = new RolService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Rol> listaRoles = rolService.getRoles();
		request.setAttribute("listaRoles", listaRoles);
		request.getRequestDispatcher("registro.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		String rol = request.getParameter("rol");
		
		Usuario u = new Usuario();
		Rol r = new Rol();
		
		u.setPassword(password);
		u.setUsuario(usuario);
		r.setId(Integer.parseInt(rol));
		u.setRol(r);
		
		if(usuarioServie.anadirUsuario(u)) {
			response.sendRedirect("registro");
		}else {
			
		}
	}

}
