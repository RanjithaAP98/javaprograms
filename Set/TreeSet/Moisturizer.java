package com.xworkz.collectionconcept.set;

public class Moisturizer {
	
	private String name;
	private String type;
	private int price;
	
	public Moisturizer(String name, String type, int price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Moisturizer [name=" + name + ", type=" + type + ", price=" + price + "]";
	}

}
