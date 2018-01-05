package BasicExercises;

import java.util.Scanner;

public class Main60 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = scan.nextLine();
		String strLow = str.toLowerCase();
		System.out.println(strLow);
		scan.close();
	}
}


/*59. Write a Java program to convert a given string into lowercase. Go to the editor
Sample Output:

Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.           
the quick brown fox jumps over the lazy dog.
*/