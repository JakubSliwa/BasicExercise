package VariousTasks;

public class Main57 {

	public static void main(String[] args) {

		String str = "Coderslab";

		String halfStr = firstHalf(str);

		System.out.println(halfStr);

	}

	private static String firstHalf(String str) {

		int strLen = (str.length()) / 2;
		String firstHalfStr = str.substring(0, strLen);

		return firstHalfStr;

	}
}

/*
 * #### Zadanie 6
 * 
 * W pliku `Main6.java` została umieszczona metoda o sygnaturze `static String
 * firstHalf(String str)`.
 * 
 * 1. Uzupełnij ciało metody tak aby zwracała połowę napisu. 2. Uwzględniamy
 * tylko część całkowitą podziału. Przykład: dla napisu `CodersLab` zwróci
 * `Code`.
 */