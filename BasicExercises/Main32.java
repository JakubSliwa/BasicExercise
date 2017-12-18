package BasicExercises;

import java.util.Scanner;

public class Main32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj pierwszą liczbę do porównania: ");
		int a = scan.nextInt();
		System.out.println("Podaj drugą liczbę do porównania: ");
		int b = scan.nextInt();
		System.out.println("Wybrane liczby to: " + a + " oraz " + b);

		if (a != b) {
			System.out.println(a + " != " + b);
		}
		if (a < b) {
			System.out.println(a + " < " + b);
		}
		if (a <= b) {
			System.out.println(a + " <= " + b);
		}

		scan.close();
	}

}

/*
 * 32. Write a Java program to compare two numbers. Go to the editor Input Data:
 * Input first integer: 25 Input second integer: 39 Expected Output
 * 
 * 25 != 39 25 < 39 25 <= 39
 */