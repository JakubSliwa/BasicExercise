package BasicExercises;

public class Main84 {

	public static void main(String[] args) {

		String str = "Java is the best";
		String str2 = str.substring(str.length() - 3);

		System.out.println(str2 + str);
	}
}

/*
 * 84. Write a Java program to take the last three characters from a given
 * string and add the three characters at both the front and back of the string.
 * String length must be greater than three and more. Go to the editor Test
 * data: "Python" will be "honPythonhon" Sample Output:
 * 
 * PyPythonPy
 */
