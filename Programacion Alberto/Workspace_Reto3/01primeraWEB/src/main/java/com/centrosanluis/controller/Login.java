package com.centrosanluis.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.model.Usuario;
import com.centrosanluis.service.UsuarioService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioService usuarioService;
	
	public Login() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		usuarioService = new UsuarioService();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Estoy entrando con POST");
		
		Usuario usuario = new Usuario();
		
		usuario.setUserName(request.getParameter("username"));
		usuario.setPassWord(request.getParameter("password"));
		
		Usuario usuarioLogin = usuarioService.login(usuario);

		if(usuarioLogin!=null) {
			request.getSession().setAttribute("usuario", usuarioLogin);
			response.sendRedirect("private/index.jsp");
		}else {
			response.sendRedirect("login.jsp?error=1");
		}
	}

}
