package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		File file = new File("Main2.txt");
		try (Scanner scan = new Scanner(file);) {
			double sum = 0.0;
			while (scan.hasNext()) {
				String number = scan.next().replace(",", "");
				if (isDouble(number)) {
					sum += Double.valueOf(number);
				} else {
					System.out.println("Pominięto wartość: " + number);
				}
			}
			DecimalFormat format = new DecimalFormat("##.00");
			System.out.println("Wyliczona suma: " + format.format(sum));
		} catch (FileNotFoundException e) {
			System.out.println("Wykryto problem z plikiem");
		}
	}

	static boolean isDouble(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}

/*
 * public static void main(String[] args) {
 * 
 * try (PrintWriter out = new PrintWriter("Main2.txt");) {
 * 
 * out.println("1.1, 1.2, 1.3, 2.0, 1.8");
 * out.println("1.3, aa, 4.5, 6.7, 2.1");
 * out.println("3.5, 7.7, 9.9, 4.1, 2.1");
 * System.out.println("Plik został stworzony i zawiera: "); } catch
 * (FileNotFoundException ex) { System.out.println("Błąd	tworzenia"); }
 * 
 * File file = new File("Main2.txt"); StringBuilder reading = new
 * StringBuilder(); try (Scanner scan = new Scanner(file);) { while
 * (scan.hasNext()) { reading.append(scan.nextLine() + "\n"); } } catch
 * (FileNotFoundException e) { System.out.println("brak pliku"); }
 * System.out.println(reading.toString());
 * 
 * 
 * 
 * System.out.println("Teraz zsumuję liczby z pliku: " + "\n" + "suma to : " +
 * sum); }
 * 
 * 
 * 
 * }
 */

/*
 * #### Zadanie 3
 * 
 * W pliku `Main3.java` napisz program który:
 * 
 * 1. Będzie wczytywał kolejne linie tekstu z pliku tekstowego wypełnionego
 * poniższą zawartością:
 * 
 * ```` 1.1, 1.2, 1.3, 2.0, 1.8 1.3, aa, 4.5, 6.7, 2.1 3.5, 7.7, 9.9, 4.1, 2.1
 * ````
 * 
 * 2. Jeżeli dane są poprawnymi danymi liczbowymi program policzy ich sumę i
 * wypisze na konsoli.
 */