package oop_Exercises;

public class Person2 {

	private String name = "Jan";
	private String surname = "Kowalski";
	private String gender = "Male";
	private int age = 18;

	public String getFullName() {
		return name + " " + surname;
	}

	public void increaseAge() {
		age++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

/**
 * #### Zadanie 3. Do klasy `Person` dopisz metodę `getFullName`, która zwróci
 * imię i nazwisko połączone znakiem spacji.
 * 
 * #### Zadanie 4. Do klasy `Person` napisz metodę `increaseAge`, która
 * inkrementuje zmienną `age` o 1.
 */
/*
 * ### Zadanie 2.
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
 */