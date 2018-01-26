package VariousTasks;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {

		addNumbers();
	}

	public static void addNumbers() {

		double firstNumber;
		double secondNumber;
		Scanner scan = new Scanner(System.in);
		System.out.println("Wprowadź pierwszą liczbę: ");

		firstNumber = scan.nextDouble();
		if (scan.hasNextLine() || scan.hasNext()) {
			System.out.println("To nie jest liczba!");
		} else {
			System.out.println("Wprowadziłeś: " + firstNumber + ", teraz wprowadź drugą liczbę.");
		}

		secondNumber = scan.nextDouble();
		if (scan.hasNextLine() || scan.hasNext()) {
			System.out.println("To nie jest liczba!");
		} else {
			System.out.println("Twoje liczby to: " + firstNumber + ", " + secondNumber);
		}
		scan.close();
	}

}
/*
 * Zadanie 1
 * 
 * W pliku Main1.java stwórz dwie zmienne, o nazwach nr1, nr2, przechowujące
 * liczby całkowite. Następnie za pomocą instrukcji warunkowej if ... else,
 * wypisz w konsoli, która z nich jest większa. Wypisany string ma być wg.
 * wzoru. Większa liczba to 7.
 */