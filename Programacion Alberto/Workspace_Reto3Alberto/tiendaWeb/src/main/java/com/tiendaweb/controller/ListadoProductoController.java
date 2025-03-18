package com.tiendaweb.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tiendaweb.model.Producto;
import com.tiendaweb.service.ProductoService;

@WebServlet("/listadoProducto")
public class ListadoProductoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductoService productoService;

	public void init(ServletConfig config) throws ServletException {
		productoService = new ProductoService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Producto> listaProducto = productoService.getProducto();

		request.setAttribute("listaProducto", listaProducto);
		request.getRequestDispatcher("listadoProducto.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if ("carroCompra".equals(c.getName())) {
					String id = request.getParameter("id");
					// TODO primero Decoder, juntar y Encoder
					String carroDecoder = URLDecoder.decode(c.getValue(), "UTF8");
					String carro = carroDecoder + ";" + id;
					String carroEncoder = URLEncoder.encode(carro, "UTF-8");
					c.setValue(carroEncoder);
					response.addCookie(c);
				}else {
					String id = request.getParameter("id");
					Cookie cookie = new Cookie("carroCompra", id);
					cookie.setMaxAge(60*60*24);
					response.addCookie(cookie);
				}
			}
		}else {
			String id = request.getParameter("id");
			Cookie cookie = new Cookie("carroCompra", id);
			cookie.setMaxAge(60*60*24);
			response.addCookie(cookie);
		}
		response.sendRedirect("listadoProducto");
	}

}
