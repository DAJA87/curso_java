package Vector;

import java.util.*;

public class Vector {
	private Scanner teclado;
	private int[] sueldos; // Definición de objeto tipo vector.
	private DatosEmpleado[] empleados;

	public void cargar() {
		teclado = new Scanner(System.in);
		sueldos = new int[2];
		empleados = new DatosEmpleado[5];

		for (int i = 0; i < empleados.length; i++) {
			DatosEmpleado de = new DatosEmpleado();
			empleados[i] = de;
		}
	}

	public void imprimir() {
		for (int i = 0; i < empleados.length; i++) {
			System.out.println("Nombre del empleado: " + empleados[i].getNombreEmpleado());
			System.out.println("Salario: "+empleados[i].getSalario());
		}
	}

	public static void main(String[] args) {
		Vector pv = new Vector();
		pv.cargar();
		pv.imprimir();
	}
}
