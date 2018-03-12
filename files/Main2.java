package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		File file = new File("Main1.txt");
		StringBuilder reading = new StringBuilder();
		try (Scanner scan = new Scanner(file)) {
			while (scan.hasNextLine()) {
				reading.append(scan.nextLine() + "\n"); //.append("\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("brak pliku");
		}
		System.out.println(reading.toString());

	}
}

/*
 * #### Zadanie 2
 * 
 * W pliku `Main2.java` napisz program który:
 * 
 * 1. Będzie wczytywał kolejne linie tekstu z pliku `Main1.txt`, a następnie
 * wypisze je na konsoli.
 */