package VariousTasks;

import java.util.Scanner;

public class Main24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a;
		int b;

		System.out.println("Podaj pierwszą liczbę");
		a = getNumbers(scan);

		System.out.println("Podaj drugą liczbę");
		b = getNumbers(scan);

		System.out.println("Podałeś: " + a + " i " + b);

		System.out.println("Największy wspólny dzielnik tych liczby to : " + getGCD(a, b));

		scan.close();
	}

	private static int getNumbers(Scanner scan) {
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println("Podaj liczbę całkowitą");
		}
		return scan.nextInt();
	}

	private static int getGCD(int a, int b) {
		int temporary;
		while (b != 0) {

			temporary = a;
			a = b;
			b = temporary % b;
		}
		return a;
	}

}

/*
 * W pliku Main16.java
 * 
 * Dodaj 2 zmiennej x i y będące dodatnimi liczbami całkowitymi. Napisz program
 * wyliczający największy wspólny dzielnik (greatest common divisor - GDC) dwóch
 * liczb. Skorzystaj z opisu na tej stronie. Wynik wyświetl na stronie wraz z
 * liczbami, dla których został wyliczony wg. wzoru Dla liczb 420 i 168 GDC to:
 * 84
 */