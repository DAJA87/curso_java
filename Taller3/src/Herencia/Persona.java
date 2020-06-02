package Herencia;

import java.util.Scanner;

/**
 * Clase persona
 * @author franklin.aguirre
 * @since 30/05/2020
 */
public class Persona {
	public String nombre;
	public int edad;
	public Scanner teclado = new Scanner(System.in);
	
	public Persona() {
		System.out.println("Ingresar el nombre");
		nombre = teclado.next();
		System.out.println("Ingresar la edad");
		edad = teclado.nextInt();
	}
	
	public void imprimirPersona() {
		System.out.println("El nombre de la persona es: "+nombre);
		System.out.println("La edad de "+nombre+" es: "+edad);
	}
}
