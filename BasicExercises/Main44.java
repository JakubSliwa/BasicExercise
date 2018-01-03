package BasicExercises;

import java.util.Scanner;

public class Main44 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj liczbę n");
		int n = scan.nextInt();
		System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
		scan.close();
	}
}

/*
 * 44. Write a Java program that accepts an integer (n) and computes the value
 * of n+nn+nnn. Go to the editor Sample Output:
 * 
 * Input number: 5 5 + 55 + 555
 * 
 * Click me to see the solution
 */