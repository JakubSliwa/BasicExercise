package VariousTasks;

import java.util.Arrays;
import java.util.Random;

public class Main43 {

	public static void main(String[] args) {
		Random rand = new Random(20);

		int[] randTab = new int[20];

		for (int i = 0; i < randTab.length; i++) {
			randTab[i] = rand.nextInt(20);

		}
		System.out.println(Arrays.toString(randTab));

		System.out.println("Minimal value is: " + minNumber(randTab));
	}

	static int minNumber(int[] tab) {
		int min = 0;

		Arrays.sort(tab);
		min = tab[0];

		return min;
	}

}

/*
 * #### Zadanie 2
 * 
 * W pliku `Main2.java`
 * 
 * 1. Stwórz tablicę z 20 losowymi liczbami z zakresu `0-100`, zmienną z tablicą
 * nazwij `randNumbers` 2. Użyj do tego pętli `for` - do otrzymania losowej
 * wartości użyj sposobu opisanego w snippetach. 3. Wypisz w konsoli minimalną
 * wartość z tablicy.
 */