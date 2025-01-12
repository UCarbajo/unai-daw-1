package AccesoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoBD {
	
	public static final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
	public String tipoBD;
	public String bd;
	public String userName;
	public String pass;

	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	
	public AccesoBD(String tipoBD, String bd, String userName, String pass) throws ClassNotFoundException, SQLException {
		super();
		this.tipoBD = tipoBD;
		this.bd = bd;
		this.userName = userName;
		this.pass = pass;
	}
	
	public void conectar() throws ClassNotFoundException, SQLException {
		Class.forName(tipoBD);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.bd, userName, pass);
		
		System.out.println("Te has conectado");
		st = con.createStatement();
	}
	
	public void desconectar() throws SQLException {
		if(rs!=null) {
			rs.close();
		}
		st.close();
		con.close();
	}
	
}

