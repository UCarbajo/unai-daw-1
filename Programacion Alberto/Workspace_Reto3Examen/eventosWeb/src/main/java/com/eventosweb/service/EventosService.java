package com.eventosweb.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

import com.eventosweb.dao.AccesoBD;
import com.eventosweb.dao.EventosDAO;
import com.eventosweb.model.Eventos;

public class EventosService {
	EventosDAO eventosDAO;
	
	

	public EventosService() {
		super();
		eventosDAO = new EventosDAO();
	}

	public ArrayList<Eventos> getEventos() {
		
		return eventosDAO.getEventos();
	}

	public boolean addEvento(Eventos e) {
		// TODO Auto-generated method stub
		return eventosDAO.addEvento(e);
	}

	public void deleteEvento(Eventos e) {
		eventosDAO.deleteEvento(e);
		
	}

}
