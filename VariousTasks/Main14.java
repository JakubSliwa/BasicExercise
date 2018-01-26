package VariousTasks;

public class Main14 {

	public static void main(String[] args) {

		int n = 15;
		int i = 0;
		while (i <= n) {

			if (i % 2 == 0) {
				System.out.println(i + " - parzysta");
			} else {
				System.out.println(i + " - nieparzysta");
			}
			i++;
		}
		System.out.println("----------------------------------");
		for (i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " - parzysta");
			} else {
				System.out.println(i + " - nieparzysta");
			}
		}
	}

}

/*
 * Zadanie 6
 * 
 * W pliku Main6.java napisz kod, który na podstawie wartości zmiennej np. int n
 * = 5; wypisuje wszystkie liczby od zera do n. Przy każdej liczbie wypisz, czy
 * liczba jest parzysta czy nie.
 * 
 * Wzór:
 * 
 * 0–parzysta 1–nieparzysta 2–parzysta 3–nieparzysta...
 * 
 * Zmień wartość zmiennej n i uruchom ponownie.Napisz zarówno pętle for jak i
 * pętlę while.
 * 
 * Podpowiedź: Jak sprawdzić czy liczba jest parzysta lub nieparzysta? Wystarczy
 * obliczyć jej resztę z dzielenia przez 2, jeżeli wynik to 0, wtedy liczba jest
 * parzysta, w przeciwnym przypadku jest nieparzysta.
 */