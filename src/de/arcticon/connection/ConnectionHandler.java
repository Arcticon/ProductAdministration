package de.arcticon.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import de.arcticon.clients.Client;

public class ConnectionHandler {
	
	public ConnectionHandler(){		
		
	}
	
	public Connection buildConnection(String server, String dbName, String user, String pw){
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://" + server + ":3306/" + dbName, user, pw);
			
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Statement buildStatement(Connection connection){
		try {
			Statement statement = connection.createStatement();
			
			return statement;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ResultSet buildResultSet(Statement statement, String query){
		try {
			ResultSet resultset = statement.executeQuery(query);
			return resultset;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
