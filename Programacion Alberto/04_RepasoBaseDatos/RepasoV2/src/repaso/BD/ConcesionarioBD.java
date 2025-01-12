package repaso.BD;

import java.sql.SQLException;
import java.util.ArrayList;

import repaso.concesionario.Coches;

public class ConcesionarioBD extends AccesoBD {

	public ConcesionarioBD(String tipoBaseDatos, String baseDatos, String userName, String passWord) {
		super(DRIVER_MYSQL, "Concesionario", "root", "1234");
	}

	public ArrayList<Coches> getCoches(){
		ArrayList<Coches> listaCoches = new ArrayList<Coches>();
		try {
			conectar();
			String sql = "SELECT * FROM Coches";
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				Coches coche = new Coches(rs.getString("matricula"), rs.getString("marca"), rs.getString("modelo"), rs.getDouble("precio"));
				listaCoches.add(coche);
			}
			desconectar();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaCoches;
	}
	
	public ArrayList<Coches> resultadoBusqueda(String nombre){
		ArrayList<Coches> listaCoches = new ArrayList<Coches>();
		String sql = "SELECT * FROM Coches WHERE marca like '%" + nombre + "%'";
		
		try {
			conectar();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				Coches coche = new Coches(rs.getString("matricula"), rs.getString("marca"), rs.getString("modelo"), rs.getDouble("precio"));
				listaCoches.add(coche);
			}
			desconectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaCoches;
	}
	
	public void insertCoche(String matricula, String marca, String modelo, Double precio){
		try {
			conectar();
			String sql = "INSERT INTO Coches (matricula, marca, modelo, precio) VALUES ('" + matricula + "', '" + marca + "', '" + modelo + "', " + precio+")";
			st.execute(sql);
			desconectar();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
