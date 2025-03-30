package com.testweb.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testweb.model.Usuario;
import com.testweb.service.UsuarioService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioService usuarioService;
	
	public void init(ServletConfig config) throws ServletException {
		usuarioService = new UsuarioService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		Usuario u = usuarioService.getUsuario(usuario, password);

		if(u != null) {
			if(request.getParameter("recordar") != null) {
				Cookie cookie = new Cookie("usuario", String.valueOf(u.getId()));
				cookie.setMaxAge(60*60);
				response.addCookie(cookie);
			}
			request.getSession().setAttribute("usuario", u);
			response.sendRedirect("index");
		} else {
			response.sendRedirect("login.jsp?error=1");	
		}
	}

}
