package de.arcticon.clients;

public class Client {
	
	private static short id;
	private static String name;
	private static String company;
	
	public Client(){
		this.id = 0;
		this.name = "";
		this.company = "";
	}
	
	public Client(short id){
		this.id = id;
		this.name = "";
		this.company = "";
	}

	public Client(short id, String name){
		this.id = id;
		this.name = name;
		this.company = "";
	}
	
	public Client(short id, String name, String company){
		this.id = id;
		this.name = name;
		this.company = company;
	}
	
	@Override
	public String toString() {
		return this.id + "\t" + this.name + "\t" + this.company;
	}
	

}
