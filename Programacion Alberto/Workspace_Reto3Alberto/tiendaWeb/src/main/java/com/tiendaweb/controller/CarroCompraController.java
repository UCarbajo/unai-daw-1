package com.tiendaweb.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
					String[] productos = carroDecoder.split(";");
					ArrayList<Producto> carroProducto = productoService.getProductoByIDArray(productos);

					Map<Producto, Integer> carrito = new HashMap<>();
					for (Producto p : carroProducto) {
						carrito.put(p, carrito.getOrDefault(p, 0) + 1);
					}
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

	private void restarProducto(HttpServletResponse response, Cookie c, String id) throws UnsupportedEncodingException {
		String carroDecoder = URLDecoder.decode(c.getValue(), "UTF8");
		String[] listaID = carroDecoder.split(";");
		ArrayList<String> listaFiltrada = new ArrayList<>();
		boolean idRestado = false;
		for (String filtroID : listaID) {
			if (filtroID != null && !filtroID.equals(id)) {
				listaFiltrada.add(filtroID);
			} else if (!idRestado) {
				idRestado = true;
			} else {
				listaFiltrada.add(filtroID);
			}
		}

		StringBuilder nuevaCookie = new StringBuilder();
		for (String nuevoID : listaFiltrada) {
			if (nuevaCookie.length() > 0) {
				nuevaCookie.append(";");
			}
			nuevaCookie.append(nuevoID);
		}

		String carroEncoder = URLEncoder.encode(nuevaCookie.toString(), "UTF-8");
		c.setValue(carroEncoder);
		response.addCookie(c);
	}

	private void sumarProducto(HttpServletResponse response, Cookie c, String id) throws UnsupportedEncodingException {
		String carroDecoder = URLDecoder.decode(c.getValue(), "UTF-8");
		String nuevoCarro = carroDecoder + ";" + id;
		String carroEnconder = URLEncoder.encode(nuevoCarro, "UTF-8");
		c.setValue(carroEnconder);
		response.addCookie(c);
	}

}
