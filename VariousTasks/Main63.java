package VariousTasks;

public class Main63 {

	public static void main(String[] args) {
		String str = "Java-zadania-podzial-napisow`";
		String[] tab = onlyTwoElements(str, '-');

		for (String elem : tab) {
			System.out.println(elem);
		}
	}

	private static String[] onlyTwoElements(String str, char separator) {

		return str.split(String.valueOf(separator), 2);
	}
}

/*
 * #### Zadanie 4
 * 
 * W pliku `Main4.java` umieść metodę o sygnaturze `static String[]
 * onlyTwoElements(String str, char separator)`.
 * 
 * 1. Uzupełnij ciało metody tak aby, zwracała tablicę dokładnie 2 elementów,
 * podzielonych wg pierwszego napotkanego znaku podziału. Przykład" dla napisu
 * `Java-zadania-podzial-napisow` oraz separatora `-` otrzymamy 1 element
 * tablicy `Java` oraz 2 element `zadania-podzial-napisow`.
 */