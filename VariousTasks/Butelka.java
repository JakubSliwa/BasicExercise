package VariousTasks;

public class Butelka {

	private double ileLitrów;

	Butelka(double ileLitrów) {
		this.ileLitrów = ileLitrów;
	}

	double getIleLitrów() {
		return ileLitrów;
	}

	void wlej(double ilość) {
		this.ileLitrów += ilość;

	}

	boolean wylej(double ilość) {
		if (ilość < ileLitrów) {
			this.ileLitrów -= ilość;
			return true;
		} else {
			return false;
		}
	}

	void przelej(double ilość, Butelka gdziePrzelać) {
		if (this.wylej(ilość)) {
			gdziePrzelać.wlej(ilość);
		} else {
			System.out.println("Za mało");
		}
	}

	public static void main(String[] args) {

		Butelka[] butelka = new Butelka[3];

		butelka[0] = new Butelka(3);
		butelka[1] = new Butelka(2);
		butelka[2] = new Butelka(1);

		System.out.println(butelka[0].getIleLitrów());
		System.out.println(butelka[1].getIleLitrów());
		System.out.println(butelka[2].getIleLitrów());

		butelka[0].wlej(4);
		System.out.println(butelka[0].getIleLitrów());
		butelka[0].przelej(12, butelka[2]);
		System.out.println(butelka[0].getIleLitrów());
		System.out.println(butelka[2].getIleLitrów());
	}

}

/*
 * int ileButelek = 50; Butelka[] butelka = new Butelka[ileButelek];
 * 
 * for (int i = 0; i <= ileButelek - 1; i++) { butelka[i] = new
 * Butelka(ileLitrów); System.out.println(Arrays.deepToString(butelka));
 */