package VariousTasks;

public class Main58 {

	public static void main(String[] args) {
		String str = "Coders Lab Lorem Ipsum";
		String search = "rs Lab";
		boolean result = containsStr(str, search);
		System.out.println(result);
	}

	private static boolean containsStr(String str, String search) {

		if (str.contains(search)) {
			return true;
		} else {
			return false;
		}
	}
}

/*
 * W pliku `Main7.java` została umieszczona metoda o sygnaturze `static boolean
 * containsStr(String str, String search)`.
 * 
 * 1. Uzupełnij ciało metody tak aby zwracała informacje czy zmienna `str`
 * zawiera w sobie element napisu ze zmiennej `search`.
 */