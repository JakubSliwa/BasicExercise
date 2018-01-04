package BasicExercises;

import java.util.Scanner;

public class Main53 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj pierwszą zmienną:");
		int a = scan.nextInt();
		System.out.println("Podaj drugą zmienną:");
		int b = scan.nextInt();
		System.out.println("Podaj trzecią zmienną:");
		int c = scan.nextInt();

		System.out.println(isTrue(a, b, c));
		scan.close();
	}

	public static boolean isTrue(int x, int y, int z) {
		if (x < y && y < z) {
			return true;
		} else {
			return false;
		}
	}
}

/*
 * 53. Write a Java program that accepts three integers from the user and return
 * true if the second number is greater than first number and third number is
 * greater than second number. If "abc" is true second number does not need to
 * be greater than first number. Go to the editor Sample Output:
 * 
 * Input the first number : 5 Input the second number: 10 Input the third number
 * : 15 The result is: true
 */