package Principal;

import java.util.Scanner;

public class Menus {
	static Scanner teclado = new Scanner(System.in);
	static int opcion, dni;
	static String nombre;
	static Curso curso = new Curso();
	
	public void menuPrincipal() {
		System.out.println("Bienvenido al menú principal");
		System.out.println("Seleccione la opción");
		System.out.println("1. Matricular Alumno");
		System.out.println("2. Buscar alumno por DNI");
		System.out.println("3. Ver datos curso");
		System.out.println("4. Salir");
		opcion = teclado.nextInt();
		
		switch (opcion) {
		case 1:
	    	System.out.print("Ingresar DNI: ");
	    	dni = teclado.nextInt();
	    	
	    	if (!curso.BuscarPorDNI(dni)) {
				curso.AnadirAlumno(dni);
			}
	  
			menuPrincipal();
			
		case 2:
			System.out.print("Ingresar DNI:");
			dni = teclado.nextInt();
			curso.BuscarPorDNI(dni);			
			menuPrincipal();
			
		case 3:
			curso.ImprimirCurso();
			menuPrincipal();
			
		case 4:
			System.out.println("Salir");
			System.exit(0);
		
		default:
			System.out.println("Opción no valida");
			menuPrincipal();
		}		
	}
}
