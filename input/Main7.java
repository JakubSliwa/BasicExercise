package input;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {

		nettoBrutto();
	}

	static void nettoBrutto() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj typ wyliczenia (bn lub nb): ");
		String type = " ";
		do {
			type = scan.next();
			if (correctTypes(type)) {
				System.out.println("Nie poprawny typ. Podaj jeszcze raz");
			}
		} while (correctTypes(type));

		System.out.println("Podaj liczbę");
		int number = scan.nextInt();
		if ("nb".equals(type)) {
			brutto(number);

		}
		scan.close();
	}

	public static boolean correctTypes(String type) {
		return !"nb".equals(type) && !"bn".equals(type);
	}

	static void brutto(int ammount) {
		System.out.println("Przeliczam na brutto");
	}

	static void netto(int ammount) {
		System.out.println("Przeliczam na netto");
	}
}
/*
 * #### Zadanie 7
 * 
 * W pliku `Main7.java` stwórz metodę o sygnaturze `static void nettoBrutto()`,
 * która:
 * 
 * 1. Wczyta z konsoli typ wyliczenia dostępne wartości to: bn** - zamiana
 * brutto na netto nb** - zamiana netto na brutto 2. Wczyta z konsoli wartość do
 * zamiany a następnie dokona zamiany wg wcześniej określonego typu. W przypadku
 * otrzymania wartości innej niż możliwe **bn**, **nb** - program będzie pytał
 * do skutku. 3. Wywołaj metodę w metodzie `main`.
 * 
 * public class Main7 {
 * 
 * public static void main(String[] args) {
 * 
 * System.out.
 * println("Wpisz pożądaną konwersę nb - netto na brutto lub bn - brutto na netto"
 * ); Scanner scan = new Scanner(System.in); getInfo(scan);
 * System.out.println("Podaj wartość, którą chcesz konwertować: "); double a =
 * 
 * 
 * }
 * 
 * static void nettoBrutto() { double a }
 * 
 * static boolean getInfo(Scanner scan) { // while (!scan.hasNext()) { // //
 * scan.next(); // System.out.print("Podaj prawidłowy typ konwersj: "); while
 * (scan.hasNextLine()) { String line = scan.nextLine(); if ("nb".equals(line))
 * { System.err.println("Wybrałeś konwersję netto na brutto ");
 * 
 * break; } else if ("bn".equals(line)) {
 * System.err.println("Wybrałeś konwersję brutto na netto ");
 * 
 * break; } else { System.out.println("wybierz jeszcze raz"); } } return true; }
 * }/
 */