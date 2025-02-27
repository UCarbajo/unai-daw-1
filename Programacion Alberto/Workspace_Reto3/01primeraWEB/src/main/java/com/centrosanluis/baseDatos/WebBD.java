package com.centrosanluis.baseDatos;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.centrosanluis.model.Usuario;

public class WebBD extends AccesoBD {

	public WebBD() {
		super(DRIVER_MYSQL, "paginaWeb", "root", "1234");
		// TODO Auto-generated constructor stub
	}

	public boolean comprobarUsuario(Usuario user) {
		String sql = "SELECT username FROM usuarios WHERE username = ? AND password = ?";
		try {
			conectar();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassWord());
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			desconectar();
		}
		return false;

	}

	public boolean anadirUsuario(Usuario user) {
		// TODO PREPARAMOS UNA CONSULTA PARA COMPROBAR SI EXISTE ALGUIEN CON EL MISMO
		// NOMBRE DE USUARIO
		try {
			String sql = "SELECT username, mail FROM usuarios WHERE username = ? OR mail = ?";
			conectar();
			// TODO EXECUTAMOS LA CONSULTA Y LO RECIBE EL RESULTSET(rs)
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getMail());
			rs = ps.executeQuery();
			// TODO SI EL RESULTSET NO CONTIENE UNA LINEA (NO HAY OTRO USUARIO O CORREO CON
			// EL MISMO NOMBRE)
			// PREPARAMOS LA INSERCCION DE UN NUEVO USUARIO A LA BASE DE DATOS
			if (!rs.next()) {
				sql = "INSERT INTO usuarios(name, lastname, mail, username, password, phonenumber) VALUES (?, ?, ?, ?, ?, ?)";
				ps = con.prepareStatement(sql);
				ps.setString(1, user.getName());
				ps.setString(2, user.getLastName());
				ps.setString(3, user.getMail());
				ps.setString(4, user.getUserName());
				ps.setString(5, user.getPassWord());
				ps.setString(6, String.valueOf(user.getPhoneNumber()));

				// TODO DEVOLVEMOS EL BOOLEAN INDICANDO SI SE HA AÑADIDO(TRUE) O NO(FALSE) UN
				// USUARIO
				return ps.executeUpdate() > 0;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			desconectar();
		}
		return false;

	}

}