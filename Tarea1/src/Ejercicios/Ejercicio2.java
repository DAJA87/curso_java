package Ejercicios;

import java.util.Scanner;

/**
 * Realizar un programa que lea cuatro valores num�ricos e informar su suma y promedio.
 * @author franklin.aguirre
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, suma = 0;
		double promedio = 0;
		
		System.out.println("Ingresar n�mero 1");
		num1 = teclado.nextInt();
		System.out.println("Ingresar n�mero 2");
		num2 = teclado.nextInt();
		System.out.println("Ingresar n�mero 3");
		num3 = teclado.nextInt();
		System.out.println("Ingresar n�mero 4");
		num4 = teclado.nextInt();
		
		suma = num1+num2+num3+num4;
		promedio = suma/4; 
				
		System.out.println("La suma de todos los n�meros es: "+suma);
		System.out.println("El promedio de los n�mero es: "+promedio);
		
		teclado.close();
	}

}
