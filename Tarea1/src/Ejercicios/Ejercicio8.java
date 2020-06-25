package Ejercicios;

import java.util.Scanner;

/**
 * En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, 
 * realizar un programa que lea los sueldos que cobra cada empleado e informe 
 * cu�ntos empleados cobran entre $100 y $300 y cu�ntos cobran m�s de $300. 
 * Adem�s el programa deber� informar el importe que gasta la empresa en sueldos al personal.
 * @author franklin.aguirre
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0,  sueldo = 0, contC = 0, contT = 0, suma = 0;
		
		System.out.println("Ingresar el n�mero de empleados");
		numero = teclado.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			System.out.println("Ingrese el sueldo del empleado "+i);
			sueldo = teclado.nextInt();
			
			if (sueldo < 100 || sueldo > 500  ) {
				System.out.println("El sueldo debe estar entre 100 y 500 debe ingresarlo nuevamente");
				i--;
				continue;
			}else if (sueldo >= 100 && sueldo <= 300)
				contC++;
			else if (sueldo > 300)
				contT++;
			
			suma = suma + sueldo;
		}
		
		System.out.println("La cantidad de empleados que cobran entren 100 y 300 es: "+contC);
		System.out.println("La cantidad de empleados que cobran mas de 300 es: "+contT);
		System.out.println("El importe que gasta la empresa en sueldo es: "+suma);
		teclado.close();					
	}
}
