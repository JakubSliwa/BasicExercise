package VariousTasks;

import java.util.Scanner;

public class Main23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x;
		System.out.println("Podaj liczbę całkowitą");
		x = getNumber(scan);

		System.out.println(factorial(x));

		System.out.println(x);
		scan.close();

	}

	public static int factorial(int a) {
		int results = 1;

		for (int i = 1; i <= a; i++) {
			results *= i;
		}
		return results;

	}

	private static int getNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println("Podaj liczbę całkowitą");
		}
		return scan.nextInt();
	}
}

/*
 * W pliku Main15.java
 * 
 * Napisz program liczący wartość x!, gdzie ! oznacza silnię, a x jest zmienną.
 * Użyj do tego obu znanych Ci pętli. Silnia ma być zapisana do zmiennej
 * factorial. Po wyliczeniu silni wyświetl na stronie komunikat wg. wzoru:
 * Silnia 3! to 6.
 * 
 * Silnia to wynik mnożenia wszystkich liczb całkowitych od jeden do podanej
 * liczby włącznie, czyli:
 * 
 * 5! = 1*2*3*4*5 = 120 8! = 1*2*3*4*5*6*7*8 = 40320
 */