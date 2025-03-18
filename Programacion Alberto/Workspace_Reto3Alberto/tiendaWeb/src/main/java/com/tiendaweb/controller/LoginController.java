package com.tiendaweb.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tiendaweb.model.Usuario;
import com.tiendaweb.service.UsuarioService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UsuarioService usuarioService;
	
	public void init(ServletConfig config) throws ServletException {
		usuarioService = new UsuarioService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Usuario u = usuarioService.getUsuario(request, response);
		if(u != null) {
			Cookie cookie = new Cookie("usuario", String.valueOf(u.getId()));
			cookie.setMaxAge(60*60);
			response.addCookie(cookie);
			response.sendRedirect("inicio");
		}else {
			response.sendRedirect("login");
		}
		
	}

}
