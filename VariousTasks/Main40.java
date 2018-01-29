package VariousTasks;

public class Main40 {

	public static void main(String[] args) {

		System.out.println(maxOfThree(-11, -5, -3));
	}

	private static int maxOfThree(int a, int b, int c) {
		int max = a;

		if (b > max) {
			max = b;
		}

		if (c > max) {
			max = c;
		}
		return max;
	}
}

/*
 * W pliku Main8.java Napisz metodę maxOfThree, która przyjmie trzy parametry
 * liczbowe. Funkcja ma zwrócić największą liczbę.
 */