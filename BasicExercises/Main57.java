package BasicExercises;

import java.util.Scanner;

public class Main57 {

	public static void main(String[] args) {
		System.out.println("Podaj liczbę: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(result(a));
		scan.close();
	}

	public static int result(int num) {
		int ctr = 0;
		for (int i = 1; i <= (int) Math.sqrt(num); i++) {
			if (num % i == 0 && i * i != num) {
				ctr += 2;
			} else if (i * i == num) {
				ctr++;
			}
		}
		return ctr;
	}
}

// 57. Write a Java program to accepts an integer and count the factors of the
// number. Go to the editor
// Sample Output:
//
// Input an integer: 25
// 3
