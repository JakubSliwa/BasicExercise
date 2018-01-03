package BasicExercises;

import java.util.Scanner;

public class Main49 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj liczbę ");
		int n = scan.nextInt();
		if (n % 2 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		scan.close();
	}
}

/*
 * 49. Write a Java program to accept a number and check the number is even or
 * not. Prints 1 if the number is even or 0 if the number is odd. Go to the
 * editor Sample Output:
 * 
 * Input a number: 20 1
 */
