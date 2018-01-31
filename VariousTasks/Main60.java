package VariousTasks;

import java.util.StringTokenizer;

public class Main60 {

	public static void main(String[] args) {
		String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";

		StringTokenizer parts = new StringTokenizer(str);

		System.out.println("Z pętli while");
		while (parts.hasMoreTokens()) {
			String s = parts.nextToken();
			System.out.println(s);
		}

		System.out.println("Z metody split:");
		String[] tab = str.split(" ");
		for (String elem : tab) {
			System.out.println(elem);
		}

	}

}

/*
 * #### Zadanie 1 - rozwiązywane z wykładowcą.
 * 
 * W pliku `Main1.java` napisz program, który:
 * 
 * 1. Dla znajdującej się w pliku zmiennej `str` podzieli napis na wyrazy. 2.
 * Wyświetli na konsoli każdy w oddzielnej lini.
 * 
 * -----------------------------------------------------------------------------
 */