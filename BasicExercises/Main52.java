package BasicExercises;

import java.util.Scanner;

public class Main52 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj pierwszą zmienną:");
		int a = scan.nextInt();
		System.out.println("Podaj drugą zmienną:");
		int b = scan.nextInt();
		System.out.println("Podaj trzecią zmienną:");
		int c = scan.nextInt();

		if (a + b == c) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		scan.close();
	}
}

/*public static boolean sumoftwo(int p, int q, int r)
{	
   return ((p + q) == r || (q + r) == p || (r + p) == q);	
 }*/


/*
 * 52. Write a Java program to calculate the sum of two integers and return true
 * if the sum is equal to a third integer. Go to the editor Sample Output:
 * 
 * Input the first number : 5 Input the second number: 10 Input the third number
 * : 15 The result is: true
 */
