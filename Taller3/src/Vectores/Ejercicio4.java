package Vectores;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] vector;
		String nuevoValor;
		int valorNuevo;
		
		vector = new String[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingresar valor "+i+":");
			vector[i] = teclado.next();
		}
		
		System.out.print("Ingrese nuevo valor:");
		nuevoValor = teclado.next();
		System.out.print("Ingrese posici�n a reemplazar de 0 a 9: ");
		valorNuevo = teclado.nextInt();
		
		vector[valorNuevo] = nuevoValor;
		
		System.out.println("EL VECTOR ES EL SIGUIENTE");
		
		for (int i = 0; i < 10; i++) {
			System.out.print(vector[i]+" | ");
		}

		teclado.close();
	}

}
