package Ejercicios;

import java.util.Scanner;

/**
 * Se debe desarrollar un programa que pida el ingreso del precio 
 * de un art�culo y la cantidad que lleva el cliente. Mostrar lo 
 * que debe abonar el comprador.
 * @author franklin.aguirre
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int precio = 0, cantidad = 0, valor = 0;
		
		System.out.println("Ingrese precio el del articulo");
		precio = teclado.nextInt();
		System.out.println("Ingrese la cantidad");
		cantidad = teclado.nextInt();
		valor = precio*cantidad;
		
		System.out.println("Debe cancelar el valor de: "+valor);
		teclado.close();
	}
}
