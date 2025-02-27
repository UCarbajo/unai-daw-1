package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccesoBDCoches extends AccesoBD {

	public AccesoBDCoches() throws ClassNotFoundException, SQLException {
		super(AccesoBD.DRIVER_MYSQL, "coches", "root", null);
	}
	
	public Coche getCoche(int id) throws SQLException {
		Coche c = null;
		ResultSet rs = null;
		String sql = "SELECT * from coches where id=" + id + ";";
		rs = st.executeQuery(sql);
		while (rs.next()) {
			String linea = "";
			c = new Coche(rs.getString("marca"), 
						  rs.getString("modelo") ,
						  rs.getString("color") );
		}
		return c;
	}
}
