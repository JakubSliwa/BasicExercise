package VariousTasks;

public class Main59 {

	public static void main(String[] args) {
		
		
		String[] str = { "Coders", "Lab", "Lorem", "ipsum" };
		System.out.println(stringFromArray(str));

	}

	private static String stringFromArray(String[] str) {

		return String.join(", ", str);
	}
}

/*
 * #### Zadanie 8
 * 
 * W pliku `Main8.java` została umieszczona metoda o sygnaturze `static String
 * stringFromArray(String[] str)`.
 * 
 * 1. Uzupełnij ciało metody tak aby zwracała napis powstały z połączenia
 * wszystkich napisów występujących w tablicy `str`.
 */