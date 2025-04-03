package com.eventosweb.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eventosweb.model.Eventos;
import com.eventosweb.service.EventosService;


@WebServlet("/listaeventos")
public class ListaEventosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EventosService eventosService;   

	public void init(ServletConfig config) throws ServletException {
		eventosService = new EventosService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Eventos> listaEventos = eventosService.getEventos();
		request.setAttribute("listaEventos", listaEventos);
		request.getRequestDispatcher("private/listaEventos.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		Eventos e = new Eventos();
		e.setId(Integer.parseInt(id));
		eventosService.deleteEvento(e);
		response.sendRedirect("listaeventos");
	}

}
