package Ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa en el cual se ingresen cuatro n�meros, 
 * calcular e informar la suma de los dos primeros y el producto 
 * del tercero y el cuarto.
 * @author franklin.aguirre
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, suma = 0, producto = 0;
		
		System.out.println("Ingresar n�mero 1");
		num1 = teclado.nextInt();
		System.out.println("Ingresar n�mero 2");
		num2 = teclado.nextInt();
		System.out.println("Ingresar n�mero 3");
		num3 = teclado.nextInt();
		System.out.println("Ingresar n�mero 4");
		num4 = teclado.nextInt();
		
		suma = num1 + num2;
		producto = num3 * num4; 
				
		System.out.println("La suma de los dos primeros n�meros es: "+suma);
		System.out.println("El producto de los n�meros tercero y cuarto es: "+producto);
		
		teclado.close();
	}

}
