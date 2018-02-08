package oop_Exercises;

public class Burger {

	private String size;
	private int price;

	public Burger() {

	}

	public Burger(String size, int price) {
		this.size = size;
		this.price = price;
	}

	public String toString() {
		return "Size is: " + size + ", and price is: " + price;

	}
}
/*
 * Utwórz klasę `Burger` dodaj w niej atrybuty:
 * 
 * - size - price
 * 
 * 1. Utwórz konstruktor, który przyjmie i ustawi parametry `size`, `price` . 2.
 * Utwórz konstruktor bezargumentowy.
 */