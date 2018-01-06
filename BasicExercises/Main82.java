package BasicExercises;

import java.util.Arrays;

public class Main82 {

	public static void main(String[] args) {

		int tab[] = { 20, 30, 80, 50, 67 };

		System.out.println("Original Array: " + Arrays.toString(tab));
		int max_val = tab[0];

		if (tab[tab.length - 1] >= max_val) {
			max_val = tab[tab.length - 1];
		}
		if (tab[tab.length / 2] >= max_val) {
			max_val = tab[tab.length / 2];
		}

		System.out.println("Larger value between first and last element: " + max_val);

	}
}

/*
 * 82. Write a Java program to find the largest element between first, last, and
 * middle values from an array of integers (even length). Go to the editor
 * Sample Output:
 * 
 * Original Array: [20, 30, 40, 50, 67] Largest element between first, last, and
 * middle values: 67
 */