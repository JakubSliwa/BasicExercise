package input;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		System.out.println("Podaj liczbę wierszy:");
		Scanner scan = new Scanner(System.in);
		int rows = getNumber(scan);

		System.out.println("Podaj liczbę kolumn");
		int columns = getNumber(scan);

		int[][] tab = createTable(rows, columns);
		System.out.println("Stworzona tablica: ");
		printTable(tab);

		int sum = sum(tab);
		System.out.println("Suma " + sum);

		int count = (rows) * (columns);
		System.out.println("Średnia to: " + avg(sum, count));
	}

	public static int getNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print("Podaj	jeszcze	raz:	");
		}
		int number = scan.nextInt();
		if (number <=0) {
			System.out.println("Podaj liczbę dodatnią ");
			number = getNumber(scan); // funkcja rekurencyjna wywołuje sama siebie
		}
		return number;
	}

	static int[][] createTable(int rows, int columns) {
		int[][] tab = new int[rows][columns];
		int number = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				tab[i][j] = number++;
			}
		}
		return tab;
	}

	static void printTable(int[][] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(Arrays.toString(tab[i]));
		}
	}

	static int sum(int[][] tab) {
		int sum = 0;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				sum += tab[i][j];
			}
		}
		return sum;
	}

	static double avg(int sum, int count) {
		return (double) sum / count;
	}
}

/*
 * #### Zadanie 4
 * 
 * W pliku `Main4.java` stwórz metodę o sygnaturze `static void rowsColumns()`,
 * która:
 * 
 * 1. Wczyta z konsoli 2 liczby całkowite i przypisze je do zmiennych `rows` i
 * `columns`. 2. Stworzy tablicę o podanej liczbie rzędów i kolumn. 3. Wypełni
 * tablicę kolejnymi liczbami całkowitymi. 4. Obliczy sumę wszystkich elementów
 * oraz wyświetli na konsoli. 5. Obliczy średnią wszystkich elementów oraz
 * wyświetli na konsoli. 6. Wywołaj metodę w metodzie `main`.
 */