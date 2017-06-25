package br.com.cassiolpaixao.lojaweb.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

	private static DatabaseConfig databaseConfig;

	public static DatabaseConfig getInstace() {
		if (databaseConfig == null) {
			databaseConfig = new DatabaseConfig();
		}
		return databaseConfig;
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/lojaweb-android", "root", "admin");
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(DatabaseConfig.getInstace().getConnection());
	}

}
