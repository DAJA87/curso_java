package Clase2;

import java.util.Scanner;

/**
 * @author franklin.aguirre
 * @since 26/05/2020
 * @version 1.0
 * Verificar el salario de un empleado para saber si debe pagar impuesto.
 */
public class Empleado {
	private String nombre;
	private int salario;
	private Scanner teclado;
	
	/**
	 * Capturar la información del empleado.
	 */
	public void capturarInformacion() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado: ");
		nombre = teclado.nextLine();
		System.out.println("Ingresar salario:");
		salario = teclado.nextInt();
	}
	
	/**
	 * Imprimir la información ingresada.
	 */
	public void imprimirDatos() {
		System.out.println("");
		System.out.println("El empleado "+nombre+" tiene un salario de "+salario);
	}
	
	/**
	 * Imprimir validación si debe pagar impuestos.
	 */
	public void validarImpuestos() {
		String mensaje;
		
		if (salario > 3000000) {
			mensaje = "Debe pagar impuestos";
		}else {
			mensaje = "No debe pagar impuestos";
		}
		
		System.out.println("");
		System.out.println(mensaje);		
	}	
	
	public void cerrar() {
		teclado.close();
	}

	public static void main(String[] args) {
		Empleado emp = new Empleado();
		emp.capturarInformacion();
		emp.imprimirDatos();
		emp.validarImpuestos();
		emp.cerrar();
	}
}