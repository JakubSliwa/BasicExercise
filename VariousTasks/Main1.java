package VariousTasks;

public class Main1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i % 2 == 1) {
					continue;
				}

				System.out.print(i * j + " ");
			}
			System.out.println();
		}

	}

}
