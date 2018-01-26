package VariousTasks;

public class Main13 {

	public static void main(String[] args) {

		int resultFor = 0;
		int resultWhile = 0;

		for (int i = 1; i <= 10; i++) {
			int added = i;
			resultFor += added;
		}

		int i = 1;
		while (i <= 10) {
			int added = i;
			resultWhile += added;
			i++;
		}
		System.out.println(resultFor);
		System.out.println(resultWhile);
	}

}

/*
 * Zadanie 5
 * 
 * W pliku Main5.java stwórz zmienną resultFor oraz resultWhile i przypisz do
 * nich liczbę 0. Następnie stwórz pętle, która doda do siebie liczby od 1 do 10
 * i zapisze do zmiennej resultFor lub resultWhile. Pętla powinna co
 * uruchomienie (zwaną także iteracją pętli) dodawać do zmiennej resultFor lub
 * resultWhile kolejną liczbę z podanego zakresu. Napisz zarówno pętle for jak i
 * pętlę while. Wypisz w konsoli w oddzielnych liniach zmienne resultFor oraz
 * resultWhile.
 */