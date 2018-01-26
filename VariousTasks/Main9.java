package VariousTasks;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		double n1;
		double n2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Podaj pierwszą liczbę:");
		n1 = getNumber(scan);
		System.out.println("Liczba to: " + n1);

		System.out.println("Podaj drugą liczbę: ");
		n2 = getNumber(scan);
		System.out.println("Liczba to: " + n2);
		scan.close();

		whichIsGreater(n1, n2);
	}

	private static double getNumber(Scanner scan) {

		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Podaj	jeszcze	raz:	");
		}
		return scan.nextDouble();
	}

	private static void whichIsGreater(double a, double b) {

		if (a > b) {
			System.out.println("Większa liczba to: " + a);
		} else if (a < b) {
			System.out.println("Większa liczba to: " + b);
		} else {
			System.out.println("Liczby są równe ");
		}

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