package testPackage;

import java.time.LocalDate;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;

	public Employee(String n, double s, int year, int month, int day) {
		this.name = n;
		this.salary = s;
		this.hireDay = LocalDate.of(year, month, day);
	}

	public String getName() {
		return name;
	}
}
