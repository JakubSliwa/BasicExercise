package BasicExercises;

import java.io.File;

public class Main47 {

	public static void main(String[] args) {

		  System.out.println("/home/js/Pulpit/doc/template.odt : " + new File("/home/js/Pulpit/doc/template.odt").length() + " bytes");
		  System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
	}
}

/*
 * 47. Write a Java program to find the size of a specified file. Go to the
 * editor Sample Output:
 * 
 * /home/students/abc.txt : 0 bytes /home/students/test.txt : 0 bytes
 */