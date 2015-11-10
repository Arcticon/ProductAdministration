package de.arcticon.clients;

public class Client {
	
	private static short id;
	private static String name;
	private static String company;
	
	public Client(){
		
	}
	
	public Client(short id, String name, String company){
		setId(id);
		setName(name);
		setCompany(company);
	}
	
	public static short getId() {
		return id;
	}

	public static String getName() {
		return name;
	}

	public static String getCompany() {
		return company;
	}

	public static void setId(short id) {
		Client.id = id;
	}

	public static void setName(String name) {
		Client.name = name;
	}

	public static void setCompany(String company) {
		Client.company = company;
	}

	@Override
	public String toString() {
		return getId() + "\t" + getName() + "\t" + getCompany();
	}
	

}
