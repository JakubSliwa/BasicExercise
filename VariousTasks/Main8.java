package VariousTasks;

public class Main8 {

	public static void main(String[] args) {

		int x = 16;
		int y = 15;
		boolean x_y = x < y;

		boolean t = true;
		boolean f = false;
		boolean t_f = t || f;

		boolean last = x_y && t_f;

		System.out.println(x_y);
		System.out.println(t_f);
		System.out.println(last);
	}

}
/*
 * Zadanie 8 - dodatkowe
 * 
 * W pliku Main8.java wykonaj następujące czynności:
 * 
 * Zdefiniuj zmienną x o wartości 16, oraz zmienną y o wartości 15. Zdefiniuj
 * zmienną x_y, która będzie przechowywać wartość logiczną porównania czy x < y.
 * Zdefiniuj zmienną t o wartości logicznej prawdy, oraz zmienną f o wartości
 * logicznej fałszu. Zdefiniuj zmienną t_f, która będzie przechowywać wartość
 * logiczną porównania t LUB f. Zdefiniuj zmienną last, która będzie
 * przechowywać wartość logiczną porównania x_y i t_f. Wyświetl w konsoli w
 * nowych liniach kolejno zmienne: x_y , t_f, last. Przeanalizuj otrzymany
 * wynik.
 */
