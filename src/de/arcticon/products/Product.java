package de.arcticon.products;

public class Product {
	
	private static short id;
	private static String name;
	private static float price;
	private static short amount;

	public Product(){
		
	}
	
	public Product(short id, String name, float price, short amount){
		setId(id);
		setName(name);
		setPrice(price);
		setAmount(amount);
	}
	
	public static short getId() {
		return id;
	}

	public static String getName() {
		return name;
	}

	public static float getPrice() {
		return price;
	}

	public static short getAmount() {
		return amount;
	}

	public static void setId(short id) {
		Product.id = id;
	}

	public static void setName(String name) {
		Product.name = name;
	}

	public static void setPrice(float price) {
		Product.price = price;
	}

	public static void setAmount(short amount) {
		Product.amount = amount;
	}
	
	@Override
	public String toString() {
		return getId() + "\t " + getName() + "\t " + getPrice() + "\t " + getAmount();
	}

}
