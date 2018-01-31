package VariousTasks;

import java.util.Arrays;
import java.util.Random;

public class Main47 {

	public static void main(String[] args) {
		int[] firstTab = createTable(22);
		int[] secondTab = createTable(32);

		printTable(firstTab);
		printTable(secondTab);

		int[] thirdTab = joinedTab(firstTab, secondTab);
		printTable(thirdTab);
	}

	private static int[] createTable(int n) {
		int[] tab = new int[n];
		Random r = new Random();

		for (int i = 0; i < tab.length; i++) {
			tab[i] = r.nextInt(20);
		}
		return tab;
	}

	private static void printTable(int[] tab) {
		System.out.println(Arrays.toString(tab));
	}

	private static int[] joinedTab(int[] tabA, int[] tabB) {
		int[] joinedTabA = new int[tabA.length];
		int[] joinedTabB = new int[tabB.length];

		int[] tempTabA = Arrays.copyOf(tabA, tabB.length);
		int[] tempTabB = Arrays.copyOf(tabB, tabA.length);

		if (tabA.length >= tabB.length) {

			for (int i = 0; i < tabA.length; i++) {
				joinedTabA[i] = tabA[i] + tempTabB[i];
			}
			return joinedTabA;
		} else {
			for (int i = 0; i < tabB.length; i++) {

				joinedTabB[i] = tempTabA[i] + tabB[i];
			}
			return joinedTabB;
		}

	}
}

/*
 * #### Zadanie 6
 * 
 * W pliku `Main6.java`
 * 
 * 1. Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij
 * `numbers`. 2. Stwórz drugą tablicę z 10 dowolnymi liczbami, zmienną z tablicą
 * nazwij `secondNumbers`. 3. Stwórz trzecią tablicę zawierającą sumę wszystkich
 * kolejnych elementów.
 * 
 * Dla przykładowych tablic: ```java int[] numbers = {2, 3}; int[] secondNumners
 * = {3, 4}; ``` wynikiem będzie tablica o elementach `5 i 7` .
 */