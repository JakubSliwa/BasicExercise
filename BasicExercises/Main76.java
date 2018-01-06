package BasicExercises;

public class Main76 {

	public static void main(String[] args) {

		int tab1[] = { 50, -20, 0, 30, 40, 60, 12 };
		int tab2[] = { 50, 20, 10, 20, 30, 50, 12 };

		if (tab1[0] == tab2[0] && tab1[tab1.length - 1] == tab2[tab2.length - 1]) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}

/*
 * 6. Write a Java program to test if the first and the last element of two
 * array of integers are same. The length of the array must be greater than or
 * equal to 2. Go to the editor Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
 * array2 = 45, 20, 10, 20, 30, 50, 11 Sample Output:
 * 
 * false
 */