package oop_Exercises;

public class Task1 {

	public static void main(String[] args) {

		Cat cat = new Cat();
		Dog dog = new Dog();

		if (cat.equals(dog)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not equals");
		}
	}

}

/*
 * #### Zadanie 1 – rozwiązywane z wykładowcą. Stwórz klasę `Cat`.
 * 
 * -----------------------------------------------------------------------------
 * 
 * #### Zadanie 2. Stwórz klasę `Dog`.
 * 
 * #### Zadanie 3. W pliku `Main1.java` umieść w metodzie `main` kod, który:
 * 
 * 1. Utwórz obiekt klasy Cat i przypisz do zmiennej `cat`. 2. Utwórz obiekt
 * klasy Dog i przypisz do zmiennej `dog`. 3. Spróbuj porównać oba te obiekty za
 * pomocą instrukcji `if`, zaobserwuj jaki wystąpi błąd.
 */