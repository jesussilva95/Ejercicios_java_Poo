package org.example.juego_fizz_buzz;

public class FizzBuzz {
	// Método que ejecuta el juego de FizzBuzz del 1 al 100
	public void jugar() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				// Si es múltiplo de 3 y 5
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				// Si es múltiplo de 3
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				// Si es múltiplo de 5
				System.out.println("Buzz");
			} else {
				// Si no es múltiplo de 3 ni de 5
				System.out.println(i);
			}
		}
	}
}
