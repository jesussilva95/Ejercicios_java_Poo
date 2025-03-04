
package org.example.calculadora;

import java.util.Scanner;

public class CalculadoraPrincipal {

	public Scanner scan;
	public ProcesarDate operacion;

	public CalculadoraPrincipal(){
		ProcesarDate operacion = new ProcesarDate(scan);
		this.operacion = operacion;
		Scanner scan = new Scanner(System.in);
		this.scan = scan;
	}

	public void tomarEleccion(){
		int aux;
		do {
			System.out.println("Que operacion desea calclar?");
			System.out.println("Suma = 1/ Resta = 2/ Multiplicacion = 3/ Divicion = 4 ");
			int respuesta = scan.nextInt();
			switch (respuesta){
				case 1:
					suma();
					break;
				case 2:
					sustraer();
					break;
				case 3 :
					multiplicar();
					break;
				case 4:
					dividir();
					break;
				default:
			}
			System.out.println("Desea Salir precione uno si no cualquier numero");
			aux = scan.nextInt();
			scan.nextLine();

		}while (aux != 1);

	}

	private void suma() {
		System.out.println("Escriba el numero uno a sumar");
		int dateUno = scan.nextInt();
		System.out.println("Escriba el numero dos a sumar");
		int dateDos = scan.nextInt();
		scan.nextLine();
		int result = operacion.sumarValores(dateUno,dateDos);
		System.out.println("El resultado de la suma es: "+result);
	}
	private void sustraer() {
		System.out.println("Escriba el numero Uno: ");
		int minuendo = scan.nextInt();
		System.out.println("Escriba la cantidad que desea restar: ");
		int sustraendo = scan.nextInt();
		scan.nextLine();
		int result = operacion.restarValores(minuendo,sustraendo);
		System.out.println("El resultado de la resta es: " + result);
	}
	private void multiplicar() {
		System.out.println("Escriba el numero a multiplicar: ");
		int multiplicando = scan.nextInt();
		System.out.println("Escriba el multiplicador: ");
		int multiplicador = scan.nextInt();
		scan.nextLine();
		int product = operacion.multiplicarValores(multiplicando,multiplicador);
		System.out.println("El resultado de la multiplicacion es: " + product);
	}
	private void dividir() {
		System.out.println("Escriba un numero: ");
		int dividendo = scan.nextInt();
		System.out.println("Escriba porcuanto desea dividir: ");
		int divisor = scan.nextInt();
		scan.nextLine();
		float product = operacion.dividirValores(dividendo,divisor);
		System.out.println("El resultado de la divicion es: "+product);
	}
}
