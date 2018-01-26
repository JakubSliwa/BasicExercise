package testPackage;

import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {

		String[] programmers = { "Adrian", "Paul", "John", "Harry" };
		// john is not printed out
		for (String name : programmers) {
			if (name.equals("John"))
				continue;
			System.out.println(name);
		}
		//
		// String theWord;
		// System.out.println("Put word:");
		// Scanner scan = new Scanner(System.in);
		// do {
		// theWord = scan.nextLine();
		// } while (!theWord.equals("Bird"));
		// System.out.println(theWord);
		// scan.close();
		/*
		 * int i = 0; do { i++; System.out.println(i); } while (i < 100);
		 * 
		 * Scanner scan = new Scanner(System.in); int i = scan.nextInt(); switch (i) {
		 * case 0: System.out.println("i is zero"); break; case 1:
		 * System.out.println("i is one"); break; case 2:
		 * System.out.println("i is two"); break; default:
		 * System.out.println("i is less than zero or greater than two"); }
		 * scan.close();
		 */
	}
}

/*
 * Scanner in = new Scanner(System.in);
 * System.out.print("Ile liczb ma być wylosowanych? "); int k = in.nextInt();
 * System.out.print("Jaka jest górna granica przedziału losowanych liczb? ");
 * int n = in.nextInt();
 * 
 * Obliczanie współczynnika dwumianowego n*(n–1)*(n–2)*...*(n–k+1)/(1*2*3*...*k)
 * 
 * int lotteryOdds = 1; for (int i = 1; i <= k; i++) lotteryOdds = lotteryOdds *
 * (n - i + 1) / i; System.out.println("Twoje szanse to 1 do " + lotteryOdds +
 * ". Powodzenia!"); in.close(); }
 */
// for (int i = 0; i < 10; i++) {
// System.out.println(i);
//
// for (int j = 3; j > 0; j--)
// System.out.println("Odliczanie . . . " + j);
// System.out.println("Start!");
//
// }
//
// int i = 10;
// while (i > 0) {
// System.out.println("Odliczanie... " + i);
// i--;
// }
