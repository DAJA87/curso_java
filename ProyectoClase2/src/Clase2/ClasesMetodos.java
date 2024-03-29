package Clase2;

import java.util.Scanner;

public class ClasesMetodos {
	// Variables globales.
	static String mayor = "Mayor de edad", nombre;
	static int edad;
	static ClasesMetodos cm = new ClasesMetodos();

	/**
	 * Metodo para calcular si la persona es mayor de edad o menor de edad.
	 * No recibe ni retorna parámetros.
	 */
	public void mayorEdad() {
		if (edad < 18) {
			mayor = "Menor de edad";
		}
	}
	
	/**
	 * Metodo para imprimir la información en memoria de la persona.
	 */
	public void imprimir() {
		mayorEdad();
		System.out.println("Bienveinido(a) " + nombre);
		System.out.println("Usted es: " + mayor);
	}

	public static void main(String[] args) {	
		// Crear un objeto e instanciarlo.
		Scanner capturar = new Scanner(System.in);
		System.out.println("Digite su nombre");
		nombre = capturar.nextLine();

		System.out.println("Digite su edad");
		edad = capturar.nextInt();

		cm.imprimir();	
		
		// Cerrar el Scanner.
		capturar.close();
	}
}
