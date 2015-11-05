package de.arcticon.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import de.arcticon.clients.Client;

public class MainClass {
	

	private static String dbName;
	private static String user;
	private static String pw;

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
//		System.out.print("Database: ");
//		
//		dbName = s.next();
		
		System.out.print("Username: ");
		
		user = s.next();
		
		System.out.print("PW: ");
		
		pw = s.next();
		
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://62.75.209.133:3306/Github", user, pw);
			
			Statement state = con.createStatement();
			
			ResultSet rs = state.executeQuery("Select * from Clients");
			
			System.out.println("ID\tName\tCompany");
			
			while(rs.next()){
				Client c = new Client(rs.getShort(1), rs.getString(2), rs.getString(3));
				System.out.println(c.toString());
				
			}
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
