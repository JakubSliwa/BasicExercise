package BasicExercises;

import java.util.Scanner;

public class Main54 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj pierwszą zmienną:");
		int a = scan.nextInt();
		System.out.println("Podaj drugą zmienną:");
		int b = scan.nextInt();
		System.out.println("Podaj trzecią zmienną:");
		int c = scan.nextInt();
		System.out.println(isRight(a, b, c));
		scan.close();
	}

	public static boolean isRight(int x, int y, int z) {

		return (x % 10 == y % 10) || (x % 10 == z % 10) || (y % 10 == z % 10);
	}

}

/*
 * 54. Write a Java program that accepts three integers from the user and return
 * true if two or more of them (integers ) have the same rightmost digit. The
 * integers are non-negative. Go to the editor Sample Output:
 * 
 * Input the first number : 5 Input the second number: 10 Input the third number
 * : 15 The result is: true
 */