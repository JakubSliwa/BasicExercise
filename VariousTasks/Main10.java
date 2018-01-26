package VariousTasks;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {

		double n1;
		double n2;
		double n3;

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj pierwszą liczbę :");
		n1 = getNumber(scan);
		System.out.println("Podaj drugą liczbę :");
		n2 = getNumber(scan);
		System.out.println("Podaj trzecią liczbę :");
		n3 = getNumber(scan);
		scan.close();

		theGreatesNumber(n1, n2, n3);

	}

	private static double getNumber(Scanner scan) {

		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.println("To nie jest liczba! Podaj jeszcze raz!");
		}
		return scan.nextDouble();
	}

	private static void theGreatesNumber(double a, double b, double c) {
		if (a > b && a > c) {
			System.out.println("Największa liczba z: " + a + ", " + b + ", " + c + " to " + a);
		} else if (b > a && b > c) {
			System.out.println("Największa liczba z: " + a + ", " + b + ", " + c + " to " + b);
		} else if (c > a && c > b) {
			System.out.println("Największa liczba z: " + a + ", " + b + ", " + c + " to " + c);
		} else {
			System.out.println("Nie ma największej jednej liczby");
		}

	}
}

/*
 * Zadanie 2
 * 
 * W pliku Main2.java stwórz trzy zmienne, o nazwach nr1, nr2, nr3 ,
 * przechowujące liczby całkowite. Następnie za pomocą instrukcji warunkowej if
 * ... elseif ... else, wypisz na stronie, która z nich jest największa.
 * Wypisany string ma być wg. wzoru Największa z liczb 7,2,11 to 11.
 */