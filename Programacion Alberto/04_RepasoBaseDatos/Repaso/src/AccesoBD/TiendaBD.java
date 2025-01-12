package AccesoBD;

import java.sql.SQLException;
import java.util.ArrayList;

import Producto.Mandarinas;

public class TiendaBD extends AccesoBD {

	public TiendaBD() throws ClassNotFoundException, SQLException {
		super(AccesoBD.DRIVER_MYSQL, "Tienda", "root", "1234");
	}

	public ArrayList<Mandarinas> getMandarinas() {
		ArrayList<Mandarinas> listaMandarinas = new ArrayList<Mandarinas>();
		try {

			conectar();
			String sql = "SELECT * FROM Productos";
			rs = st.executeQuery(sql);

			Mandarinas mandarinas;

			while (rs.next()) {
				mandarinas = new Mandarinas(rs.getString("marca"), rs.getString("ciudad"), rs.getDouble("precio"));
				listaMandarinas.add(mandarinas);
			}
			desconectar();
		} catch (SQLException | ClassNotFoundException e) {

		}
		return listaMandarinas;

	}

	public void eliminarMandarinas(Mandarinas mandarina) throws SQLException {
		try {
			conectar();
			String sql = "DELETE FROM Productos WHERE marca = '" + mandarina.getMarca() + "' AND ciudad = '"
					+ mandarina.getPais() + "' AND precio = " + mandarina.getPrecio();
			int filasEliminadas = st.executeUpdate(sql);
			desconectar();
		} catch (SQLException | ClassNotFoundException e) {

		}

	}
}
