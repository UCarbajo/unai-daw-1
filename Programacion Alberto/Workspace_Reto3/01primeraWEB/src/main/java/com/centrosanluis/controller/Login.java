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
import com.centrosanluis.model.Usuario;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HashMap<String, String> users = new HashMap<String, String>();
	private WebBD acceso = new WebBD();

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

		//TODO CREAMOS UNA INSTANCIA DE UN USUARIO OBTENIENDO LOS PARAMETROS DEL FORMULARIO
		Usuario user = new Usuario(request.getParameter("username"), request.getParameter("password"));

		//TODO CONSULTA A LA BD PARA COMPROBAR SI EL USUARIO EXISTE
		if (acceso.comprobarUsuario(user)) {
			//TODO GUARDAMOS EN LA SESION EL USUARIO QUE HA INICIADO SESIÓN
			//PONEMOS UNA "CLAVE" Y LO QUE ALMACENA (PARECIDO AL HASHMAP)
			request.getSession().setAttribute("usuario", user);
			
			//TODO EJEMPO DE PRUEBA PARA COMPROBAR QUE HA GUARDADO CORRECTAMENTE EL USUARIO
			Usuario nuevoUser = (Usuario) request.getSession().getAttribute("usuario");
			System.out.println("Se ha guardado correctamente " + nuevoUser.getUserName());
			
			response.sendRedirect("index.html");
		} else {
			//TODO EN CASO DE QUE NO EXISTA EL USUARIO, ASIGNAMOS UN ERROR
			request.getSession().setAttribute("error", "1");
			response.sendRedirect("login.jsp");
		}
	}

}
