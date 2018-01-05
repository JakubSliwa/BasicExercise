package BasicExercises;

import java.util.Scanner;

public class Main63 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj pierwszą zmienną:");
		int a = scan.nextInt();
		System.out.println("Podaj drugą zmienną:");
		int b = scan.nextInt();

		System.out.println(results(a, b));
		scan.close();
	}

	public static int results(int x, int y) {

		if (x == y)
			return 0;
		if (x % 6 == y % 6)
			return (x < y) ? x : y;
		return (x > y) ? x : y;
		// if (x > y) {
		// return x;
		// } else if (y < x) {
		// return y;
		// } else if (x == y) {
		// return 0;
		// } else if (x % 6 == y % 6) {
		// return (x < y) ? x : y;
		// }
		// return 0;
	}
}

/*
 * 63. Write a Java program that accepts two integer values from the user and
 * return the larger values. However if the two values are the same, return 0
 * and return the smaller value if the two values have the same remainder when
 * divided by 6. Go to the editor Sample Output:
 * 
 * Input the first number : 12 Input the second number: 13 Result: 13
 */