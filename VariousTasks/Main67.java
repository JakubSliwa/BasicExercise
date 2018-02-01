package VariousTasks;

public class Main67 {

	public static void main(String[] args) {
		showLength("Coders lab");
		showLength(null);
		showLength("lab");
	}

	static void showLength(String s) {
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Wartość nierozpoznawalna przez string");
			e.printStackTrace();

		}
		System.out.println(s);
	}

}

/*
 * #### Zadanie 3
 * 
 * W pliku `Main3.java` znajduje się program, który zwraca wyjątek.
 * 
 * 1. Popraw kod dodając obsługę zwracanego wyjątku.
 */