package Ejercicios;

import java.util.Scanner;

/**
 * Se ingresan tres notas de un alumno, si el promedio es 
 * mayor o igual a siete mostrar un mensaje "Promocionado"
 * @author franklin.aguirre
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;
		
		System.out.println("Ingresar Nota 1");
		nota1 = teclado.nextDouble();
		System.out.println("Ingresar Nota 2");
		nota2 = teclado.nextDouble();
		System.out.println("Ingresar Nota 3");
		nota3 = teclado.nextDouble();
		
		promedio = (nota1+nota2+nota3)/3;
		
		if (promedio >= 7) 
			System.out.println("PROMOCIONADO");
		else
			System.out.println("NO PROMOCIONADO");
		
		teclado.close();
	}

}
