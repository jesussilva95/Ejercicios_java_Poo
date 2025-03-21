package org.example.reservas;
import java.util.Scanner;

public class Cine {
	private Sala[] salas; // Array que almacena las salas del cine

	// Constructor: Inicializa 3 salas con 10 asientos cada una
	public Cine() {
		salas = new Sala[]{
				  new Sala(1, 10),
				  new Sala(2, 10),
				  new Sala(3, 10)
		};
	}

	// Muestra la información de todas las salas disponibles y sus asientos libres
	public void mostrarSalas() {
		System.out.println("\n--- Salas Disponibles ---");
		for (Sala sala : salas) {
			System.out.println("Sala " + sala.getNumero() + " - Asientos disponibles: " + sala.asientosDisponibles());
		}
	}

	// Retorna una sala según el número ingresado, o null si el número no es válido
	public Sala getSala(int numeroSala) {
		return (numeroSala >= 1 && numeroSala <= salas.length) ? salas[numeroSala - 1] : null;
	}

	// Método que gestiona el proceso de reserva de asientos en una sala
	public void gestionarReservas() {
		Scanner scanner = new Scanner(System.in);

		mostrarSalas(); // Muestra las salas disponibles
		System.out.print("Seleccione una sala (1-3): ");
		int salaSeleccionada = scanner.nextInt();
		Sala sala = getSala(salaSeleccionada);

		if (sala == null) { // Verifica si la sala seleccionada es válida
			System.out.println(" Sala no válida.");
			return;
		}

		int asiento;
		do {
			sala.mostrarAsientos(); // Muestra los asientos de la sala seleccionada

			if (sala.estaLlena()) { // Si la sala está llena, se detiene el proceso
				System.out.println(" ¡Sala llena! No hay más asientos disponibles.");
				break;
			}

			System.out.print("Ingrese el número de asiento a reservar (0 para salir): ");
			asiento = scanner.nextInt();

			if (asiento != 0) {
				sala.reservarAsiento(asiento); // Intenta reservar el asiento seleccionado
			}
		} while (asiento != 0); // Repite el proceso hasta que el usuario ingrese 0 para salir
	}
}
