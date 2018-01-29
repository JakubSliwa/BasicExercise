package VariousTasks;

public class Main38 {

	public static void main(String[] args) {
		int myAge = 25;

		System.out.println(checkMaturity(myAge));

	}

	private static boolean checkMaturity(int age) {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}
}

/*
 * W pliku Main6.java Napisz metodę checkMaturity, która:
 * 
 * przyjmie parametr liczbowy age, który oznacza wiek użytkownika, sprawdzi czy
 * użytkownik jest pełnoletni, jeśli jest – zwróci wartość true, jeśli nie –
 * zwróci wartość false.
 */