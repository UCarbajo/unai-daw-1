package com.centrosanluis.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HashMap<String, String> users = new HashMap<String, String>();
	
	public Login() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		users.put("admin", "1234");
		users.put("usuario", "password");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Estoy entrando por GET");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Estoy entrando por POST");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(users.containsKey(username) && users.get(username).equals(password)) {
			response.sendRedirect("index.html");
		}else {
			response.sendRedirect("login.jsp?error=1");
		}
	}

}
