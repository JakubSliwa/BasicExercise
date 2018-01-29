package VariousTasks;

import java.util.Random;

public class Main31 {

	public static void main(String[] args) {

		Random random = new Random();

		int sum = 0;

		int[] randNumbers = new int[10];

		for (int i = 0; i < randNumbers.length; i++) {
			randNumbers[i] = random.nextInt(2);
			System.out.println("Liczba nr. " + (i + 1) + " to :" + randNumbers[i]);
			sum += randNumbers[i];
		}

		System.out.println("Suma wszystkich liczb to: " + sum);
	}

}

/*
 * W pliku Main7.java
 * 
 * Stwórz tablicę ze 100 losowymi liczbami z zakresu 0-20, zmienną z tablicą
 * nazwij randNumbers. Użyj do tego pętli for - do otrzymania losowej liczby
 * użyj kodu umieszczonego w pliku. Wypisz na stronie wylosowane liczby
 * oddzielone od siebie przecinkiem 18,12,1,3.... Oblicz sumę liczb z tablicy,
 * wynik przypisz do zmiennej sum. Wypisz na stronie, w nowej linii, sumę wg.
 * wzoru: Suma 100 losowych liczb od 0 do 20 to: 876..
 */