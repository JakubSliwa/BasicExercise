package BasicExercises;

public class Main72 {

	public static void main(String[] args) {

		String str1 = "";

		int length = str1.length();
		if (length >= 3) {
			System.out.println(str1.substring(0, 3));
		} else if (length == 1) {
			System.out.println((str1.charAt(0) + "##"));
		} else if (length == 2) {
			System.out.println((str1.charAt(0) + "#"));
		} else {
			System.out.println("###");
		}

	}
}

/*
 * 72. Write a Java program to create a new string taking first three characters
 * from a given string. If the length of the given string is less than 3 use "#"
 * as substitute characters. Go to the editor Test Data: Str1 = " " Sample
 * Output:
 * 
 * ###
 */