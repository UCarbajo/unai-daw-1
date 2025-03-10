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
import com.centrosanluis.service.RolesService;

/**
 * Servlet implementation class ActualizarRolController
 */
@WebServlet("/actualizarrol")
public class ActualizarRolController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private RolesService rolesService;

	public void init(ServletConfig config) throws ServletException {
		rolesService = new RolesService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Rol> listaRoles = rolesService.getRoles();
		request.setAttribute("listaRoles", listaRoles);
		
		request.getRequestDispatcher("private/actualizarrol.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =  request.getParameter("selectRoles");
		String rol = request.getParameter("nuevoRol");
		if(!rol.isEmpty()) {
			Rol r = new Rol();
			r.setId(Integer.parseInt(id));
			r.setRol(rol);
			rolesService.updateRol(r);
		}
		response.sendRedirect("actualizarrol");
	}

}
