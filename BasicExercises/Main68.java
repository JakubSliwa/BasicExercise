package BasicExercises;

public class Main68 {

	public static void main(String[] args) {
		
		String str = "RAZ DWA TRZY TEST";
		
		String copiedStr = str.substring(str.length()-3);
		
		System.out.println(copiedStr + " " +  copiedStr + " " + copiedStr + " " + copiedStr);
		
	}
}


/*68. Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. The length of the original string must be 3 and above. Go to the editor
Sample Output:

3.03.03.03.0 
*/