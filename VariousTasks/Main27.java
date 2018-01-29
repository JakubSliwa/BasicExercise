package VariousTasks;

public class Main27 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10, 123 };

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("Suma to: " + sum);
	}

}

/*
 * W pliku Main3.java
 * 
 * Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij numbers.
 * Stwórz zmienną sum i przypisz do niej liczbę 0. Za pomocą pętli for oblicz
 * sumę liczb z tablicy. Wypisz sumę na stronie wg. wzoru: Suma elementów
 * tablicy to: 381.
 */