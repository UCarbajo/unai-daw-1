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

@WebServlet("/inicio")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioService usuarioService;
	
	public void init(ServletConfig config) throws ServletException {
		usuarioService = new UsuarioService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie c:cookies) {
				if("usuario".equals(c.getName())) {
					int id = Integer.parseInt(c.getValue());
					Usuario u = usuarioService.getUsuarioById(id);
					request.setAttribute("usuario", u);
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
			}
		}
		request.getSession().removeAttribute("idUsuario");
		response.sendRedirect("inicio");
	}

}
