package org.example.sistema_reserva;

import java.util.ArrayList;

public class Cine {
	private int capacidad;
	private ArrayList<Integer> listaCine;


	public ArrayList<Integer> getListaCine() {
		return listaCine;
	}

	public void setListaCine(ArrayList<Integer> listaCine) {
		this.listaCine = listaCine;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
}
