package VariousTasks;

public class Main16 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 1; j++) {
				System.out.println("* " + "* " + "* " + "* " + "* ");
			}
		}

		
		int n = 5;
		// tworzymy pętlę która będzie generowała nam WIERSZE
		for (int i = 0; i < n; i++) {
			String row = "";// zmienna która jest zerowana na początku każdej iteracji, przechowująca
							// gwiazdki z wiersza

			// tworzymy pętlę generującą nam gwiazdki w wierszu
			for (int j = 0; j < n; j++) {
				row += "* ";
			}
			System.out.print(row + "\n");// wyświetlamy gwiazdki z wiersza i dodajemy znak nowej lini
		}

	}

}

/*
 * Zadanie 8
 * 
 * W pliku Main8.java, jest napisany program, który wypisuje w konsoli schemat z
 * n gwiazdek, taki jak poniżej. Przeanalizuj go bardzo dokładnie. Przykład dla
 * n = 5:
 * 
 * * * * *
 * 
 * * * * *
 * 
 * * * * *
 * 
 * * * * *
 * 
 * * * * *
 * 
 * Używamy do tego zadania pętli zagnieżdżonych!
 */