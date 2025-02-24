package com.centrosanluis.baseDatos;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.centrosanluis.controller.Usuario;
import com.mysql.cj.xdevapi.PreparableStatement;

public class WebBD extends AccesoBD {

	public WebBD() {
		super(DRIVER_MYSQL, "paginaWeb", "root", "");
		// TODO Auto-generated constructor stub
	}

	public boolean comprobarUsuario(Usuario user) {
		String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
		boolean existeUsuario = false;
		try {
			conectar();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassWord());
			rs = ps.executeQuery();
			if (rs.next()) {
				existeUsuario = true;
			}
			desconectar();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return existeUsuario;

	}
}
