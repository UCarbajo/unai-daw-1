package com.empresa.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empresa.model.Usuario;
import com.empresa.service.UsuarioService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioService usuarioService;
    
    public void init(ServletConfig config) throws ServletException {
		super.init(config);
		usuarioService = new UsuarioService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Usuario usuario = usuarioService.getUsuario(username, password);
		if(usuario != null) {
			request.getSession().setAttribute("usuario", usuario);
			response.sendRedirect("index");
		}else {
			request.getSession().setAttribute("errorLogin", "1");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

}
