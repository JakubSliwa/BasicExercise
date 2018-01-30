package VariousTasks;

import java.util.Arrays;

public class Main44 {

	public static void main(String[] args) {

		int[] tab = new int[10];
		int[] tab2 = new int[10];

		int i = 0;
		while (i < 10) {
			tab[i] = 2;
			i++;
		}

		Arrays.fill(tab2, 2);
		System.out.println(Arrays.toString(tab2));

		System.out.println(Arrays.toString(tab));
	}

}

/*
 * #### Zadanie 3
 * 
 * W pliku `Main3.java`
 * 
 * 1. Stwórz 10 elementową tablicę wypełnioną pojedynczą wartością 2. Tablica
 * powinna wyglądać następująco: ```` [2. 2. 2. 2. 2. 2 .2 . 2. 2. 2] ```` 2.
 * Zadanie wykonaj bez użycia pętli for.
 */