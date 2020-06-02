package Clase2;

import java.util.Scanner;

public class ColaboracionClases {
	static int identificacion = 0, salario = 0;
	static String tipoIdentificacion, nombreCompleto;
		
	/**
	 * Constructor de la clase.
	 */
	private ColaboracionClases() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite su n�mero de Identificaci�n: ");
		identificacion = teclado.nextInt();
		System.out.println("Digite su tipo de identificaci�n: ");
		tipoIdentificacion = teclado.next();
		System.out.println("Digite su nombre completo: ");
		nombreCompleto = teclado.next();
		System.out.println("Digite su salario: ");
		salario = teclado.nextInt();
	}

	public static void main(String[] args) {
		new ColaboracionClases();
		new DatosPersona(identificacion, tipoIdentificacion, nombreCompleto);
		Salario s = new Salario(salario);
		s.imprimir();
	}

}