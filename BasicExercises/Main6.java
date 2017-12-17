package BasicExercises;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj pierwszą liczbę: ");
		int a = scan.nextInt();
		System.out.println("Podaj drugą liczbę:");
		int b = scan.nextInt();
		System.out.println("Wybrane przez Ciebie liczby to: ");
		System.out.println("a = " + a + " b = " + b);
		System.out.println("Wynik dodawania to " + (a + b));
		System.out.println("Wynik odejmowania to " + (a - b));
		System.out.println("Wynik mnożenia to " + (a * b));
		System.out.println("Wynik dzielenia to " + (a % b));
		System.out.println("Wynik reszty z dzielenia to " + (a % b));
		scan.close();
	}

}

/*
 * Write a Java program to print the sum (addition), multiply, subtract, divide
 * and remainder of two numbers. Go to the editor Test Data: Input first number:
 * 125 Input second number: 24 Expected Output : 125 + 24 = 149 125 - 24 = 101
 * 125 x 24 = 3000 125 / 24 = 5 125 mod 24 = 5
 */