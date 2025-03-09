package com.centrosanluis.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.model.Rol;
import com.centrosanluis.service.RolesService;


@WebServlet("/anadirrol")
public class AnadirRolController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private RolesService rolesService; 

    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	rolesService = new RolesService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("private/anadirrol.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String rol = request.getParameter("nuevoRol");
		Rol r = new Rol();
		r.setRol(rol);
		rolesService.addRol(r);
		response.sendRedirect("anadirrol");
		
	}

}
