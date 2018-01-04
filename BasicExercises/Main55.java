package BasicExercises;

import java.util.Scanner;

public class Main55 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Podaj liczbę sekund: ");
		int seconds = scan.nextInt();
		int p1 = seconds % 60;
		int p2 = seconds / 60;
		int p3 = p2 % 60;
		p2 = p2 / 60;
		System.out.println(p2 + ":" + p3 + ":" + p1);
		scan.close();
	}
}

/*
 * 55. Write a Java program to convert seconds to hour, minute and seconds. Go
 * to the editor Sample Output:
 * 
 * Input seconds: 86399 23:59:59
 */