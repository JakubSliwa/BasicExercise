package BasicExercises;

import java.util.Scanner;

public class Main34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj długość boku sześcianu: ");
		int a = scan.nextInt();
		System.out.println("Pole sześcianu wynosi: " + area(a));
		scan.close();
	}

	static double area(int a) {

		double result = (6 * Math.pow(a, 2)) / (4 * Math.tan(Math.PI / 6));
		return result;
	}
}

/*
 * Write a Java program to compute the area of a hexagon. Go to the editor Area
 * of a hexagon = (6 * s^2)/(4*tan(π/6)) where s is the length of a side Input
 * Data: Input the length of a side of the hexagon: 6 Expected Output
 * 
 * The area of the hexagon is: 93.53074360871938
 */