package testPackage;

import java.util.Date;


public class main2 {

	public static void main(String[] args) {
		// String name = "Kuba";
		// int age = 20;
		// double x = 10000.0 / 3.0;
		// System.out.println(x);
		// System.out.printf("%7.2f", x);
		// System.out.println();
		// System.out.printf("Witaj, %s. W przyszłym roku będziesz mieć lat %d", name,
		// age);

		System.out.printf("%1$s %2$te %2$tB %2$tY", "Data:", new Date());
		/*
		 * Scanner in = new Scanner(System.in); // Pobranie pierwszej porcji danych.
		 * System.out.print("Jak się nazywasz? "); String name = in.nextLine(); //
		 * Pobranie drugiej porcji danych. System.out.print("Ile masz lat? "); int age =
		 * in.nextInt(); // Wydruk danych w konsoli.
		 * System.out.println("Witaj użytkowniku" + name +
		 * ". W przyszłym roku będziesz " + "mieć " + (age + 1) + "lat.");
		 * 
		 * in.close();
		 */
	}

}
