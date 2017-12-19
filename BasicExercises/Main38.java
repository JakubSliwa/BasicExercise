package BasicExercises;

import java.util.Scanner;

public class Main38 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wpisz tekst");
		String text = scan.nextLine();

		letters(text);
		digit(text);
		space(text);
		scan.close();

	}

	static int letters(String s) {
		char[] counter = s.toCharArray();
		int letter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(counter[i])) {
				letter++;
			}
		}
		System.out.println("Letters = " + letter);
		return letter;

	}

	static int space(String s) {
		char[] counter = s.toCharArray();
		int space = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isSpaceChar(counter[i])) {
				space++;
			}
		}
		System.out.println("Space = " + space);
		return space;

	}

	static int digit(String s) {
		char[] counter = s.toCharArray();
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(counter[i])) {
				num++;
			}
		}
		System.out.println("Num = " + num);
		return num;

	}

}

/*
 * 38. Write a Java program to count the letters, spaces, numbers and other
 * characters of an input string. Go to the editor Expected Output
 * 
 * The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33 letter: 23
 * space: 9 number: 10 other: 6
 */