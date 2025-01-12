package AccesoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoBD {
	public static final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
	protected String tipoBaseDatos, baseDatos, userName, passWord;
	protected Connection con;
	protected Statement st;
	protected ResultSet rs;
	
	public AccesoBD(String tipoBaseDatos, String baseDatos, String userName, String passWord) {
		super();
		this.tipoBaseDatos = tipoBaseDatos;
		this.baseDatos = baseDatos;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public void conectar() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_MYSQL);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + baseDatos, userName, passWord);
		
		System.out.println("Conectado");
		st = con.createStatement();
	}
	
	public void desconectar() throws SQLException {
		if(con!=null) {
			con.close();
		}
		if(st!=null) {
			st.close();
		}
		if(rs!=null) {
			rs.close();
		}
	}
}
