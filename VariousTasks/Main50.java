package VariousTasks;

public class Main50 {

	public static void main(String[] args) {

		int[][] task3Array = { { 2, 3, 4, 5 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4, 5 }, { 5, 1, 6, 7, 4 } };

		int sum = 0;
		for (int i = 0; i < task3Array.length; i++) {
			for (int j = 0; j < task3Array[i].length; j++) {
				sum += task3Array[i][j];
			}

		}
		System.out.println(sum);
	}

}

/*
 * #### Zadanie 3
 * 
 * W pliku `Main3.java` znajduje się tablica o nazwie ```task3Array```.
 * 
 * 1. Wypisz na konsoli sumę wszystkich elementów tablicy.
 */