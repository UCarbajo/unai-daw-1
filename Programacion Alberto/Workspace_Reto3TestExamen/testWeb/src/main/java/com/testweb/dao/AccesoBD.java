package com.testweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccesoBD {

	private static final String URL = "jdbc:mysql://localhost:3306/webBD";
	private static final String username = "root";
	private static final String password = "1234";

	static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	static void closeConnection(Connection con, ResultSet rs, PreparedStatement ps) {
		try {
			if (con != null) {
				con.close();
			}
			if(rs != null) {
				rs.close();
			}
			if(ps != null) {
				ps.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
