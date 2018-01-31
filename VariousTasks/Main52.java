package VariousTasks;

public class Main52 {

	public static void main(String[] args) {

		String str = "Alabama Nowy Jork 123 O + mmmma";

		char c = str.charAt(str.length() - 2);

		System.out.println(c);

		int count = count(str, c);
		System.out.println(count);

	}

	static int count(String str, char c) {
		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
				counter++;
		}

		return counter;
	}

}

/*
 * #### Zadanie 1 - rozwiązywane z wykładowcą.
 * 
 * W pliku `Main1.java` napisz program, który:
 * 
 * 1. Dla znajdującej się w pliku zmiennej `str` pobierze przedostatnią literę.
 * 2. Wyświetli na konsoli ilość jej wystąpień w naszym ciągu znaków.
 */