package VariousTasks;

public class Main68 {

	public static void main(String[] args) {

		int a = 4, b = 2, c;
		try {
			c = a / b;
			System.out.println(c);

		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic Exception: You can't divide by 0");
			throw ex;
		} catch (Exception ex) {
			System.out.println("Exception");
			throw ex;
		}

	}
}

/*
 * #### Zadanie 4
 * 
 * W pliku `Main4.java` znajduje się program z obsługą 2 wyjątków.
 * 
 * 1. Uruchom program i zaobserwuj jaki wyjątek jest zwracany. 2. Popraw kod tak
 * aby dodatkowy wyjątek z komentarza był poprawnie obsłużony.
 */