package Herencia;

/**
 * Clase empleado.
 * @author franklin.aguirre
 *
 */
public class Empleado extends Persona{
	private int sueldo;
	
	public Empleado() {
		System.out.println("Ingresar el sueldo");
		sueldo = teclado.nextInt();
	}
	
	public void imprimirEmpleado() {
		imprimirPersona();
		System.out.println("El sueldo es: "+sueldo);
	}
}
