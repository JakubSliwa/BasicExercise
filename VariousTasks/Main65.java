package VariousTasks;

import java.util.Arrays;
import java.util.Random;

public class Main65 {

	public static void main(String[] args) {

		int[] newTab = createTab(5);
		System.out.println(Arrays.toString(newTab));

		try {
			newTab[10] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Przekraczasz wielkość tabeli!");
			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	private static int[] createTab(int n) {
		Random rand = new Random();

		int[] tab = new int[n];

		for (int i = 0; i < tab.length; i++) {
			tab[i] = rand.nextInt(5);
		}
		return tab;
	}

}

/*
 * #### Zadanie 1 - rozwiązywane z wykładowcą.
 * 
 * W pliku `Main1.java` napisz program który:
 * 
 * 1. Do kodu znajdującego się w pliku dodaj obsługę wyjątku
 * ArrayIndexOutOfBoundsException.
 * 
 * -----------------------------------------------------------------------------
 */