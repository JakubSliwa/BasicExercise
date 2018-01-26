package VariousTasks;

import java.util.Scanner;

public class Main21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double points;
		System.out.println("Wprowadź liczbę punktów z testu: ");
		points = getPoints(scan);

		if (points < 0) {
			System.out.println("Błąd. Liczba punktów mniejsza od 0");
		} else if (points > 100) {
			System.out.println("Błąd. Liczba punktów większa od 100");
		} else {
			System.out.println("Liczba zdobytych punktów to: " + points);
		}
		scan.close();
		getGrade(points);

	}

	private static double getPoints(Scanner scan) {
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.println("To nie jest liczba. Podaj jeszcze raz.");
		}
		return scan.nextDouble();
	}

	private static void getGrade(double a) {
		if (a <= 39) {
			System.out.println("Ocena niedosteczna");
		} else if (a <= 54) {
			System.out.println("Ocena dopuszczająca");
		} else if (a <= 69) {
			System.out.println("Ocena dostateczna");
		} else if (a <= 84) {
			System.out.println("Ocena dobra");
		} else if (a <= 98) {
			System.out.println("Ocena bardzo dobra");
		} else if (a <= 100) {
			System.out.println("Ocena celująca");
		}

	}
}

/*
 * W pliku Main13.java napisz program, który wystawi ocenę z testu.
 * 
 * 0 - 39 pkt - ocena niedostateczna 40 - 54 pkt - ocena dopuszczająca 55 - 69
 * pkt - ocena dostateczna 70 - 84 pkt - ocena dobra 85 - 98 pkt - ocena bardzo
 * dobra 99 - 100 pkt - ocena celująca
 * 
 * Stwórz zmienną points, do której będzie przypisany wynik z testu. Na początku
 * sprawdź czy ilość punktów jest większa bądź równa 0, jeśli nie wypisz na
 * stronie komunikat Ilość punktów mniejsza niż 0. Na początku sprawdź czy ilość
 * punktów jest mniejsza bądź równa 100, jeśli nie wypisz na stronie komunikat
 * Ilość punktów większa niż 100. Następnie sprawdź jaka ocena odpowiada danej
 * ilości punktów i wypisz ją na stronie wg. wzoru Wynik: ocena dobra Rozwiąż to
 * zadanie używając raz konstrukcji if ... elseif ... else.
 */