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

@WebServlet("/inicio")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if ("usuario".equals(c.getName())) {
					Usuario usuario = new Usuario();
					usuario.setId(Integer.parseInt(c.getValue()));
					request.setAttribute("usuario", usuario);
				}
			}
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
			if ("usuario".equals(c.getName())) {
				c.setMaxAge(0);
				response.addCookie(c);
				request.getSession().invalidate();
			}
		}
		response.sendRedirect("inicio");
	}

}
