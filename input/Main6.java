package input;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		equation();
	}

	static void equation() {
		
		System.out.println("Podaj trzy współczynniki: ");
		Scanner scan = new Scanner(System.in);
		double a = getNumber(scan);
		double b = getNumber(scan);
		double c = getNumber(scan);
		double delta = (b * b) - (4 * a * c);
		System.out.println("Delta wynosi: " + delta);
		if (delta > 0) {
			System.out.println("x1 = " + ((-b - Math.sqrt(delta)) / (2.0 * a)));
			System.out.println("x2 = " + ((-b + Math.sqrt(delta)) / (2.0 * a)));
		} else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.println("x1 = " + x);
		} else {
			System.out.println("Brak pierwiastka");
		}

	}

	static double getNumber(Scanner scan) {

		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Podaj	jeszcze	raz:	");
		}
		return scan.nextDouble();

	}
}

/*
 * #### Zadanie 6
 * 
 * W pliku `Main6.java` stwórz metodę o sygnaturze `static void equation()`,
 * która:
 * 
 * 1. Poprosi o podanie liczb całkowitych `a`, `b`, `c` 2. Obliczy pierwiastki
 * równania kwadratowego, a następnie je wyświetli. 3. Wywołaj metodę w metodzie
 * `main`.
 */
