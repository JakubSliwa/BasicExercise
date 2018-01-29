package VariousTasks;

public class Main37 {

	static final double VAT = 1.23;

	public static void main(String[] args) {

		System.out.println(calculateNet(500, VAT));
	}

	private static double calculateNet(double gross, double vat) {
		return gross / vat;
	}
}

/*
 * W pliku Main5.java Napisz metodę calculateNet, która przyjmie argumenty:
 * 
 * gross, czyli kwotę brutto ceny zakupu, vat, czyli wartość podatku VAT. Możesz
 * założyć, że VAT ma być liczbą zmiennoprzecinkową z zakresu 0 – 1. Funkcja ma
 * zwrócić wartość netto ceny. Jakie obliczenia musisz wykonać?
 */