package com.centrosanluis.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.model.Rol;
import com.centrosanluis.model.Usuario;
import com.centrosanluis.service.RolesService;
import com.centrosanluis.service.UsuarioService;

/**
 * Servlet implementation class AltaUsuario
 */
@WebServlet("/registro")
public class registroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioService usuarioService;
	RolesService rolesService;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		usuarioService = new UsuarioService();
		rolesService = new RolesService();
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("listaRoles", rolesService.getRoles());
		request.getRequestDispatcher("registro.jsp").forward(request, response);
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
		String id = request.getParameter("rolID");

		// TODO COMPROBAMOS QUE LOS CAMPOS OBLIGATORIOS RELLENADOS NO ESTEN VACIOS (RELLENADO CON ESPACIOS)
		try {
			if (comprobarCampos(name, lastName, phoneNumber, mail, userName, passWord)) {
				// TODO CREAMOS UNA INSTANCIA DEL USUARIO CON LOS DATOS DEL FORMULARIO
				Rol rol = new Rol();
				rol.setId(Integer.parseInt(id));
				Usuario user = new Usuario(name, lastName, mail, userName, passWord, Integer.parseInt(phoneNumber), rol );

				// TODO HACEMOS UNA CONSULTA A LA BD, SI SE AÑADE EL USUARIO CORRECTAMENTE, 	
				// SE REDIRIGE AL USUARIO A LA PAGINA INDEX
				if (usuarioService.addUser(user)) {
					response.sendRedirect("private/index.jsp");
				} else {
					// TODO SI EL USUARIO NO SE HA PODIDO AÑADIR (USERNAME O CORREO REPETIDO),
					// CREAMOS UN ERROR DE USUARIO PARA PODER INDICARLO EN ALTAUSUARIO.JSP
					request.getSession().setAttribute("errorUsuario", "1");
					response.sendRedirect("registro.jsp");
				}
			}else {
				//TODO SI ALGUN CAMPO NO ESTA RELLENADO CORRECTAMENTE (RELLANDO CON ESPACIOS), LANZAMOS UN ERROR
				request.getSession().setAttribute("errorCampo", "1");
				response.sendRedirect("registro.jsp");
			}
		}catch(NumberFormatException e) {
			// TODO SI INTRODUCE LETRAS EN EL CAMPO DE NUMERO DE TELEFONO
			// CAZAMOS EL ERROR Y MOSTRAMOS MENSAJE DE ERROR
			request.getSession().setAttribute("errorCampo", "1");
			response.sendRedirect("registro.jsp");
		}

	}

	private boolean comprobarCampos(String... campos) {
		for(String campo:campos) {
			if(!campo.isBlank()) {
				return true;
			}
		}
		return false;
	}

}
