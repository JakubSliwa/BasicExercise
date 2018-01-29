package VariousTasks;

public class Main29 {

	public static void main(String[] args) {

		int[] numbers = { -132, -32, -999, -41, -8934, -434, -9, -3, -3322, -324 };

		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println(max);
	}

}

/*
 * adanie 5
 * 
 * W pliku Main5.java
 * 
 * Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij numbers.
 * Stwórz zmienną max i przypisz do niej 0. W pętli for znajdź liczbę, która
 * jest największa, przypisz ją do zmiennej max i wypisz na stronie. Aby to
 * zrobić przeiteruj tablicę i sprawdź czy aktualny element jest większy o
 * aktualnej wartości max i jeśli tak, zaktualizuj zmienną max. Sprawdź czy Twój
 * kod będzie działał poprawnie jeśli w tablicy znajdą się tylko liczby ujemne.
 * Spróbuj zmodyfikować kod aby działał on uniwersalnie (podpowiedź: wystarczy
 * zmodyfikować 1 linię kodu).
 */