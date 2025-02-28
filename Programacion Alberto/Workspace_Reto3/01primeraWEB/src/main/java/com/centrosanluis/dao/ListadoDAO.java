package com.centrosanluis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.centrosanluis.model.Usuario;

public class ListadoDAO {

	ArrayList<Usuario> listadoUsuarios;
	
	public ArrayList<Usuario> getListado() {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		
		return null;
	}

}
