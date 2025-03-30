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

@WebServlet("/index")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioService usuarioService;

	public void init(ServletConfig config) throws ServletException {
		usuarioService = new UsuarioService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if ("usuario".equals(c.getName())) {
					String id = c.getValue();
					Usuario u = usuarioService.getUsuarioByID(id);
					request.setAttribute("usuario", u);
				}
			}
		} else {
			Usuario u = (Usuario) request.getSession().getAttribute("usuario");
			if (u != null) {
				request.setAttribute("usuario", u);
			}

		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if ("usuario".equals(c.getName())) {
					c.setMaxAge(0);
					response.addCookie(c);
				}
			}
			request.getSession().invalidate();
			request.getRequestDispatcher("index.jsp").forward(request, response);

		}
	}
}
