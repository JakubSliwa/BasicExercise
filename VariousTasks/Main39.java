package VariousTasks;

public class Main39 {

	public static void main(String[] args) {

		System.out.println(checkEven(1111));
	}

	private static String checkEven(int number) {
		if (number % 2 == 0) {
			return "Parzysta";
		} else {
			return "Nieparzysta";
		}
	}
}

/*
 * W pliku Main7.java Napisz metodę checkEven, która:
 * 
 * przyjmie parametr liczbowy number, będzie zwracać wartość typu String, jeśli
 * liczba jest parzysta, zwróci wynik "even", jeśli liczba jest nieparzysta,
 * zwróci wynik "odd".
 */