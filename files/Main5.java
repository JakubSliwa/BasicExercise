package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		File file = new File("/home/js/eclipse-workspace/Mod1/bin/a_Zadania/d_Dzien_4/b_Pliki/text2.txt");
		StringBuilder builder = new StringBuilder();
		System.err.println("Posortowana lista: ");
		try (Scanner scan = new Scanner(file)) {
			while (scan.hasNextLine()) {
				builder.append(scan.nextLine()).append("\n");
			}
			String all = builder.toString();
			String[] languages = all.split("\n");
			Arrays.sort(languages);
			for (String elem : languages) {
				System.out.println(elem);
			}
		} catch (FileNotFoundException e) {
			System.out.println("brak pliku");
		}
	}
}

/*
 * #### Zadanie 5
 * 
 * W pliku `Main5.java` napisz program który:
 * 
 * 1. Wczyta zawartość z załączonego pliku text2.txt, następnie posortuje
 * znajdujące się tam nazwy języków programowania i zapisze wynik. Lista języków
 * pobrana z rankingu: http://www.tiobe.com/tiobe-index/ , zgadnij jaki język
 * jest na samej górze.
 */