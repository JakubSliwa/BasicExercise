package BasicExercises;

public class Main83 {

	public static void main(String[] args) {

		int tab1[] = { 1, 3, -5, 4 };
		int tab2[] = { 1, 4, -5, -2 };
		String result = "";
		
		for (int i = 0; i < tab1.length; i++) {
			int num1 = tab1[i];
			int num2 = tab2[i];
			result += Integer.toString(num1 * num2) + " ";
		}
		System.out.println("Result: " + result);
	}
}

/*
 * 83. Write a Java program to multiply corresponding elements of two arrays of
 * integers. Go to the editor Sample Output:
 * 
 * Array1: [1, 3, -5, 4]
 * 
 * Array2: [1, 4, -5, -2]
 * 
 * Result: 1 12 25 -8
 */