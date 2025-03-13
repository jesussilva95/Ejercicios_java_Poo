
/*

Monitoreo de temperatura en una Fabrica: En una fabrica de productos lácteos, se realizan sensores para medir la
temperatura de los taques de leche y los resultados se almacenas en una "arreglo dinámico" para verificar si alguna
temperatura es demasiado alta, se activa una "condición" para enviar una alerta al operador y detener la producción si es
necesario.
 */
package org.example.temperatura;

import java.util.ArrayList;
import java.util.Scanner;

public class MonitoreoTemperatura {

	public void tomarTempe() {
		ArrayList<Double> temperaturas = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;

		while (continuar) {
			System.out.print("Ingrese la temperatura del tanque de leche (°C): ");
			double temp = scanner.nextDouble();
			temperaturas.add(temp);

			// Verificar si la temperatura es demasiado alta
			if (temp > 10) {
				System.out.println(" ¡ALERTA! Temperatura superior a 10°C. Detenga la producción. ");
			} else {
				System.out.println(" Temperatura dentro del rango seguro.");
			}

			// Preguntar si desea ingresar otra temperatura
			System.out.print("¿Desea registrar otra temperatura? (si/no): ");
			String respuesta = scanner.next().toLowerCase();
			if (respuesta.equals("no")) {
				continuar = false;
			}
		}

		// Mostrar todas las temperaturas registradas
		System.out.println(" Historial de temperaturas registradas:");
		for (double temp : temperaturas) {
			System.out.println( temp + "°C");
		}

		System.out.println(" Monitoreo finalizado.");
		scanner.close();
	}
}

