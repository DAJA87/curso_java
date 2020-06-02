package Vector;

import java.util.*;

public class Vector {
	private Scanner teclado;
	private int[] sueldos; // Definición de objeto tipo vector.
	private String[] empleados;

	public void cargar() {
		teclado = new Scanner(System.in);
		sueldos = new int[5];
		empleados = new String[5];

		for (int i = 0; i < empleados.length; i++) {
			System.out.print("Ingrese el nombre del empleado: ");
			empleados[i] = teclado.next();
			System.out.print("Ingrese el valor del salario: ");
			sueldos[i] = teclado.nextInt();
		}
	}

	public void imprimir() {
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Nombre del empleado: " + empleados[i]);
			System.out.println("Salario: "+sueldos[i]);
		}
	}

	public static void main(String[] args) {
		Vector pv = new Vector();
		pv.cargar();
		pv.imprimir();
	}
}
