package de.arcticon.products;

public class Product {
	
	private static short id;
	private static String name;
	private static float price;
	private static short amount;
	
	public Product(){
		
	}
	
	public Product(short id, String name, float price, short amount){
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return this.id + "\t " + this.name + "\t " + this.price + "\t " + this.amount;
	}

}
