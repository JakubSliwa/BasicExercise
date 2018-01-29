package VariousTasks;

public class Main26 {

	public static void main(String[] args) {

		String[] fruits = { "truskawka", "pomarańcza", "banan", "malina" };

		System.out.println(fruits[0]);
		System.out.println(fruits[fruits.length - 1]);

		for (int i = 0; i <= fruits.length - 1; i++) {
			System.out.println("--------");
			System.out.println(fruits[i]);
		}
	}

}

/*
 * W pliku Main2.java stwórz tablicę z listą swoich ulubionych owoców, zmienną z
 * tablicą nazwij fruits.
 * 
 * Następnie:
 * 
 * Wypisz pierwszy owoc na stronie wg. wzoru: Pierwszy owoc to: truskawka.
 * Wypisz ostatni owoc na stronie wg. wzoru: Ostatni owoc to: malina (skorzystaj
 * z length). W pętli wypisz wszystkie owoce każdy w nowej linii (skorzystaj z
 * length).
 */