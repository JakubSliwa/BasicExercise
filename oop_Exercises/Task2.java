package oop_Exercises;

public class Task2 {

	public static void main(String[] args) {

		Attribute attr = new Attribute();

		System.out.println(attr.publicAttribute);
		System.out.println(attr.protectedAttribute);

		Person person = new Person();
		System.out.println(person.name);
		System.out.println(person.surname);
		System.out.println(person.gender);
		System.out.println(person.age);

	}

}

/*
 * #### Zadanie 1 – rozwiązywane z wykładowcą.
 * 
 * Utwórz klasę `Attribute` dodaj w niej atrybuty:
 * 
 * 1. Atrybut o nazwie `publicAttribute` z modyfikatorem `public`. 2. Atrybut o
 * nazwie `privateAttribute` z modyfikatorem `private`. 3. Atrybut o nazwie
 * `protectedAttribute` z modyfikatorem `protected`.
 * 
 * W pliku `Main1.java` umieść w metodzie `main` kod, który:
 * 
 * 1. Utworzy obiekt klasy `Attribute` i przypisze go do zmiennej `attr`. 2.
 * Sprawdź które z atrybutów klasy `Attribute` są dostępne.
 * 
 * -----------------------------------------------------------------------------
 * 
 * #### Zadanie 2.
 * 
 * W pliku `Main2.java` umieść w metodzie `main` kod, który:
 * 
 * 1. Utworzy obiekt klasy `Attribute` o nazwie `attr` a następnie ustaw i
 * wyświetl wszystkie wartości które są możliwe do ustawienia.
 * 
 * #### Zadanie 3.
 * 
 * Utwórz klasę `Person` dodaj w niej atrybuty: - name - surname - age - gender
 * 
 * Wszystkie atrybuty mają być publiczne, oraz mają mieć ustawione wartości
 * domyślne.
 * 
 * W pliku `Main3.java` umieść w metodzie `main` kod, który:
 * 
 * 1. Utworzy obiekt klasy `Person` o nazwie `person` a następnie wyświetl
 * kolejno atrybuty klasy (name, surname, age, gender)
 */