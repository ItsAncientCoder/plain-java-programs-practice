package com.plain.java.programs.java8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySqlConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		local_conn();
		remote_conn();
	}

	public static void local_conn() throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/configuration?useSSL=false";
		Connection connection = DriverManager.getConnection(URL,"config_rw","config");
		System.out.println(connection);
	}

	public static void remote_conn() throws SQLException, ClassNotFoundException {
		String URL = "jdbc:mysql://usidcvwciit08.idc1.level3.com:3306/configuration?useSSL=false";
		Connection connection = DriverManager.getConnection(URL,"config_rw","config");
		System.out.println(connection);
	}

}
