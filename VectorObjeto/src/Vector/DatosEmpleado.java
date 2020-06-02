package Vector;

import java.util.Scanner;

public class DatosEmpleado {
	Scanner teclado;
	String nombreEmpleado;
	int salario;
	
	public DatosEmpleado() {
		teclado = new Scanner(System.in);
		System.out.println();
		this.nombreEmpleado = teclado.nextLine();
		System.out.println();
		this.salario = teclado.nextInt();
	}

	public Scanner getTeclado() {
		return teclado;
	}

	public void setTeclado(Scanner teclado) {
		this.teclado = teclado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	

}
