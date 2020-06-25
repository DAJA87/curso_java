package Ejercicios;

import java.util.Scanner;

/**
 * Implementar la clase operaciones. Se deben cargar dos valores enteros en el
 * constructor, calcular su suma, resta, multiplicación y división, cada una 
 * en un método, imprimir dichos resultados.
 * @author franklin.aguirre
 *
 */
public class Operaciones {
	int valor1 = 0, valor2 = 0;
	Scanner teclado = new Scanner(System.in);
	
	public Operaciones() {
		System.out.println("Ingresar valor 1");
		this.valor1 = teclado.nextInt();
		System.out.println("Ingresar valor 2");
		this.valor2 = teclado.nextInt();
	}
	
	private void suma() {
		System.out.println("La suma es: " +(valor1 + valor2)); 
	}
	
	private void resta() {
		System.out.println("La resta es: " +(valor1 - valor2)); 
	}
	
	private void multiplicacion() {
		System.out.println("La multiplicación es: " +(valor1 * valor2)); 
	}
	
	private void division() {
		System.out.println("La división es: " +(valor1 / valor2)); 
	}
	
	public static void main(String[] args) {
		Operaciones ope = new Operaciones();
		ope.suma();
		ope.resta();
		ope.multiplicacion();
		ope.division();
	}

}
