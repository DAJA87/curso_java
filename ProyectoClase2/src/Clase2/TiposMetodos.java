package Clase2;

import java.util.Scanner;

/**
 * @author franklin.aguirre
 * @since 26/05/2020
 * @version 1.0
 */
public class TiposMetodos {
	private Scanner teclado;
	private String nombre;
	private int edad;
	static String mayor = "Mayor de edad";
	
	/**
	 * Metodo para inicializar la información.
	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.println("Digite su nombre");
		nombre = teclado.nextLine();
		System.out.println("Digite su edad");
		edad = teclado.nextInt();
	}
	*/
	
	/**
	 * Metodo para validar si la persona es mayor de edad o no.
	 * @return mayor
	 */
	public String mayorEdad() {		
		if (edad < 18) {
			mayor = "Menor de edad";
		}
		
		return mayor;
	}
	
	/**
	 * Constructor de la clase.
	 */
	public TiposMetodos() {
		teclado = new Scanner(System.in);
		System.out.println("Digite su nombre");
		this.nombre = teclado.nextLine();
		System.out.println("Digite su edad");
		this.edad = teclado.nextInt();
		teclado.close();
	}

	/**
	 * Imprimir la información.
	 * @param mayorEdad
	 */
	public void imprimir(String mayorEdad) {
		System.out.println("Bienveinido(a) " + nombre);
		System.out.println("Usted es: " + mayorEdad);
	}

	public static void main(String[] args) {
		String mayorEdad;
		TiposMetodos tm = new TiposMetodos();
		//tm.inicializar();
		mayorEdad = tm.mayorEdad();
		tm.imprimir(mayorEdad);
	}

}
