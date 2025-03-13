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
import com.centrosanluis.service.RolService;

@WebServlet("/listadoRol")
public class ListadoRolController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RolService rolService;

	public void init(ServletConfig config) throws ServletException {
		rolService = new RolService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Rol> listaRoles = (ArrayList<Rol>) rolService.getRoles();
		request.setAttribute("listaRoles", listaRoles);
		request.getRequestDispatcher("private/listadoRol.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Rol r = new Rol();
		r.setId(Integer.parseInt(request.getParameter("id")));
		if (rolService.deleteRolbyID(r)) {
			response.sendRedirect("listadoRol");
		} else {
			// MENSAJE DE ERROR
		}
	}

}
