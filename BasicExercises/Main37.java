package BasicExercises;

import java.util.Scanner;

public class Main37 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Napisz zdanie");
		String s = scan.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb.toString());
		scan.close();

	}

}

/*
 * 37. Write a Java program to reverse a string. Go to the editor Input Data:
 * Input a string: The quick brown fox Expected Output
 * 
 * Reverse string: xof nworb kciuq ehT
 */
