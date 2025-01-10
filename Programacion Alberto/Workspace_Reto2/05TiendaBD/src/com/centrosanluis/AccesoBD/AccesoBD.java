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

	public void conectar() throws ClassNotFoundException, SQLException {
		//CARGAMOS EL DRIVER
		Class.forName(tipoBD);
		
		//CREAR CONEXIÓN
		//URL mySQL -> jdbc:mysql://IP:PUERTO/NOMBRE_BASE_DE_DATOS
		//USER -> root
		//PASS -> NO TIENE
		con = DriverManager.getConnection("jdbc:mysql://localhost/" + this.bd, this.user, this.password);
		
		System.out.println("Conexión establecida");
		
		//CREAR Statement -> lo que utilizaremos para ejecutar SQL en la BD desde JAVA
		st = con.createStatement();
	}

	public void desconectar() throws SQLException {
		//if(rs!=null) {
			//rs.close;
		//}
		st.close();
		con.close();
	}
}
