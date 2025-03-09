package org.example.security;

import java.util.Random;
import java.util.Scanner;

public class SistemSecurity {
	// **Atributos**
	private boolean sensor1;
	private boolean sensor2;
	private boolean sensor3;
	private boolean esDeNoche;
	private boolean alarmaActivada;


	public SistemSecurity() {
		this.sensor1 = false;
		this.sensor2 = false;
		this.sensor3 = false;
		this.esDeNoche = false;
		this.alarmaActivada = false;
	}


	public boolean isAlarmaActivada() {
		return alarmaActivada;
	}

	public void setAlarmaActivada(boolean estado) {
		this.alarmaActivada = estado;
	}

	// **Método para simular la lectura de sensores y la detección de movimiento**
	public void tomarDatos() {
		Random random = new Random();
		sensor1 = random.nextBoolean();
		sensor2 = random.nextBoolean();
		sensor3 = random.nextBoolean();
		esDeNoche = random.nextBoolean();
	}

	// **Método para procesar los datos y activar/desactivar la alarma**
	public void procesarDatos() {
		int sensoresActivos = (sensor1 ? 1 : 0) + (sensor2 ? 1 : 0) + (sensor3 ? 1 : 0);

		if (sensoresActivos >= 2 && esDeNoche) {
			setAlarmaActivada(true);
		} else {
			setAlarmaActivada(false);
		}
	}

	// **Método para mostrar el estado del sistema**
	public void mostrarDatos() {
		System.out.println(" Estado de los Sensores:");
		System.out.println(" Sensor 1: " + (sensor1 ? "Movimiento Detectado" : "Sin Movimiento"));
		System.out.println(" Sensor 2: " + (sensor2 ? "Movimiento Detectado" : "Sin Movimiento"));
		System.out.println(" Sensor 3: " + (sensor3 ? "Movimiento Detectado" : "Sin Movimiento"));
		System.out.println(" Es de noche: " + (esDeNoche ? "Sí" : "No"));
		System.out.println(" Alarma: " + (isAlarmaActivada() ? " ACTIVADA" : " DESACTIVADA"));
		System.out.println("----------------------------------");
	}

	// **Método para iniciar la detección de intrusos**
	public  void iniciarSistema() {

		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
			System.out.println(" --- MENÚ DE SEGURIDAD ---");
			System.out.println("1. Iniciar Monitoreo");
			System.out.println("2. Activar/Desactivar Alarma");
			System.out.println("3. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
				case 1:
					System.out.println(" Iniciando Monitoreo de Sensores...");
					for (int i = 0; i < 5; i++) {
						tomarDatos();
						procesarDatos();
						mostrarDatos();
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							System.out.println("Error en la simulación.");
						}
					}
					break;

				case 2:
					setAlarmaActivada(!isAlarmaActivada());
					System.out.println("Alarma " + (isAlarmaActivada() ? "ACTIVADA " : "DESACTIVADA "));
					break;

				case 3:
					System.out.println("Saliendo del sistema de seguridad...");
					break;

				default:
					System.out.println("Opción no válida.");
			}

		} while (opcion != 3);

		scanner.close();
	}
}