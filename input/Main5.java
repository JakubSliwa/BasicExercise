package input;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj słowo");
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			if ("quit".equals(line)) {
				System.err.println("Koniec");
				break;
			}
			System.out.println(line);
		}
		scan.close();
	}

}

/*
 * #### Zadanie 5
 * 
 * W pliku `Main5.java` stwórz metodę o sygnaturze `static void textLines()`,
 * która:
 * 
 * 1. Wczyta kolejne linie tekstu z konsoli, a następnie je wyświetlał, program
 * ma zakończyć działanie po wpisaniu `quit`. 2. Wywołaj metodę w metodzie
 * `main`.
 */
