package BasicExercises;

public class Main70 {

	public static void main(String[] args) {

		String str1 = "JavaJAva";
		String str2 = "Tutorial";

		if (str1.length() >= str2.length())
			System.out.println(str2 + str1 + str2);
		else
			System.out.println(str1 + str2 + str1);

	}
}

/*
 * 70. Write a Java program to create a string in the form short_string +
 * long_string + short_string from two strings. The strings must not have the
 * same length. Go to the editor Test Data: Str1 = Python Str2 = Tutorial Sample
 * Output:
 * 
 * PythonTutorialPython
 */