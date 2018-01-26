package VariousTasks;

public class Main19 {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			String row = "";

			for (int j = 1; j <= n; j++) {
				if (i >= j)
					row += "* ";
				else
					row += j + " ";
			}
			System.out.print(row + " \n");
		}

		for (int i = n; i >= 1; i--) {
			String row = "";

			for (int j = n; j >= 1; j--) {
				if (i >= j)
					row += "* ";
				else
					row += j + " ";
			}
			System.out.print(row + " \n");
		}
	}

}

/*
 * Zadanie 11
 * 
 * W pliku Main11.java napisz program rysujący na podstawie wartości zmiennej n
 * następujący schemat (tutaj dla n = 5):
 * 
 * 2 3 4 5 * 3 4 5 * * 4 5 * * * 5 * * * * * * * * * * * 5 * * 4 5 * 3 4 5 2 3 4
 * 5
 * 
 * Do stworzenia takiego zapisu w środku zagnieżdżonej pętli użyj wyrażenia
 * warunkowego if dzięki któremu zdecydujesz czy wypisać gwiazdkę czy licznik z
 * zagnieżdżonej pętli.
 */