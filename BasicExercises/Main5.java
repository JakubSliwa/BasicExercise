package BasicExercises;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj pierwszą liczbę:");
		int a = scan.nextInt();
		System.out.println("Podaj drugą liczbę: ");
		int b = scan.nextInt();
		int op = operations(a, b);
		System.out.println("Wynik to: " + op);
		scan.close();
	}

	static int operations(int a, int b) {
		return a * b;

	}

}

/*
 * Write a Java program that takes two numbers as input and display the product
 * of two numbers. Go to the editor Test Data: Input first number: 25 Input
 * second number: 5 Expected Output : 25 x 5 = 125
 */