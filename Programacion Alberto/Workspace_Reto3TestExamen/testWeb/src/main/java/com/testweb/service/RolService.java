package com.testweb.service;

import java.util.ArrayList;

import com.testweb.dao.RolDAO;
import com.testweb.model.Rol;

public class RolService {

	RolDAO rolDAO;
	
	public RolService() {
		super();
		rolDAO = new RolDAO();		
	}

	public ArrayList<Rol> getRoles() {
		
		return rolDAO.getRoles();
	}
}
