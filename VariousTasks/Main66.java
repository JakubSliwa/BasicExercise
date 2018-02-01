package VariousTasks;

public class Main66 {

	public static void main(String[] args) {

		int a = 3;
		int b = 0;
		int divide = divide(a, b);
		System.out.println(divide);
		System.out.println(divide2(a, b));

	}

	static int divide(int a, int b) {
		int result;
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Nie dzieli się przez zero!");
			e.getMessage();
			throw e;

		} catch (Exception e) {
			System.out.println("Błąd dzielenia!");
			throw e;
		}
		return result;
	}

	static int divide2(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			System.out.println("Nieprawidłowe dzielenie przez zero");

			throw e;
		}
	}
}

/*
 * #### Zadanie 2
 * 
 * 
 * W pliku `Main2.java` została umieszczona metoda o sygnaturze `static int
 * divide (int a, int b)`.
 * 
 * 1. Uzupełnij ciało metody tak, aby wykonała dzielenie argumentu `a` prze `b`
 * a następnie zwróci całkowitą cześć wyniku dzielenia. 2. Obsłuży problem
 * dzielenia przez zero.
 */