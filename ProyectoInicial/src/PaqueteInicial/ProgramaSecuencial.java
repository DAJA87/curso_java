package PaqueteInicial;

import java.util.Scanner;

/**
 * @author franklin.aguirre
 * Programa secuencial
 */
public class ProgramaSecuencial {
	
	public static void main(String[] args) {
		int a = 0, b = 0, suma = 0, resta = 0, x = 1;
		Scanner teclado = new Scanner(System.in);
		
		/*
		System.out.println("Digitar valor de a");
		a = teclado.nextInt();
		System.out.println("Digitar valor de b");
		b = teclado.nextInt();
				
		if (a>b) {
			suma = a + b;
			System.out.println("El resultado de la suma de (a) " + a + " + (b) " + b + " = " + suma);
		} else {			
			if (a<b) {
				resta = a - b;
				System.out.println("El resultado de la resta de (a) " + a + " - (b) " + b + " = " + resta);
			}else {
				System.out.println("Los valores son iguales");
			}
		}
		*/
		
		// Estructura repetitiva WHILE
		while (x <= 10) {
			System.out.print(x+"|");
			x++;
		}
		
		// Estructura repetitiva FOR
		for (int i = 0; i <= 10; i++) {
			System.out.print(i+"|");
		}
	
		teclado.close();
	}
}