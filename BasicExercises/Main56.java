package BasicExercises;

import java.util.Scanner;

public class Main56 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj pierwszą zmienną:");
		int a = scan.nextInt();
		System.out.println("Podaj drugą zmienną:");
		int b = scan.nextInt();
		System.out.println("Podaj trzecią zmienną:");
		int c = scan.nextInt();

		int res = result(a, b, c);
		System.out.println(res);
		scan.close();
	}

	public static int result(int x, int y, int p) {
		if (x % p == 0)
			return (y / p - x / p + 1);
		return (y / p - x / p);
	}

}

/*
 * 56. Write a Java program to find the number of integers within the range of
 * two specified numbers and that are divisible by another number. Go to the
 * editor For example x = 5, y=20 and p =3, find the number of integers within
 * the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
 * Sample Output:
 * 
 * 5
 */