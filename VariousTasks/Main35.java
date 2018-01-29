package VariousTasks;

public class Main35 {

	final static double USD = 3.34;

	public static void main(String[] args) {

		System.out.println(convertToUsd(1300));
	}

	private static double convertToUsd(double zlotys) {

		return zlotys / USD;
	}
}

/*
 * W pliku Main3.java Napisz metodę convertToUsd, która przyjmuje parametr
 * zlotys, czyli kwotę w złotówkach. Funkcja ma zwrócić podaną kwotę w dolarach
 * amerykańskich. Jako przelicznik przyjmij wartość 4.04 PLN = 1 USD
 */