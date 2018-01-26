package VariousTasks;

import java.util.Scanner;

public class Main20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double a, b, c;

		System.out.println("Podaj pierwszą liczbę: ");
		a = getNumber(scan);
		System.out.println("Podaj drugą liczbę: ");
		b = getNumber(scan);
		System.out.println("Podaj trzecią liczbę: ");
		c = getNumber(scan);

		isTriangle(a, b, c);
	}

	private static double getNumber(Scanner scan) {

		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print("Podaj	jeszcze	raz:	");
		}
		return scan.nextDouble();
	}

	private static void isTriangle(double n1, double n2, double n3) {
		if (n1 + n2 > n3 && n2 + n3 > n1 && n1 + n3 > n2) {
			System.out.println("Można zbudować trójąt");
//		} else if (n2 + n3 > n1) {
//			System.out.println("Można zbudować trójąt");
//		} else if (n1 + n3 > n2) {
//			System.out.println("Można zbudować trójąt");
		} else {
			System.out.println("Z tych boków nie powstanie trójkąt");
		}
	}
}

/*
 * Zadanie 12 - dodatkowe
 * 
 * W pliku Main12.java napisz program definiujący trzy liczby w zmiennych: a, b,
 * c. Program ma sprawdzić, czy podane liczby mogą być bokami trójkąta. Tę
 * figurę geometryczną można zbudować z trzech linii tylko wtedy, gdy suma
 * długości dwóch z nich jest większa niż długość trzeciej linii, czyli:
 * 
 * a + b > c c + b > a a + c > b
 * 
 * Po sprawdzeniu wypisz na stronie informację wg. wzoru:
 * 
 * Z podanych boków można zbudować trójkąt.
 * 
 * lub
 * 
 * Z podanych boków nie można zbudować trójkąta.
 */