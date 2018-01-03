package BasicExercises;

import java.util.Scanner;

public class Main51 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a number(string): ");
		String string = scan.nextLine();
		int result = Integer.parseInt(string);
		System.out.printf("The integer value is: %d", result);

		scan.close();
	}
}

/*
 * 51. Write a Java program to convert a string to an integer in Java. Go to the
 * editor Sample Output:
 * 
 * Input a number(string): 25 The integer value is: 25
 */