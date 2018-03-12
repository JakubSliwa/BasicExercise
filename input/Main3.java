package input;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		getData();
	}

	static void getData() {

		System.out.println("Podaj jakąkolwiek liczbę: ");
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int i = 0;

		int number = 0;

//		do {
//			number = getNumber(scan);
//			sum += number;
//			i++;
//			System.out.println("Suma: " + sum);
//			System.out.println("Ilość: " + i);
//
//		} while (number != 0);

		while ((number = getNumber(scan)) != 0) {
			sum += number;
			i++;
			System.out.println("Suma: " + sum);
			System.out.println("Ilość: " + i);
		}

		/*
		 * while (scan.hasNextLine() && !scan.nextLine().equals(0)) { sum +=
		 * scan.nextInt(); i++; System.out.println("Suma: " + sum);
		 * System.out.println("Ilość: " + i);
		 */
	}

	public static int getNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print("Podaj	jeszcze	raz:	");
		}
		return scan.nextInt();
	}
}

/*
 * #### Zadanie 3
 * 
 * W pliku `Main3.java` stwórz metodę o sygnaturze `static void getData()`.
 * 
 * 1. Uzupełnij ciało metody tak, by wczytywała liczby z konsoli, sumowała ich
 * wartość oraz ilość i wyświetlała na konsoli do momentu wprowadzania 0. 2.
 * Wywołaj metodę w metodzie `main`.
 * 
 * 
 * Scanner scan = new Scanner(System.in);
 * System.out.println("Podaj jakąkolwiek liczbę: "); if( scan.nextDouble() < 0)
 * {
 * 
 * while (!scan.hasNextDouble()) { scan.next();
 * System.out.print("Podaj	jeszcze	raz:	"); }
 * 
 * }
 * 
 * scan.close(); }
 * 
 * static int getNumber(Scanner scan()){ while (!scan.hasNextInt()) {
 * scan.next(); System.out.print("Podaj	jeszcze	raz:	");
 */