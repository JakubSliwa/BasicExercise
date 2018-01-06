package BasicExercises;

public class Main86 {

	public static void main(String[] args) {

		int a, b;
		a = 80;
		b = 95;

		System.out.println(check(a));
		System.out.println(check(b));
	}

	public static boolean check(int x) {
		if (x < 90 || x > 95) {
			return true;
		}
		return false;
	}
}

/*
 * 86. Write a Java program to check if a number is less than 90 and greater
 * than 95. Go to the editor Sample Data: n1 = 80 n2 = 95 Sample Output:
 * 
 * false
 */