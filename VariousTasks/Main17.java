package VariousTasks;

public class Main17 {

	public static void main(String[] args) {

		int n = 10;

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

		System.out.println();

		n = 3;
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

	}
}

/*
 * W pliku Main9.java napisz program rysujący na podstawie wartości zmiennej n
 * następujący schemat:
 * 
 * dla n = 5
 * 
 * 2 3 4 5 * 3 4 5 * * 4 5 * * * 5 * * * *
 * 
 * dla n = 3
 * 
 * 2 3 * 3 * *
 * 
 * Do stworzenia takiego zapisu w środku zagnieżdżonej pętli użyj wyrażenia
 * warunkowego if dzięki któremu zdecydujesz czy wypisać gwiazdkę czy licznik z
 * zagnieżdżonej pętli.
 */