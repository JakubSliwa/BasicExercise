package VariousTasks;

import java.util.Arrays;

public class Butelka {

	public static void main(String[] args) {
		int ileButelek = 50;
		Butelka[] butelka = new Butelka[ileButelek];

		for (int i = 0; i <= ileButelek - 1; i++) {
			butelka[i] = new Butelka();
			System.out.println(butelka[i]);
		}

	}

}
