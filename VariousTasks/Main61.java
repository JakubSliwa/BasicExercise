package VariousTasks;

public class Main61 {

	public static void main(String[] args) {
		String str = "Naucz się programować od podstaw. Rozwiń wymarzoną karierę w branży IT. ";

		String[] tab = str.split("\\.");
		for (String elem : tab) {
			System.out.println(elem);
		}

	}

}

/*
 * #### Zadanie 2
 * 
 * W pliku `Main2.java` napisz program, który:
 * 
 * 1. Dla znajdującej się w pliku zmiennej `str` podzieli napis na zdania.
 * Znakiem podziału jest kropka `(.)` . 2. Wyświetli na konsoli każde zdanie w
 * oddzielnej lini.
 */