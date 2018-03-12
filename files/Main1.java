package files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("Podaj linie tekstu");
		try (FileWriter fileWriter = new FileWriter("Main1.txt", true); Scanner scan = new Scanner(System.in);) {
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				if ("quit".equals(line)) {
					System.err.println("Do widzenia");
					break;
				}
				fileWriter.append(line).append("\n");
			}
		} catch (IOException e) {
			System.err.println("Problem z zapisem do pliku");
		}
	}
}

/*
 * #### Zadanie 1 - rozwiązywane z wykładowcą.
 * 
 * W pliku `Main1.java` napisz program który:
 * 
 * 1. Będzie wczytywał kolejne linie tekstu z konsoli, a następnie je zapisywał
 * je do pliku o nazwie `Main1.txt`, program ma zakończyć działanie po wpisaniu
 * `quit`.
 * 
 * -----------------------------------------------------------------------------
 */