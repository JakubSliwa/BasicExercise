package oop_Exercises;

public class Car {

	private String brand;
	private String model;
	private int price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "[Brand: " + brand + "], [Model: " + model + "], [Price: " + price;
	}
}

/**
 * #### Zadanie 5. Stwórz klasę `Car` posiadającą następujące atrybuty:
 * 
 * - brand - model - price
 * 
 * Stwórz metody dostępowe do ww. atrybutów tzw. gettery i settery.
 * 
 * Dopisz metodę `toString` wyświetlającą markę oraz cenę w jednej linii.
 */