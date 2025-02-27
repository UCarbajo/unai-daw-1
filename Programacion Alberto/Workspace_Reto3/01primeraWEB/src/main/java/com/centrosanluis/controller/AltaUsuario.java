package com.centrosanluis.controller;

import java.io.IOException;

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
@WebServlet("/registro")
public class AltaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private WebBD acceso = new WebBD();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO OBTENEMOS TODOS LOS DATOS DEL FORMULARIO DE ALTA USUARIO
		// TODO FALTA CONTROLAR LOS ERRORES (CAMPOS NO RELLENADOS, CAMPOS MAL RELLENADOS, ...)
		String name = request.getParameter("name");
		String lastName = request.getParameter("lastName");
		String phoneNumber = request.getParameter("phoneNumber");
		String mail = request.getParameter("mail");
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");

		// TODO COMPROBAMOS QUE LOS CAMPOS OBLIGATORIOS RELLENADOS NO ESTEN VACIOS (RELLENADO CON ESPACIOS)
		try {
			if (!name.isBlank() && !lastName.isBlank() && !phoneNumber.isBlank() && !mail.isBlank() && !userName.isBlank() && !passWord.isBlank()) {
				// TODO CREAMOS UNA INSTANCIA DEL USUARIO CON LOS DATOS DEL FORMULARIO
				Usuario user = new Usuario(name, lastName, mail, userName, passWord, Integer.parseInt(phoneNumber));

				// TODO HACEMOS UNA CONSULTA A LA BD, SI SE AÑADE EL USUARIO CORRECTAMENTE, 	
				// SE REDIRIGE AL USUARIO A LA PAGINA INDEX
				if (acceso.anadirUsuario(user)) {
					response.sendRedirect("index.html");
				} else {
					// TODO SI EL USUARIO NO SE HA PODIDO AÑADIR (USERNAME O CORREO REPETIDO),
					// CREAMOS UN ERROR DE USUARIO PARA PODER INDICARLO EN ALTAUSUARIO.JSP
					request.getSession().setAttribute("errorUsuario", "1");
					response.sendRedirect("altaUsuario.jsp");
				}
			}else {
				//TODO SI ALGUN CAMPO NO ESTA RELLENADO CORRECTAMENTE (RELLANDO CON ESPACIOS), LANZAMOS UN ERROR
				request.getSession().setAttribute("errorCampo", "1");
				response.sendRedirect("altaUsuario.jsp");
			}
		}catch(NumberFormatException e) {
			// TODO SI INTRODUCE LETRAS EN EL CAMPO DE NUMERO DE TELEFONO
			// CAZAMOS EL ERROR Y MOSTRAMOS MENSAJE DE ERROR
			request.getSession().setAttribute("errorCampo", "1");
			response.sendRedirect("altaUsuario.jsp");
		}

	}

}
