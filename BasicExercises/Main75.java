package BasicExercises;

public class Main75 {

	public static void main(String[] args) {
		int tab[] = { 10, -20, 0, 30, 40, 60, 101 };

		if (tab[0] == tab[tab.length - 1]) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}

/*
 * 75. Write a Java program to test if the first and the last element of an
 * array of integers are same. The length of the array must be greater than or
 * equal to 2. Go to the editor Test Data: array = 50, -20, 0, 30, 40, 60, 10
 * Sample Output:
 * 
 * false
 */