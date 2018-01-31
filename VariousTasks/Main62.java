package VariousTasks;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main62 {

	public static void main(String[] args) {
		String str = "Naucz się programować od podstaw. Rozwiń wymarzoną karierę w branży IT. ";

		System.out.println(countToken(str));
	}

	private static int countToken(String str) {
		int result = 0;
//		Zwraca ilość elementów w Stringu
		
		StringTokenizer count = new StringTokenizer(str);
		result = count.countTokens();

		
//		Zwraca ilość znaków w Stringu
//		str.replaceAll(" ", "");
//		String[] el = str.split("");	
//		result = el.length;
		return result;
	}
}

/*
 * #### Zadanie 3
 * 
 * W pliku `Main3.java` umieść metodę o sygnaturze `static int
 * countTokent(String str)`.
 * 
 * 1. Uzupełnij ciało metody tak, aby zwracała ilość elementów w ciągu znaków.
 * 2. Metoda powinna pomijać białe znaki.
 */