package Vectores;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] vector;
		int tamano;
		double suma = 0;
		
		System.out.print("Ingresar n�mero de alturas: ");
		tamano = teclado.nextInt();
		vector = new String[tamano];
		
		for (int i = 0; i < tamano; i++) {
			System.out.print("Ingresar posici�n ("+(i+1)+"): ");
			vector[i] = teclado.next();
			suma = suma + Double.parseDouble(vector[i]);
		}
		
		System.out.println();
		System.out.println("La media de alturas es: "+(suma/tamano));
		teclado.close();
	}
}