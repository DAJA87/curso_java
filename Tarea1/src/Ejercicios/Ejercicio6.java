package Ejercicios;

import java.util.Scanner;

/**
	De un operario se conoce su sueldo y los a�os de antig�edad. Se pide confeccionar un programa que lea los datos de entrada e informe:
	a) Si el sueldo es inferior a 500 y su antig�edad es igual o superior a 10 a�os, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
	b)Si el sueldo es inferior a 500 pero su antig�edad es menor a 10 a�os, otorgarle un aumento de 5 %.
	c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.
 * @author franklin.aguirre
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int sueldo = 0, antiguedad = 0;
		double sueldoPagar = 0;
		
		System.out.println("Ingresar el sueldo");
		sueldo = teclado.nextInt();
		System.out.println("Ingresar la antig�edad en a�os");
		antiguedad = teclado.nextInt();
		sueldoPagar = sueldo;
		
		if (sueldo < 500 && antiguedad >= 10)
			sueldoPagar = sueldo+(sueldo*0.2);
		else if (sueldo < 500 && antiguedad < 10)
			sueldoPagar = sueldo+(sueldo*0.05);
		
		System.out.println("El sueldo a pagar es: "+sueldoPagar);
		teclado.close();
		
	}

}
