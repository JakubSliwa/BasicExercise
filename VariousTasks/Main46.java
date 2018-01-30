package VariousTasks;

import java.util.Arrays;
import java.util.Random;

public class Main46 {

	public static void main(String[] args) {

		int[] newTab = createTable(10);
		printTable(newTab);
		printSortedTab(newTab);
	}

	private static int[] createTable(int n) {
		int[] tab = new int[n];
		Random r = new Random();

		for (int i = 0; i < tab.length - 1; i++) {
			tab[i] = r.nextInt(20);
		}
		return tab;
	}

	private static void printTable(int[] tab) {

		System.out.println(Arrays.toString(tab));
	}

	private static void printSortedTab(int[] tab) {
		Arrays.sort(tab);

		printTable(tab);
	}
}

/*
 * #### Zadanie 5
 * 
 * W pliku `Main5.java`
 * 
 * 1. Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij
 * `numbers`. 2. Posortuj rosnąco tablicę wykorzystując metody klasy Arrays. 3.
 * Wyświetl w konsoli posortowaną tablicę - również wykorzystaj metodę klasy
 * Arrays.
 */