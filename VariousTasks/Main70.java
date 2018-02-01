package VariousTasks;

public class Main70 {

	public static void main(String[] args) {
		String str = null;

		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("Wartość null");
			e.printStackTrace();
			throw e;
		}
	}

}

/*
 * #### Zadanie 6
 * 
 * W pliku `Main6.java` znajduje się program, który zwraca wyjątek.
 * 
 * 1. Popraw kod dodając obsługę zwracanego wyjątku.
 */