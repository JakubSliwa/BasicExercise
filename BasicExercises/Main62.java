package BasicExercises;

import java.util.Scanner;

public class Main62 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj pierwszą zmienną:");
		int a = scan.nextInt();
		System.out.println("Podaj drugą zmienną:");
		int b = scan.nextInt();
		System.out.println("Podaj trzecią zmienną:");
		int c = scan.nextInt();

		System.out.println(results(a, b, c));
		scan.close();
	}

	public static boolean results(int a, int b, int c) {

		if ((a - 20) > b || (a - 20) > c || (b - 20) > c) {
			return true;
		}
		return false;
	}
}

/*
 * 62. Write a Java program that accepts three integer values and return true if
 * one of them is 20 or more less than one of the others. Go to the editor
 * Sample Output:
 * 
 * Input the first number : 15 Input the second number: 20 Input the third
 * number : 25 false
 */
