package Case;

import java.util.Scanner;

public class Switch {
	static Scanner teclado;
	static int opcion;

	public static void main(String[] args) {
		Switch sw = new Switch();
		sw.menuOpcion1();
	}
	
	public void menuOpcion1() {
		System.out.println("Menú principal");
		System.out.println("1. Opción 1 .");
		System.out.println("2. Opción 2 .");
		System.out.println("Digite la opción que desea: ");
		opcion = teclado.nextInt();
		
		switch (opcion) {
			case 1:
				System.out.println("Ingreso a la opción 1");			
				break;
			case 2:
				System.out.println("Ingreso a la opción 2");			
				break;
			case 3:
				System.out.println("Ingreso a la opción 3");			
				break;
			default:
				System.out.println("Opción no valida");
				menuPrincipal();
				break;
		}
	}
	
	public void menuPrincipal() {
		System.out.println("Menú principal");
		System.out.println("1. Opción 1.");
		System.out.println("2. Opción 2.");
		System.out.println("3. Opción 3.");
		System.out.println("Digite la opción que desea: ");
		opcion = teclado.nextInt();
		
		switch (opcion) {
			case 1:
				System.out.println("Ingreso a la opción 1");			
				break;
			case 2:
				System.out.println("Ingreso a la opción 2");			
				break;
			case 3:
				System.out.println("Ingreso a la opción 3");			
				break;
			default:
				System.out.println("Opción no valida");
				menuOpcion1();
				break;
		}
	}

}
