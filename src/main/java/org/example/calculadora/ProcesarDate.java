package org.example.calculadora;


import java.util.Scanner;

public class ProcesarDate {
	public Scanner scan;
	public ProcesarDate(Scanner scan) {
		this.scan = scan;
	}

	public int sumarValores(int dateUno, int dateDos) {
		return dateUno + dateDos;

	}

	public int restarValores(int minuendo,int sustraendo) {
		return minuendo - sustraendo;
	}

	public int multiplicarValores(int multicando,int multiplicador) {
		return multicando* multiplicador;
	}

	public float dividirValores(int dividendo, int divisor) {
		return dividendo/divisor;
	}
}
