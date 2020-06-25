package Ejercicios;

import java.util.Scanner;

/**
 * Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de las personas.
 * @author franklin.aguirre
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		double promedio = 0, suma = 0, altura = 0;
		
		System.out.println("Ingresar el número de alturas a ingresar");
		numero = teclado.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			System.out.println("Ingrese altura número "+i);
			altura = teclado.nextDouble();
			suma = suma + altura;			
		}
		
		promedio = suma/numero;
		System.out.println("El promedio de altura es: "+promedio);
		teclado.close();
	}

}
