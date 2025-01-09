package com.centrosanluis.AccesoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoBD {

	public static final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
	public static final String DRIVER_GENERICO = "sun.jdbc.odbc.JdbcOdbc.Driver";

	// vars conexion
	String bd, user, password;
	String tipoBD;
	Connection con;
	Statement st;

	public AccesoBD(String tipoBD, String bd, String user, String password) throws ClassNotFoundException, SQLException {
		super();
		this.bd = bd;
		this.user = user;
		this.password = password;
		this.tipoBD = tipoBD;
		conectar();
	}

	private void conectar() throws ClassNotFoundException, SQLException {
		Class.forName(tipoBD);
		con = DriverManager.getConnection("jdbc:mysql://localhost/" + this.bd, this.user, this.password);
		System.out.println("Conexión establecida");
		st = con.createStatement();
	}

	private void desconectar() throws SQLException {
		st.close();
	}
}
