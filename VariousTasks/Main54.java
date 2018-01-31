package VariousTasks;

public class Main54 {

	public static void main(String[] args) {

		String str = "Tak abc";

		System.out.println(reversedString(str));
	}

	private static String reversedString(String str) {

		String reversedStr = "";

		for (int i = 0; i < str.length(); i++) {
			reversedStr += str.charAt(str.length() - 1 - i);
		}
		return reversedStr;
	}
}

/*
 * #### Zadanie 3
 * 
 * W pliku `Main3.java` napisz program który:
 * 
 * 1. Dla znajdującej się w pliku zmiennej `str` wyświetli na konsoli odwrócony
 * napis. Przykład: dla napisu `Tak` wyświetli `kaT`.
 */