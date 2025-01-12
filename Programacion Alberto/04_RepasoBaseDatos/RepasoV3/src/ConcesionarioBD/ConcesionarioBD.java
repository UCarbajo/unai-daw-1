package ConcesionarioBD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.PreparableStatement;

import BaseDatos.AccesoBD;
import Coches.Coches;

public class ConcesionarioBD extends AccesoBD {
	ArrayList<Coches> listaCoches = new ArrayList<Coches>();

	public ConcesionarioBD() {
		super(DRIVER_MYSQL, "concesionario", "root", "1234");

	}

	public ArrayList<Coches> getCoches() throws SQLException, ClassNotFoundException {

		String sql = "SELECT * FROM Coches";

		try {
			conectar();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				Coches coche = new Coches(rs.getString("Matricula"), rs.getString("Marca"), rs.getString("Modelo"),
						rs.getDouble("Precio"));
				listaCoches.add(coche);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		desconectar();
		return listaCoches;

	}

	public ArrayList<Coches> buscarCoches(Coches coche) {
		String sql = "SELECT * FROM Coches WHERE matricula Like ?";
		try {
			conectar();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%" + coche.getMatricula() + "%");

			rs = ps.executeQuery();

			while (rs.next()) {
				Coches nuevosCoches = new Coches(rs.getString("Matricula"), rs.getString("Marca"),
						rs.getString("Modelo"), rs.getDouble("Precio"));
				listaCoches.add(nuevosCoches);
			}
			desconectar();

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return listaCoches;

	}

	public void anadirCoches(Coches coche) {
		String sql = "INSERT INTO coches (matricula, marca, modelo, precio) VALUES ('" + coche.getMatricula() + "', '"
				+ coche.getMarca() + "', '" + coche.getModelo() + "', " + coche.getPrecio() + ")";

		try {
			conectar();
			st.execute(sql);

			desconectar();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminarCoches(Coches coche) {
		String sql = "DELETE FROM coches WHERE matricula = ? AND marca = ? AND modelo = ? AND precio = ?";
		try {
			conectar();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, coche.getMatricula());
			ps.setString(2, coche.getMarca());
			ps.setString(3, coche.getModelo());
			ps.setDouble(4, coche.getPrecio());
			ps.executeUpdate();

			desconectar();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
