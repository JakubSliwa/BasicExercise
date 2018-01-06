package BasicExercises;

public class Main73 {

	public static void main(String[] args) {

		String str1 = "Python";
		String str2 = "";

		int length2 = str2.length();
		String result = "";
		result += (str1.length() >= 1) ? str1.charAt(0) : '#';
		result += (length2 >= 1) ? str2.charAt(length2 - 1) : '#';
		System.out.println(result);

	}
}

/*
 * 73. Write a Java program to create a new string taking first and last
 * characters from two given strings. If the length of either string is 0 use
 * "#" for missing character. Go to the editor Test Data: str1 = "Python" str2 =
 * " " Sample Output:
 * 
 * P#
 */