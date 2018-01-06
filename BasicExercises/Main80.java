package BasicExercises;

import java.util.Arrays;

public class Main80 {

	public static void main(String[] args) {

		int tab[] = { 20, 30, 40 };
		System.out.println("Original Array: " + Arrays.toString(tab));
		int max_val = tab[0];
		if (tab[2] >= max_val)
			max_val = tab[2];
		System.out.println("Larger value between first and last element: " + max_val);
	}
}

/*
 * 80. Write a Java program to get the larger value between first and last
 * element of an array (length 3) of integers . Go to the editor Sample Output:
 * 
 * Orginal Array: [20, 30, 40] Larger value between first and last element: 40
 */