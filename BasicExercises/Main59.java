package BasicExercises;

import java.util.Scanner;

public class Main59 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a Sentence: ");
		String line = scan.nextLine();
		String[] words = line.split("[ ]+");
		System.out.println("Penultimate word: " + words[words.length - 2]);
		scan.close();
	}
}

/*
 * 60. Write a Java program to find the penultimate (next to last) word of a
 * sentence. Go to the editor Sample Output:
 * 
 * Input a String: The quick brown fox jumps over the lazy dog. Penultimate
 * word: lazy
 */