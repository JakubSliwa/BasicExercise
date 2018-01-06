package BasicExercises;

import java.util.Arrays;

public class Main77 {

	public static void main(String[] args) {

		int tab1[] = { 50, -20, 0 };
		int tab2[] = { 5, -50, 10 };
		int tab3[] = { tab1[0], tab2[tab2.length - 1] };
		System.out.println(Arrays.toString(tab1));
		System.out.println(Arrays.toString(tab2));
		System.out.println("Tab 3 is: " + Arrays.toString(tab3));

	}
}

/*
 * 77. Write a Java program to create a new array of length 2 from two arrays of
 * integers with three elements and the new array will contain the first and
 * last elements from the two arrays. Go to the editor Test Data: array1 = 50,
 * -20, 0 array2 = 5, -50, 10 Sample Output:
 * 
 * Array1: [50, -20, 0] Array2: [5, -50, 10] New Array: [50, 10]
 */