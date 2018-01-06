package BasicExercises;

public class Main78 {

	public static void main(String[] args) {

		int tab1[] = { 5, 3 };

		if (tab1[0] == 4 || tab1[0] == 7)
			System.out.println(true);
		else
			System.out.println(tab1[1] == 4 || tab1[1] == 7);
	}
}

/*
 * 78. Write a Java program to test that a given array of integers of length 2
 * contains a 4 or a 7. Go to the editor Sample Output:
 * 
 * Original Array: [5, 7] true
 */