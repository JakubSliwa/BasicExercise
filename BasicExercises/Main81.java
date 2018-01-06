package BasicExercises;

import java.util.Arrays;

public class Main81 {

	public static void main(String[] args) {

		int tab1[] = { 20, 30, 40 };
		int tab2[] = { tab1[tab1.length - 1], 30, tab1[0] };

		System.out.println("Orginal array: " + Arrays.toString(tab1));
		System.out.println("After swaping: " + Arrays.toString(tab2));

	}
}

/*
 * 81. Write a Java program to swap the first and last elements of an array
 * (length must be at least 1) and create a new array. Go to the editor Sample
 * Output:
 * 
 * Original Array: [20, 30, 40] New array after swaping the first and last
 * elements: [40, 30, 20]
 */