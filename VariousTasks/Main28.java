package VariousTasks;

public class Main28 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10, 123 };
		int sumOdd = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println(numbers[i] + " jest liczbą parzystą");
			} else {
				System.out.println(numbers[i] + " jest liczbą nieparzystą");
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 1) {
				sumOdd += numbers[i];
			}

		}
		System.out.println("Suma liczb nieparzystych to: " + sumOdd);
	}

}

/*
 * Zadanie 4
 * 
 * W pliku Main4.java
 * 
 * Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij numbers. W
 * pętli for sprawdź, które są parzyste i wypisz je na stronie jedna pod drugą.
 * Dodaj dodatkową zmienną sumOdd o wartości 0. Zmodyfikuj pętlę z pkt.1 w ten
 * sposób aby dodatkowo sumowała liczby nieparzyste. Wyświetl dodatkowo na
 * stronie komunikat wg. wzoru: Suma liczb nieparzystych to: 87.
 */