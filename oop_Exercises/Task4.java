package oop_Exercises;

public class Task4 {

	public static void main(String[] args) {

		Burger burger = new Burger("BIG", 10);
		System.out.println(burger.toString());

		Calculator calc = new Calculator();

		calc.printAllOperations();
		calc.add(4, 3);
		calc.printAllOperations();
	}

}
