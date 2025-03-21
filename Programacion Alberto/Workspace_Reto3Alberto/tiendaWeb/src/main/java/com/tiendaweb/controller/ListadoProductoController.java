package com.tiendaweb.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
		String carroCompra = "";
		String productoID = request.getParameter("id");
		
		for (Cookie c : cookies) {
			if ("carroCompra".equals(c.getName())) {
				carroCompra = URLDecoder.decode(c.getValue(), "UTF-8");
				break;
			}
		}
		
		Map<String, Integer> carro = new HashMap<String, Integer>();
		if(!carroCompra.isEmpty()) {
			String[] items = carroCompra.split(",");
			for(String i : items) {
				String[] partes = i.split(":");
				carro.put(partes[0], Integer.parseInt(partes[1]));
			}
		}
		carro.put(productoID, carro.getOrDefault(productoID, 0) + 1);
		
		StringBuilder strBuilder = new StringBuilder();
		for(Map.Entry<String, Integer> entry: carro.entrySet()) {
			if(strBuilder.length() > 0) strBuilder.append(",");
			strBuilder.append(entry.getKey()).append(":").append(entry.getValue());
		}
		
		Cookie cookie = new Cookie("carroCompra", URLEncoder.encode(strBuilder.toString(), "UTF-8"));
		cookie.setMaxAge(60*60*24);
		response.addCookie(cookie);
		
		response.sendRedirect("listadoProducto");
	}

}
