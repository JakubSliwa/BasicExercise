package BasicExercises;

import java.util.Scanner;

public class Main33 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj liczbę: ");
		int a = scan.nextInt();
		int sum = 0;
		while (a > 0) {
			sum = sum + a % 10;
			a = a / 10;
		}
		System.out.println(sum);
		scan.close();
	}

}

/*
 * 33. Write a Java program and compute the sum of the digits of an integer. Go
 * to the editor Input Data: Input an integer: 25 Expected Output
 * 
 * The sum of the digits is: 7
 */