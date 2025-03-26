package com.tiendaweb.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
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

@WebServlet("/carroCompra")
public class CarroCompraController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductoService productoService;

	public void init(ServletConfig config) throws ServletException {
		productoService = new ProductoService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if ("carroCompra".equals(c.getName())) {
					String carro = c.getValue();
					String carroDecoder = URLDecoder.decode(carro, "UTF-8");
					String[] productos = carroDecoder.split(",");

					Map<String, String> carroItem = new LinkedHashMap<String, String>();
					for (String producto : productos) {
						String[] itemID = producto.split(":");
						carroItem.put(itemID[0], itemID[1]);
					}
					Map<Producto, Integer> carrito = productoService.getProductoByIDArray(carroItem);
					request.setAttribute("carrito", carrito);
				}
			}

		}
		request.getRequestDispatcher("carrocompra.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if ("carroCompra".equals(c.getName())) {
					String action = request.getParameter("action");
					String id = request.getParameter("id");
					switch (action) {
					case "sumar":
						sumarProducto(response, c, id);
						break;
					case "restar":
						restarProducto(response, c, id);
						break;
					case "vaciar":
						vaciarCarrito(response, c);
						break;
					case "eliminar":
						eliminarProducto(response, c, id);
						break;
					}
				}
			}
		}
		response.sendRedirect("carroCompra");
	}

	private void vaciarCarrito(HttpServletResponse response, Cookie c) {
		c.setMaxAge(0);
		response.addCookie(c);
	}

	private void eliminarProducto(HttpServletResponse response, Cookie c, String id) throws UnsupportedEncodingException {
		String carroDecoder = URLDecoder.decode(c.getValue(), "UTF-8");
		Map<String, String> listaFiltrada = new LinkedHashMap<String, String>();
		String[] listaID = carroDecoder.split(",");
		for (String item: listaID) {
			String[] itemPart = item.split(":");
			if(!id.equals(itemPart[0])) {
				listaFiltrada.put(itemPart[0], itemPart[1]);
			}
		}
		StringBuilder str = new StringBuilder();
		for(Map.Entry<String, String> entry : listaFiltrada.entrySet()) {
			if(str.length() > 0 ) str.append(",");
			str.append(entry.getKey()).append(":").append(entry.getValue());
		}
		if(str.isEmpty()) {
			vaciarCarrito(response, c);
		}else {
			c.setValue(URLEncoder.encode(str.toString(), "UTF-8"));
			response.addCookie(c);
		}
	}
	
	private void restarProducto(HttpServletResponse response, Cookie c, String id) throws UnsupportedEncodingException {
		String carroDecoder = URLDecoder.decode(c.getValue(), "UTF8");
		Map<String, String> listaFiltrada = new LinkedHashMap<String, String>();

		String[] listaID = carroDecoder.split(",");

		for (String item : listaID) {
			String[] itemPart = item.split(":");
			String idRestar = itemPart[0];
			int cantidad = Integer.valueOf(itemPart[1]);
			if(id.equals(idRestar)) {
				cantidad = cantidad - 1;
			}
			if(cantidad != 0){
				listaFiltrada.put(idRestar, String.valueOf(cantidad));
			}
			
		}
		
		StringBuilder str = new StringBuilder();
		for(Map.Entry<String, String> entry : listaFiltrada.entrySet()) {
			if(str.length() > 0) str.append(",");
			str.append(entry.getKey()).append(":").append(entry.getValue());
		}
		
		if(!str.isEmpty()) {
			c.setValue(URLEncoder.encode(str.toString(), "UTF-8"));
			response.addCookie(c);
		}else {
			c.setMaxAge(0);
			response.addCookie(c);
		}
		
	}

	private void sumarProducto(HttpServletResponse response, Cookie c, String id) throws UnsupportedEncodingException {
		String carroDecoder = URLDecoder.decode(c.getValue(), "UTF8");
		Map<String, String> listaFiltrada = new LinkedHashMap<String, String>();
		
		String[] listaID = carroDecoder.split(",");
		
		for (String item : listaID) {
			String[] itemPart = item.split(":");
			if(id.equals(itemPart[0])) {
				int cantidad = Integer.parseInt(itemPart[1]);
				listaFiltrada.put(itemPart[0], String.valueOf(cantidad+1));
				continue;
			}
			listaFiltrada.put(itemPart[0], itemPart[1]);
			
		}
		
		StringBuilder str = new StringBuilder();
		for(Map.Entry<String, String> entry : listaFiltrada.entrySet()) {
			if(str.length() > 0) str.append(",");
			str.append(entry.getKey()).append(":").append(entry.getValue());
		}
		c.setValue(URLEncoder.encode(str.toString(), "UTF-8"));
		response.addCookie(c);
	}

}
