package BasicExercises;

import java.util.Scanner;

public class Main35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj liczbę boków : ");
		int b = scan.nextInt();

		System.out.println("Podaj długość boku : ");
		int a = scan.nextInt();

		System.out.println("Pole wynosi: " + area(a, b));
		scan.close();
	}

	static double area(int a, int b) {

		double result = (b * Math.pow(a, 2)) / (4 * Math.tan(Math.PI / b));
		return result;
	}
}

/*
 * 35. Write a Java program to compute the area of a polygon. Go to the editor
 * Area of a polygon = (n*s^2)/(4*tan(π/n)) where n is n-sided polygon and s is
 * the length of a side Input Data: Input the number of sides on the polygon: 7
 * Input the length of one of the sides: 6 Expected Output
 * 
 * The area is: 130.82084798405722
 * 
 * Click me to see the solution
 */