package BasicExercises;

import java.util.Scanner;

public class Main36 {
	final static double RADIUS = 6371.01;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj szerokość geograficzną pierwszego punktu : ");
		double x1 = scan.nextDouble();
		System.out.println("Podaj długość geograficzną pierwszego punktu : ");
		double y1 = scan.nextDouble();
		System.out.println("Podaj szerokość geograficzną drugiego punktu : ");
		double x2 = scan.nextDouble();
		System.out.println("Podaj długość geograficzną drugiego punktu : ");
		double y2 = scan.nextDouble();

		System.out.println("Wybrane punkty mają współrzędne:");
		System.out.println("Punkt pierwszy : [" + x1 + ", " + y1 + "]");
		System.out.println("Punkt drugi : [" + x2 + ", " + y2 + "]");

		System.out.println("Odległość między punktami to: " + distance(x1, y1, x2, y2));
		scan.close();
	}

	static double distance(double x1, double y1, double x2, double y2) {
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		double result = RADIUS
				* Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		return result;
	}

}

/*
 * 36. Write a Java program to compute the distance between two points on the
 * surface of earth. Go to the editor Distance between the two points [ (x1,y1)
 * & (x2,y2)] d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1
 * - y2)) Radius of the earth r = 6371.01 Kilometers Input Data: Input the
 * latitude of coordinate 1: 25 Input the longitude of coordinate 1: 35 Input
 * the latitude of coordinate 2: 35.5 Input the longitude of coordinate 2: 25.5
 * Expected Output
 * 
 * The distance between those points is: 1480.0848451069087 km
 */