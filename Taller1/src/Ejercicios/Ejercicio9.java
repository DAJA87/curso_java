package Ejercicios;

import java.util.Scanner;

/**
   Confeccionar un programa que permita ingresar un valor del 1 al 10 
   y nos muestre la tabla de multiplicar del mismo (los primeros 12 t�rminos)
   Ejemplo: Si ingreso 3 deber� aparecer en pantalla los valores 3, 6, 9, hasta el 36.
 * @author franklin.aguirre
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Ingresar un n�mero del 1 al 10");
		numero = teclado.nextInt();
		System.out.println();
		
		System.out.println("Tabla del "+numero);
		System.out.println();
		
		for (int i = 1; i <= 12; i++) {
			System.out.println(numero*i);
		}
		
		teclado.close();
	}
}
