package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AccesoBD {

	public static final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
	private String tipoBD, baseDatos, userName, passWord;
	
	protected Connection con;
	protected Statement st;
	protected ResultSet rs;
	
	protected AccesoBD(String tipoBD, String baseDatos, String userName, String passWord) {
		super();
		this.tipoBD = tipoBD;
		this.baseDatos = baseDatos;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public void conectar() throws ClassNotFoundException, SQLException {
		Class.forName(tipoBD);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + baseDatos, userName, passWord);
		
		System.out.println("Conexión establecida");
		st = con.createStatement();
	}
	
	public void desconectar() throws SQLException {
		if(rs!=null) {
			rs.close();
		}
		if(con!=null) {
			con.close();
		}
		if(st!=null) {
			st.close();
		}
	}
}
