package BasicExercises;

import java.time.LocalDate;
import java.util.Date;

public class Main45 {

	public static void main(String[] args) {

		new Date();
		System.out.println(new Date());

		String date = new Date().toString();
		System.out.println(date);

		Date birthday = new Date();
		System.out.println(birthday);

		LocalDate.now();
		System.out.println(LocalDate.now());
	}

}

/*
 * 46. Write a Java program to display the system time. Go to the editor Sample
 * Output:
 * 
 * Current Date time: Fri Jun 16 14:17:40 IST 2017
 */