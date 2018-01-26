package VariousTasks;

public class Main18 {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i <= n; i++) {
			String row = " ";
			{
				for (int j = 0; j <= n; j++) {
					if (i >= j) {
						row += "* ";
					}
				}
			}
			System.out.println(row);
		}
	}

}

/*
 * Zadanie 10
 * 
 * W pliku Main10.java napisz program rysujący na podstawie wartości zmiennej n
 * następujący schemat (tutaj dla n = 5).
 *
 * 
 * * * * * * * * * * *
 * 
 * Możesz to zadanie rozwiązać na dwa sposoby:
 * 
 * używając pętli zależnych. używając pętli niezależnych i instrukcji warunkowej
 * if.
 * 
 * Wzoruj się na poprzednich zadaniach. Trzeba tutaj trochę pomyśleć i rozumieć
 * pętle zagnieżdżone.
 */