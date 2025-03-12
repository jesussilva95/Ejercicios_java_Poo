

/*
Control de inventario en una tienda de Ropa: en una tienda de ropa, el sistema mantiene un "arreglo estático"
 de las categorías de productos, como "camisas", "pantalones" y "zapatos". cuando un cliente realiza la compra,
 el sistema verifica si la cantidad solicitada esta disponible en el "arreglo estático" de inventario utilizando
 una "condición". si la cantidad es suficiente, se actualiza el inventario con un "bucle" que recorre los productos
y ajusta las existencias. si no hay suficientes unidades, el sistema muestra un mensaje indicando que el producto
esta agotado.
 */
package org.example.tienda;
import java.util.Scanner;

public class TiendaRopa {


	private static String[] categorias = {"Camisas", "Pantalones", "Zapatos"};
	private static int[] inventario = {10, 5, 8};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;

		while (continuar) {
			mostrarInventario();
			System.out.println("Seleccione el producto que desea comprar:");
			System.out.println("1. Camisas");
			System.out.println("2. Pantalones");
			System.out.println("3. Zapatos");
			System.out.println("4. Salir");
			System.out.print("Opción: ");
			int opcion = scanner.nextInt();

			if (opcion >= 1 && opcion <= 3) {
				procesarCompra(opcion - 1, scanner);
			} else if (opcion == 4) {
				System.out.println("Gracias por su compra. ¡Vuelva pronto!");
				continuar = false;
			} else {
				System.out.println(" Opción inválida.");
			}
		}
		scanner.close();
	}

	private static void mostrarInventario() {
		System.out.println(" Inventario actual:");
		for (int i = 0; i < categorias.length; i++) {
			System.out.println(categorias[i] + ": " + inventario[i] + " unidades");
		}
	}

	private static void procesarCompra(int indice, Scanner scanner) {
		System.out.print("Ingrese la cantidad de " + categorias[indice] + " que desea comprar: ");
		int cantidad = scanner.nextInt();

		if (cantidad > inventario[indice]) {
			System.out.println(" No hay suficiente stock. Disponibles: " + inventario[indice] + " unidades.");
		} else {
			inventario[indice] -= cantidad;
			System.out.println(" Compra realizada con éxito. Stock actualizado.");
		}
	}
}

