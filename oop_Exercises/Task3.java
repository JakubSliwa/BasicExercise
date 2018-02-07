package oop_Exercises;

public class Task3 {

	public static void main(String[] args) {

		Product firstProduct = new Product();

		firstProduct.setName("Apple");

		System.out.println(firstProduct.getName());

		Person2 person = new Person2();

		person.setName("Johny");
		person.setSurname("Coalski");
		person.setAge(25);

		System.out.println(
				person.getName() + " " + person.getSurname() + " " + person.getGender() + " " + person.getAge());

		System.out.println(person.getFullName());

		person.increaseAge();
		System.out.println(person.getAge());

		Car c1 = new Car();

		c1.setBrand("Mazda");
		c1.setModel("6");
		c1.setPrice(69999);

		System.out.println(c1.toString());
	}

}

/*
 * #### Zadanie 1 – rozwiązywane z wykładowcą.
 * 
 * Utwórz klasę `Product` dodaj w niej atrybut:
 * 
 * - name
 * 
 * Dodaj metody `setName` (ustawiającą `name`) oraz `getName` (zwracającą
 * `name`).
 * 
 * -----------------------------------------------------------------------------
 * 
 * #### Zadanie 2.
 * 
 * Utwórz klasę `Person` dodaj w niej atrybuty:
 * 
 * - name - surname - age - gender
 * 
 * Wszystkie atrybuty mają być prywatne, oraz mają mieć ustawione wartości
 * domyślne.
 * 
 * Dodaj metody `setName` , `setSurname` , `setAge`, `setGender` , które ustawią
 * atrybuty klasy zgodnie z nazwą, na którą wskazują. Np. `setName` - ustawia
 * atrybut `name` .
 * 
 * W pliku `Main1.java` umieść w metodzie `main` kod, który:
 * 
 * 1. Utworzy obiekt klasy `Person` o nazwie `person`, a następnie ustawi za
 * pomocą wcześniej utworzonych metod wszystkie atrybuty klasy.
 * 
 * 
 * #### Zadanie 3. Do klasy `Person` dopisz metodę `getFullName`, która zwróci
 * imię i nazwisko połączone znakiem spacji.
 * 
 * #### Zadanie 4. Do klasy `Person` napisz metodę `increaseAge`, która
 * inkrementuje zmienną `age` o 1.
 * 
 * #### Zadanie 5. Stwórz klasę `Car` posiadającą następujące atrybuty:
 * 
 * - brand - model - price
 * 
 * Stwórz metody dostępowe do ww. atrybutów tzw. gettery i settery.
 * 
 * Dopisz metodę `toString` wyświetlającą markę oraz cenę w jednej linii.
 */