package BasicExercises;

import java.util.Scanner;

public class Main58 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a Sentence: ");
		String line = scan.nextLine();
		String upper_case_line = "";
		Scanner lineScan = new Scanner(line);
		while (lineScan.hasNext()) {
			String word = lineScan.next();
			upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		System.out.println(upper_case_line.trim());
		scan.close();
		lineScan.close();
	}
}

/*
 * 58. Write a Java program to capitalize the first letter of each word in a
 * sentence. Go to the editor Sample Output:
 * 
 * Input a Sentence: the quick brown fox jumps over the lazy dog. The Quick
 * Brown Fox Jumps Over The Lazy Dog.
 */