package VariousTasks;

public class Main55 {

	public static void main(String[] args) {

		String str = "aAbBcC";
		String result = toogleChar(str);
		System.out.println(result);
	}

	static String toogleChar(String str) {

		String revString = "";
		for (int i = 0; i < str.length() - 1; i++) {
			String charToString = String.valueOf(str.charAt(i));
			if (Character.isUpperCase(str.charAt(i))) {
				revString += charToString.toLowerCase();
			} else {
				revString += charToString.toUpperCase();
			}
		}

		return revString;

	}
}

/*
 * #### Zadanie 4
 * 
 * W pliku `Main4.java` została umieszczona metoda o sygnaturze `static String
 * toogleChar(String str) `.
 * 
 * 1. Uzupełnij ciało metody tak, aby zamieniała duże litery na małe i odwrotnie
 * a następnie zwracała wynik. Przykład: dla napisu `TaK` wyświetli `tAk`.
 */