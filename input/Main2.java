package input;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		operations();
	}

	static void operations() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj pierwszą liczbę: ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Podaj	jeszcze	raz:	");
		}
		double a = scan.nextDouble();
		
		System.out.println("Podaj drugą liczbę : ");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Podaj drugą liczbę jeszcze raz:	");
		}
		double b = scan.nextDouble();

		double result1 = a + b;
		double result2 = a - b;
		double result3 = a * b;
		double result4 = a / b;
		System.out.println("Wynik dodawania to: " + result1);
		System.out.println("Wynik odejmowania to: " + result2);
		System.out.println("Wynik mnożenia to: " + result3);
		if (b != 0) {
			System.out.println("Wynik dzielenia to: " + result4);
		} else {
			System.err.println("Nie dziel przez zero!");
		}

		scan.close();
	}
}

/*
 * #### Zadanie 2
 * 
 * W pliku `Main2.java` stwórz metodę o sygnaturze `static void operations()`.
 * 
 * 1. Uzupełnij ciało metody tak, by wczytała 2 liczby a następnie wyświetliła
 * na konsoli wynik dodawania, odejmowania, mnożenia i dzielenia. 2. Wywołaj
 * metodę w metodzie `main`.
 */

/*
 * while (!scan.hasNextInt()) { scan.next();
 * System.out.print("Podaj	jeszcze	raz:	"); } double a = scan.nextDouble();
 * System.out.println("Podaj drugą liczbę : "); while (!scan.hasNextInt()) {
 * scan.next(); System.out.print("Podaj drugą liczbę jeszcze raz:	"); } double
 * b = scan.nextDouble();
 * 
 * double result1 = a + b; double result2 = a - b; double result3 = a * b;
 * double result4; try { result4 = a / b; } catch (ArithmeticException e) {
 * System.err.println("Nie dziel przez zero!"); return; }
 * System.out.println("Wynik dodawania to: " + result1);
 * System.out.println("Wynik odejmowania to: " + result2);
 * System.out.println("Wynik mnożenia to: " + result3);
 * System.out.println("Wynik dzielenia to: " + result4);
 * 
 * scan.close();
 */

/*
 * Scanner scan = new Scanner(System.in);
 * System.out.println("Podaj Dwie liczby: ");
 * 
 * int a = getNumber(scan); int b = getNumber(scan);
 * 
 * System.out.println(a - b); System.out.println(a + b); System.out.println(a *
 * b); System.out.println((double) a / (double) b); scan.close();
 * 
 * }
 * 
 * public static int getNumber(Scanner scan) {
 * 
 * while (!scan.hasNextInt()) { scan.next();
 * System.out.print("Podaj	jeszcze	raz:	"); } return scan.nextInt();
 */