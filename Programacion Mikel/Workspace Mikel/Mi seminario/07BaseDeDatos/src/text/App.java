package text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	
	public static final String DRIVER_MYSQL="com.mysql.jdbc.Driver";
	public static final String DRIVER_GENERICO="sun.jdbc.odbc.JdbcOdbc.Driver";

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		// Test MySQL
		try {
			//0.Cargar driver
			Class.forName(DRIVER_MYSQL);
			
			//1.Conectar
			con = DriverManager.getConnection("jdbc:mysql://localhost/coches", "admincoches" , "z");
			System.out.println("Conexión establecida");
		
			//2.Crear flujo(autopista)
			st = con.createStatement();
		
			//3.Consulta unidireccional
			//st.executeUpdate("INSERT INTO coches (marca, modelo, color) VALUES ('Renault', 'Clio', 'Azul');");
			//System.out.println("Coche introducido correctamente");
			
			//3b. Consulta bidireccional
			// ojo, NO ES SEGURO
			String sql = "SELECT * from coches";
			rs = st.executeQuery(sql);
			
			mostrarRegistros(rs);
		}catch (Exception e){
			System.out.println("La hemos liado...");
		}

	}

	private static void mostrarRegistros(ResultSet rs) throws SQLException {
		//Cotillear el resulset mediante ResultSetMetadata
		ResultSetMetaData rsm = rs.getMetaData();
		int numColumnas = rsm.getColumnCount();
		System.out.println(numColumnas);
		
		//Imprimir cabecera
		String cabecera = "";
		for(int i = 1; i <= numColumnas; i++) {
			cabecera += rsm.getCatalogName(i); 
		}
		System.out.println(cabecera);
		
		//Imprimir cuerpo
		String linea = "";
		while(rs.next()) {
			
		}
	}

}
