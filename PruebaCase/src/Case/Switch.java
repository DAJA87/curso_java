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
		System.out.println("Men� principal");
		System.out.println("1. Opci�n 1 .");
		System.out.println("2. Opci�n 2 .");
		System.out.println("Digite la opci�n que desea: ");
		opcion = teclado.nextInt();
		
		switch (opcion) {
			case 1:
				System.out.println("Ingreso a la opci�n 1");			
				break;
			case 2:
				System.out.println("Ingreso a la opci�n 2");			
				break;
			case 3:
				System.out.println("Ingreso a la opci�n 3");			
				break;
			default:
				System.out.println("Opci�n no valida");
				menuPrincipal();
				break;
		}
	}
	
	public void menuPrincipal() {
		System.out.println("Men� principal");
		System.out.println("1. Opci�n 1.");
		System.out.println("2. Opci�n 2.");
		System.out.println("3. Opci�n 3.");
		System.out.println("Digite la opci�n que desea: ");
		opcion = teclado.nextInt();
		
		switch (opcion) {
			case 1:
				System.out.println("Ingreso a la opci�n 1");			
				break;
			case 2:
				System.out.println("Ingreso a la opci�n 2");			
				break;
			case 3:
				System.out.println("Ingreso a la opci�n 3");			
				break;
			default:
				System.out.println("Opci�n no valida");
				menuOpcion1();
				break;
		}
	}

}
