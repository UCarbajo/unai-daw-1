package com.eventosweb.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.DateFormatter;

import com.eventosweb.model.Eventos;
import com.eventosweb.service.EventosService;


@WebServlet("/anadirevento")
public class AnadirEventoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EventosService eventosService;

	public void init(ServletConfig config) throws ServletException {
		eventosService = new EventosService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("private/anadirEvento.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nombre = request.getParameter("nombre");
		String fecha = request.getParameter("fecha");
		String descripcion = request.getParameter("descripcion");
		
		Eventos e = new Eventos();
		e.setNombre(nombre);
		e.setDescripcion(descripcion);
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate fechaEvento = LocalDate.parse(fecha, formater);
		e.setFecha(fechaEvento);
		
		if(eventosService.addEvento(e)) {
			response.sendRedirect("anadirevento");
		}else {
			response.sendRedirect("anadirEvento.jsp?error=1");
		}
		
	}

}
