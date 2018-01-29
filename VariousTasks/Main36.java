package VariousTasks;

public class Main36 {

	public static void main(String[] args) {

		System.out.println(createName("Kuba", "Janusz", "Śliwa"));
	}

	private static String createName(String name, String surname, String nickname) {

		return name + " \"" + nickname + "\" " + surname;
	}
}

/*
 * W pliku Main4.java Napisz metodę createName, która przyjmie następujące
 * parametry:
 * 
 * name: imię, surname: nazwisko, nickname: pseudonim. Funkcja ma zwrócić
 * łańcuch tekstowy z połączonymi parametrami w postaci Imię "Pseudonim"
 * Nazwisko.
 */