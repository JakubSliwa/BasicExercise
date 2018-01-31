package VariousTasks;

public class Main56 {

	public static void main(String[] args) {

		String str = "Main Java";
		char c = 'z';

		System.out.println(charPos(str, c));
	}

	private static int charPos(String str, char c) {

		return str.indexOf(c) + 1;
	}
}

/*
 * #### Zadanie 5
 * 
 * W pliku `Main5.java` została umieszczona metoda o sygnaturze `static int
 * charPos(String str, char c) `.
 * 
 * 1. Uzupełnij ciało metody tak aby zwracała pozycje na której w ciągu `str`
 * znajduje się znak `c`.
 */