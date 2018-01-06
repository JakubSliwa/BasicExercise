package BasicExercises;

public class Main90 {

	public static void main(String[] args) {
		// gets the value of the specified environment variable "PATH"
		System.out.println("Environment variable PATH: ");
		System.out.println(System.getenv("PATH"));

		// gets the value of the specified environment variable "TEMP"
		System.out.println("Environment variable TEMP: ");
		System.out.println(System.getenv("TEMP"));

		// gets the value of the specified environment variable "USERNAME"
		System.out.println("Environment variable USERNAME: ");
		System.out.println(System.getenv("USERNAME"));
	}
}

/*
 * 90. Write a Java program to get the value of the environment variable PATH,
 * TEMP, USERNAME.
 */