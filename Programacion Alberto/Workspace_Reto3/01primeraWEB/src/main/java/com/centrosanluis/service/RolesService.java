package com.centrosanluis.service;

import java.util.ArrayList;

import com.centrosanluis.dao.RolesDAO;
import com.centrosanluis.model.Rol;

public class RolesService {

	private RolesDAO rolesDAO;

	public RolesService() {
		super();
		rolesDAO = new RolesDAO();
	}

	public ArrayList<Rol> getRoles() {

		return rolesDAO.getRoles();
	}

	public void addRol(Rol r) {
		rolesDAO.addRol(r);
		
	}
	public void updateRol(Rol r) {
		rolesDAO.addRol(r);
	}
}
