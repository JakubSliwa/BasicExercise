package VariousTasks;

import static java.lang.Integer.parseInt;

public class Main69 {

	public static void main(String[] args) {
		int num;
		try {
			num = parseInt(null);
		} catch (NumberFormatException e) {
			System.out.println("Nie da się strig przetworzyć na int");

			throw e;
		}
		System.out.println(num);
	}

}

/*
 * #### Zadanie 5
 * 
 * W pliku `Main5.java` znajduje się program, który zwraca wyjątek.
 * 
 * 1. Popraw kod dodając obsługę zwracanego wyjątku.
 */