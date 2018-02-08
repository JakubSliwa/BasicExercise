package oop_Exercises;

public class Calculator {

	String[] lastOperations;
	int numberOfOperations;

	public Calculator() {
		lastOperations = new String[0];
		numberOfOperations = 0;
	}

	private void addOperationToArray(String operation) {

		if (numberOfOperations >= lastOperations.length) {
			String[] tempArray = new String[numberOfOperations + 1];
			System.arraycopy(lastOperations, 0, tempArray, 0, lastOperations.length);
			lastOperations = tempArray;
		}
		lastOperations[numberOfOperations] = operation;
		numberOfOperations++;
	}

	public void printAllOperations() {

		if (lastOperations.length == 0) {
			System.out.println("NO OPERATIONS");
		}
		for (int i = 0; i < lastOperations.length; i++) {
			System.out.println(lastOperations[i]);
		}
	}

	public void clearLastOperations() {

		lastOperations = new String[0];
		numberOfOperations = 0;

	}

	public int add(int num1, int num2) {
		int result;
		result = num1 + num2;
		addOperationToArray("added " + num1 + " to " + num2 + " get " + result);
		return result;

	}

	public int multiplay(int num1, int num2) {
		int result;
		result = num1 * num2;
		addOperationToArray("multiplied " + num1 + " with " + num2 + " get " + result);
		return result;

	}

	public int subtract(int num1, int num2) {
		int result;
		result = num1 - num2;
		addOperationToArray("substract " + num1 + " from " + num2 + " get " + result);
		return result;

	}

	public int divide(int num1, int num2) {
		int result;
		result = num1 / num2;
		addOperationToArray("divide " + num1 + " by" + num2 + " get " + result);
		return result;

	}
}

/*
 * #### Zadanie 2.
 * 
 * Stwórz klasę ```Calculator```. Konstruktor ma nie przyjmować żadnych danych.
 * Każdy nowo stworzony obiekt powinien mieć tablicę String , w której będzie
 * trzymać historię ostatnich operacji (stwórz ją w konstruktorze - z
 * początkowym rozmiarem 0). Następnie dodaj do klasy następujące metody:
 * 
 * 1. ```add(num1, num2)``` - metoda ma dodać do siebie dwie zmienne i zwrócić
 * wynik. Dodatkowo na liście operacji ma zapamiętać napis:
 * "added ```num1``` to ```num2``` got ```result```". 2. ```multiply(num1,
 * num2)``` - metoda ma pomnożyć przez siebie dwie zmienne i zwrócić wynik.
 * Dodatkowo na liście operacji ma zapamiętać napis:
 * "multiplied ```num1``` with ```num2``` got ```result```". 3.
 * ```subtract(num1, num2)``` - metoda ma odjąć od siebie dwie zmienne i zwrócić
 * wynik. Dodatkowo na liście operacji ma zapamiętać napis:
 * "subtracted ```num1``` from ```num2``` got ```result```". 4. ```divide(num1,
 * num2)``` - metoda ma podzielić przez siebie dwie zmienne i zwrócić wynik.
 * Dodatkowo na liście operacji ma zapamiętać napis:
 * "divided ```num1``` by ```num2``` got ```result```". Pamiętaj, że nie można
 * dzielić przez zero. 5. ```printOperations()``` - metoda ma wypisać wszystkie
 * zapamiętane operacje. 6. ```clearOperations()``` - metoda ma wyczyścić
 * wszystkie zapamiętane operacje.
 * 
 * Możesz dopisać metodę pomocniczą która będzie dodawała wpis na liście
 * operacji oraz zwiększała rozmiar tablicy przez kopiowanie.
 * 
 * Pamiętaj o używaniu ```this``` w odpowiednich miejscach. Stwórz kilka
 * kalkulatorów i przetestuj ich działanie.
 */