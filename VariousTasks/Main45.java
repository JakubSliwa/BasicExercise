package VariousTasks;

import java.util.Arrays;
import java.util.Random;

public class Main45 {

	public static void main(String[] args) {
		int[] tab = createTable(50);
		System.out.println(Arrays.toString(tab));

		printReversedTable(tab);
	}

	public static int[] createTable(int n) {
		int[] tab = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			tab[i] = r.nextInt(20);
		}
		return tab;
	}

	public static void printReversedTable(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + ", ");
		}
	}
}

/*
 * #### Zadanie 4
 * 
 * W pliku `Main4.java`
 * 
 * 1. Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij
 * `numbers`. 2. Stwórz zmienną tablicową `reverse` i umieść w niej elementy
 * tablicy numbers w odwrotnej kolejności. 3. Wypisz na konsoli elementy z
 * odwróconej tablicy.
 * 
 * Dla tablicy o elementach: ``` 3, 5, 7, 2, 1 ``` Wypisze: ``` 1, 2, 7, 5, 3
 * ```
 */