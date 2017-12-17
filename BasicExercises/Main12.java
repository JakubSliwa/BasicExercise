package BasicExercises;

import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj pierwszą liczbę :");
		int a = scan.nextInt();
		System.out.println("Podaj drugą liczbę: ");
		int b = scan.nextInt();
		System.out.println("Podaj trzecią liczbę");
		int c = scan.nextInt();
		System.out.println("Wpisane liczby to: " + a + ", " + b + " " + c);
		System.out.println("Obliczam średnią ...");
		System.out.println("Średnia to: " + ((a + b + c) / 3));
		scan.close();
	}

}

// 12. Write a Java program that takes three numbers as input to calculate and
// print the average of the numbers