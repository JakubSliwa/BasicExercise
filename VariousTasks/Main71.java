package VariousTasks;

import java.util.Scanner;

public class Main71 {

	public static void main(String[] args) {
		getInfo();
	}

	static void getInfo() {
		Scanner scan = new Scanner(System.in);

		String name = " ";
		int age = 0;

		System.out.println("Podaj imię:");
		name = scan.next();
		while (hasDigit(name)) {
			System.out.println("Imię zawiera liczby!!!");
			System.out.println("Podaj jeszcze raz: ");
			name = scan.next();
		}

		System.out.println("Podaj swój wiek");

		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println("Podaj liczbę całkowitą!");
			System.out.println("Podaj jeszcze raz");
		}
		age = scan.nextInt();
		System.out.println(name + " ma " + age + " lat.");

		scan.close();

	}

	static boolean hasDigit(String str) {
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				return true;
			}
		}
		return false;
	}
}

/*
 * #### Zadanie 1 - rozwiązywane z wykładowcą.
 * 
 * W pliku `Main1.java` stwórz metodę o sygnaturze `static void getInfo()`.
 * 
 * W ciele metody dodaj kod który:
 * 
 * 1. Poprosi Cię o podanie imienia. 2. Poprosi Cię o podanie wieku. 3. Wypisze
 * na konsoli informacje w formacie `"{imię} ma {wiek} lat"`. 4. Wywołaj metodę
 * w metodzie `main`.
 * 
 * -----------------------------------------------------------------------------
 */