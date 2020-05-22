package br.api.dao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactoryDB {

	public Connection getConnection() {

		try {
			// Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/mercado?useSSL=false", "root", "abcd123");
		} catch (Exception e) {
			throw new RuntimeException("Erro sql down" + e);

		}

	}
}
    

