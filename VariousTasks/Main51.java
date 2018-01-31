package VariousTasks;

public class Main51 {

	public static void main(String[] args) {

		int[][] task4Array = { { 1, 3, 4, 6 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4 }, { 5, 1, 6, 7 } };
		System.out.println(sumDiag(task4Array));
	}

	static int sumDiag(int[][] tab) {
		int sum = 0;

		for (int i = 0; i < tab.length; i++) {
			sum += tab[i][i];
		}

		return sum;
	}
}
/*
 * #### Zadanie 4
 * 
 * W pliku `Main4.java` znajduje się tablica o nazwie ```task4Array```.
 * 
 * 1. Wypisz na konsoli ślad macierzy (sumę elementów na głównej przekątnej).
 * 
 * http://www.naukowiec.org/wiedza/matematyka/slad-macierzy_614.html
 */