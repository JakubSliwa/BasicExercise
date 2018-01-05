package BasicExercises;

public class Main61 {

	public static void main(String[] args) {

		String str = "qwertyuiop";
		String reverse = reverseString(str);
		System.out.println(reverse);
	}

	static String reverseString(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
}

/*
 * 61. Write a Java program to reverse a word. Go to the editor Sample Output:
 * 
 * Input a word: dsaf Reverse word: fasd
 */