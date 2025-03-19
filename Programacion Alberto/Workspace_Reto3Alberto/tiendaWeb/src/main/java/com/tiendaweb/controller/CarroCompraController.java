package com.tiendaweb.controller;

import java.io.IOException;
import java.net.URLDecoder;
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

@WebServlet("/carroCompra")
public class CarroCompraController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProductoService productoService;
	
	public void init(ServletConfig config) throws ServletException {
		productoService = new ProductoService(); 
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie c: cookies) {
				if("carroCompra".equals(c.getName())) {
					ArrayList<Producto> carroProducto = productoService.getProductoByCookie(c);
					request.setAttribute("carroProducto", carroProducto);
				}
			}
			
		}
		request.getRequestDispatcher("carrocompra.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie c : cookies) {
				if("carroCompra".equals(c.getName())) {
					c.setMaxAge(0);
					response.addCookie(c);
					request.getSession().invalidate();
				}
			}
		}
		response.sendRedirect("carroCompra");
	}

}
