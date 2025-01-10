package com.centrosanluis.AccesoBD;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.centrosanluis.tiendaBD.dto.ProductoDTO;

public class AccesoBDProducto extends AccesoBD {

	public AccesoBDProducto() throws ClassNotFoundException, SQLException {
		super(AccesoBD.DRIVER_MYSQL, "productos", "root", null);
	}

	public ProductoDTO getCoche(int id) throws SQLException {
		
		ProductoDTO coche = null;
		ResultSet rs = null;
		String sql = "SELECT * from coches where idCoche=" + id + ";";
		rs = st.executeQuery(sql);
		while (rs.next()) {
			String linea = "";
			coche = new ProductoDTO(rs.getString("marca"), rs.getString("modelo"), rs.getString("color"),
					rs.getDouble("precio"));
		}
		desconectar();
		return coche;
	}
}
