package repaso.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoBD {
	
	public static final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
	String tipoBaseDatos, baseDatos, userName, passWord;
	
	Connection con;
	Statement st;
	ResultSet rs;
	
	public AccesoBD(String tipoBaseDatos, String baseDatos, String userName, String passWord) {
		super();
		this.tipoBaseDatos = tipoBaseDatos;
		this.baseDatos = baseDatos;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public void conectar() throws ClassNotFoundException, SQLException {
		Class.forName(tipoBaseDatos);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + baseDatos, userName, passWord);
		
		System.out.println("Conexión establecida");
		st = con.createStatement();
	}
	
	public void desconectar() throws SQLException {
		if(rs!= null) {
			rs.close();
		}
		con.close();
		st.close();
	}
}
