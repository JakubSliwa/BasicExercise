package BasicExercises;

import java.util.Arrays;

public class Main79 {

	public static void main(String[] args) {

		int tab[] = { 20, 30, 40 };
		System.out.println("Orginal tab: " + Arrays.toString(tab));

		int tab2[] = { tab[1], tab[2], tab[0] };
		System.out.println("Rotated tab: " + Arrays.toString(tab2));

	}
}

/*
 * 79. Write a Java program to rotate an array (length 3) of integers in left
 * direction. Go to the editor Sample Output:
 * 
 * Original Array: [20, 30, 40] Rotated Array: [30, 40, 20]
 */