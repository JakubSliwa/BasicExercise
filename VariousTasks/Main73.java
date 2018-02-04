package VariousTasks;

import java.util.Scanner;

public class Main73 {

	public static void main(String[] args) {

		System.out.println(
				"Program pobiera dowolne liczby, po wpisaniu 0 zakończy swoje działanie i zwróci ich sumę i ilość.");

		getData();

	}

	private static void getData() {
		Scanner scan = new Scanner(System.in);

		double sum = 0;
		int count = 1;

		double x = getNumber(scan);
		sum += x;

		while (x != 0) {

			x = getNumber(scan);
			sum += x;
			count++;
		}

		System.out.println("Wpisałeś " + count + " liczb z koleji. Suma wpisanych liczb to: " + sum);

		scan.close();

	}

	private static double getNumber(Scanner scan) {

		System.out.println("Podaj dowolną liczbę");
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.println("Podaj jeszcze raz");
		}
		double a = scan.nextDouble();
		System.out.println("Wpisana liczba to: " + a);
		return a;
	}

}

/*
 * #### Zadanie 3
 * 
 * W pliku `Main3.java` stwórz metodę o sygnaturze `static void getData()`.
 * 
 * 1. Uzupełnij ciało metody tak, by wczytywała liczby z konsoli, sumowała ich
 * wartość oraz ilość i wyświetlała na konsoli do momentu wprowadzania 0. 2.
 * Wywołaj metodę w metodzie `main`.
 */