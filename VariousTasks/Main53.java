package VariousTasks;

public class Main53 {

	public static void main(String[] args) {

		String str = "Kajak";

		System.out.println(palindromChk(str));
	}

	static boolean palindromChk(String str) {
		boolean result = true;
		String strLower = str.toLowerCase().replaceAll(" ", "");

		for (int i = 0; i < strLower.length(); i++) {
			if (strLower.charAt(i) != strLower.charAt(strLower.length() - 1 - i)) {
				result = false;
				break;
			} else {
				result = true;
			}
		}
		return result;
	}

}

/*
 * #### Zadanie 2 Palindrom to słowo lub zdanie, które czytane wspak brzmi tak
 * samo, jak od początku, np. "kajak", "radar", czy "Kobyła ma mały bok". W
 * pliku `Main2.java` napisz program, który:
 * 
 * 1. Dla znajdującej się w pliku zmiennej `str` sprawdzi czy jest on
 * palindromem 2. Podczas sprawdzania palindromu, zignoruj spacje.
 */