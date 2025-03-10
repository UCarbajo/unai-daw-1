package com.centrosanluis.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.model.Rol;
import com.centrosanluis.model.Usuario;
import com.centrosanluis.service.ListadoService;
import com.centrosanluis.service.RolesService;
import com.centrosanluis.service.UsuarioService;


@WebServlet("/listadoUsuarios")
public class ListadoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Usuario> listaUsuarios;
	ArrayList<Rol> listaRoles;
	ListadoService listadoService;
	UsuarioService usuarioService;
	RolesService rolesService;
	
    public ListadoController() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	listadoService = new ListadoService();
    	usuarioService = new UsuarioService();
    	rolesService = new RolesService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		listaUsuarios = listadoService.getListado();
		request.setAttribute("listaUsuarios", listaUsuarios);
		request.getRequestDispatcher("private/listado.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String boton = request.getParameter("boton");
		String mail = request.getParameter("mail");
		if(boton.equals("eliminar")) {
			usuarioService.deleteUser(mail);
			response.sendRedirect("listadoUsuarios");
		}else if(boton.equals("editar")) {
			Usuario u = usuarioService.getUser(mail);
			request.setAttribute("usuario", u);
			listaUsuarios = listadoService.getListado();
			listaRoles = rolesService.getRoles();
			request.setAttribute("listaRoles", listaRoles);
			request.setAttribute("listaUsuarios", listaUsuarios);
			request.getRequestDispatcher("private/listado.jsp").forward(request, response);
		}else if(boton.equals("guardar")) {
			Usuario u = crearUsuario(request);
			usuarioService.updateUsuario(u);
			response.sendRedirect("listadoUsuarios");
		}
		
	}

	private Usuario crearUsuario(HttpServletRequest request) {
		Usuario user = new Usuario();
		Rol rol = new Rol();
		user.setName(request.getParameter("nombre"));
		user.setLastName(request.getParameter("apellido"));
		user.setPhoneNumber(Integer.parseInt(request.getParameter("telefono")));
		user.setMail(request.getParameter("email"));
		user.setUserName(request.getParameter("usuario"));
		
		rol.setId(Integer.parseInt(request.getParameter("rol")));
		user.setRol(rol);
		
		return user;
	}

}
