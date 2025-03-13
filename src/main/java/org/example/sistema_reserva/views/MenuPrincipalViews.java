package org.example.sistema_reserva.views;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipalViews {

	public Scanner scam;
	public ReservaViews reservaViews;
	public UserViews userViews;
	public MenuPrincipalViews(){
		this.scam = new Scanner(System.in);
		this.reservaViews = new ReservaViews();
		this.userViews = new UserViews();
	}

	public void menuMain() {
		boolean salir = false;

		while (!salir) {
			try {
				System.out.println("\nSeleccione la acción a realizar: ");
				System.out.println("1. Registrar usuario");
				System.out.println("2. Realizar Reserva");
				System.out.println("3. Ver Salas disponibles");
				System.out.println("4. Cancelar");

				System.out.print("Ingrese una opción: ");
				// Verifica si la entrada es un número
				if (!scam.hasNextInt()) {
					System.out.println("Error: Debe ingresar un número válido.");
					scam.nextLine();
					continue;
				}

				int opt = scam.nextInt();
				scam.nextLine();

				switch (opt) {
					case 1:
						registrarUsuario();
						break;
					case 2:
						registrarReserva();
						break;
					case 3:
						mostrarSalas();
						break;
					case 4:
						System.out.println("Saliendo del sistema... ¡Hasta luego!");
						salir = true;
						break;
					default:
						System.out.println("Opción no válida. Intente de nuevo.");
				}
			} catch (Exception e) {
				System.out.println("Ocurrió un error inesperado: " + e.getMessage());
				e.printStackTrace();
				scam.nextLine();
			}
		}

	}


	private void registrarUsuario() {
		userViews.registrarUser();
	}


	private void registrarReserva() {

	}

	private void mostrarSalas() {

	}

	private void mensajeFinal() {
		System.out.println("Chao mano!");
	}

}
