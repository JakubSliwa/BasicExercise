package testPackage;

import java.util.StringTokenizer;

public class main1 {

	public static void main(String[] args) {

		double result = basic.CM_PER_INCH * 2;

		double a = -2110;
		double y = Math.abs(a);

		System.out.println(y);
		result = a < y ? a++ : y;
		System.out.println(result + " " + a);

		String greeting = "CzEkaj!";
		String s = greeting.substring(0, 5);
		String z = s.substring(2).toUpperCase();

		System.out.println(s + " " + z + greeting);
		String myText = "abc";
		System.out.println(myText);
		String b = myText.toUpperCase(); // Tworzy nowy obiekt
		System.out.println(b);
		System.out.println(z.charAt(1));

		int textLength = s.length();
		System.out.println(textLength);
		String newText = greeting.replaceFirst("a", "ERROR").trim();
		System.out.println(newText);
		newText = greeting.replaceAll("a", "R");
		System.out.println(newText);
		System.out.println(String.join("----", "Raz", "Dwa"));
		System.out.println(newText);

		newText = "Cześć!";
		s = newText.substring(0, 3) + "kaj!";
		System.out.println(s);

		System.out.println(s.equals(newText));
		System.out.println(s.equalsIgnoreCase(greeting));

		if (newText == "Cześć!") {
			System.out.println("tak");
		}

		if (newText.substring(0, 3) == "Cze") { // Wrong!
			System.out.println("nie");
		}

		String str = "1.";
		if (str != null && str.length() != 0) {
			System.out.println("Not null and not 0");

			greeting = "Cześć!";
			int n = greeting.length();
			int cpCount = greeting.codePointCount(0, greeting.length());
			System.out.println(n + " " + cpCount);

			s = "hi mum how are you";
			int pos = s.indexOf("mum");
			String textAfterMum = s.substring(pos + "mum".length());
			System.out.println(textAfterMum);

			System.out.println(s.charAt(3));
			System.out.println(s.compareTo(newText));
			System.out.println(s.lastIndexOf(newText));

			StringBuilder builder = new StringBuilder();
			builder.append(str);
			builder.append(s);
			String completedString = builder.toString();
			System.out.println(completedString);

			str = "To	jest	tekst	do	podziału";
			StringTokenizer strTok = new StringTokenizer(str);
			while (strTok.hasMoreTokens()) {
				s = strTok.nextToken();
				System.out.println(s);
			}
		}

	}

}
