package VariousTasks;

public class Main32 {

	public static void main(String[] args) {
		double[] temps = { 30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0 };

		double[] tempsInFahr = new double[temps.length];
		double avg = 0;

		for (int i = 0; i < temps.length; i++) {
			tempsInFahr[i] = temps[i] * 1.8 + 32;
			avg += tempsInFahr[i];
			System.out.println("Temperatura " + "dla " + i + " miejsca w tabeli " + "w Fahrenhait'ach wynosi: "
					+ String.format("%.2f", tempsInFahr[i]) + ", ");
		}
		avg /= tempsInFahr.length;
		System.out.println("Średnia temperatura to: " + String.format("%.2f", avg));
	}
}

/*
 * W pliku Main8.java znajduje się tablica z temperaturami.
 * 
 * Temperatura w tablicy zapisana jest w stopniach Celsjusza, zamień ją na
 * stopnie Fahrenheit'a tempCelc * 1.8 + 32. Aby to zrobić przeiteruj tablicę i
 * nadpisz dany indeks nową obliczoną wartością. Przypisz do zmiennej avg
 * średnią temperaturę ze zmienionej tablicy. Wypisz ją na stronie wg. wzoru:
 * Średnia temperatura to: 3.95, zaokrąglij liczbę do 2 miejsc po przecinku,
 * możesz użyć użyj funkcji:
 * 
 * String.format( "%.2f", variableToFormat );
 */