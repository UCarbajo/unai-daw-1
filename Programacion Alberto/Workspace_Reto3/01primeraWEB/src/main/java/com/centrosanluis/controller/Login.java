package com.centrosanluis.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.baseDatos.WebBD;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HashMap<String, String> users = new HashMap<String, String>();
	private WebBD acceso = new WebBD();
	private Usuario user;

	public Login() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		users.put("admin", "1234");
		users.put("usuario", "password");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Estoy entrando por GET");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Estoy entrando por POST");

		user = new Usuario(request.getParameter("username"), request.getParameter("password"));

		if (acceso.comprobarUsuario(user)) {
			response.sendRedirect("index.html");
			response.addCookie(new Cookie("usuario", user.toString()));
		} else {
			request.getSession().setAttribute("error", "1");
			response.sendRedirect("login.jsp");
		}
	}

}
