package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		File file = new File("/home/js/eclipse-workspace/Mod1/bin/a_Zadania/d_Dzien_4/b_Pliki/text1.txt");
		try (Scanner scan = new Scanner(file)) {
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				if (line.toLowerCase().contains("javy")) {
					System.out.println(line);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("brak pliku");
		}
	}
}

/*
 * #### Zadanie 4
 * 
 * W pliku `Main4.java` napisz program który:
 * 
 * 1. Wczyta zawartość z załączonego pliku text1.txt, następnie wypisze na
 * konsoli wszystkie linie zawierające napis **Javy** ignorując wielkość znaków
 * w nazwie.
 * 
 * File file = new File(
 * "/home/js/eclipse-workspace/Mod1/bin/a_Zadania/d_Dzien_4/b_Pliki/text1.txt");
 * StringBuilder reading = new StringBuilder(); try (Scanner scan = new
 * Scanner(file)) { while (scan.hasNextLine()) {
 * if("JAva".equals(reading.contains().trim())){ reading.append(scan.nextLine()
 * + "\n"); break; } else { System.out.println("Nie znaleziono"); } } } catch
 * (FileNotFoundException e) { System.out.println("brak pliku"); }
 * //System.out.println(reading.toString());
 */