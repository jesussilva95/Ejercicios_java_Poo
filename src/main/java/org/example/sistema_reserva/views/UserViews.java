package org.example.sistema_reserva.views;

import java.util.Scanner;

public class UserViews {
	Scanner scam;
	public UserViews(){
		this.scam = new Scanner(System.in);
	}

	public void registrarUser(){
		System.out.println("Nombre del usuario ");
		String name = scam.nextLine();
		System.out.println("Cedula del usuario ");
		String cedula = scam.nextLine();
		System.out.println("usuario " + name+" de cedula "+cedula+" Creado con exito");
	}

}
