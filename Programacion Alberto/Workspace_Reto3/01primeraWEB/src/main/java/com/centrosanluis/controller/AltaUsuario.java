package com.centrosanluis.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.baseDatos.WebBD;
import com.centrosanluis.model.Usuario;

/**
 * Servlet implementation class AltaUsuario
 */
@WebServlet("/altaUsuario")
public class AltaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private WebBD acceso = new WebBD();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO OBTENEMOS TODOS LOS DATOS DEL FORMULARIO DE ALTA USUARIO
		//TODO FALTA CONTROLAR LOS ERRORES (CAMPOS NO RELLENADOS, CAMPOS MAL RELLENADOS, ...)
		String name = request.getParameter("name");
		String lastName = request.getParameter("lastName");
		int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));
		String mail = request.getParameter("mail");
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		
		//TODO CREAMOS UNA INSTANCIA DEL USUARIO CON LOS DATOS DEL FORMULARIO
		Usuario user = new Usuario(name, lastName, mail, userName, passWord, phoneNumber);
		
		//TODO HACEMOS UNA CONSULTA A LA BD, SI SE AÑADE EL USUARIO CORRECTAMENTE, SE REDIRIGE AL USUARIO A LA PAGINA INDEX
		if(acceso.anadirUsuario(user)) {
			response.sendRedirect("index.html");
		//TODO SI EL USUARIO NO SE HA PODIDO AÑADIR, CREAMOS UN ERROR DE USUARIO PARA PODER INDICARLO EN ALTAUSUARIO.JSP
		}else {
			request.getSession().setAttribute("errorUsuario", "1");
			response.sendRedirect("altaUsuario.jsp");
		}
	}

}
