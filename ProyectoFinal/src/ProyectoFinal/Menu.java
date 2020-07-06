package ProyectoFinal;

import java.util.Scanner;

public class Menu {
	static Scanner teclado = new Scanner(System.in);
	static String opcion, matricula;	
	static Aparcamiento aparcamiento = new Aparcamiento();
	
	public void menuPrincipal() {
		System.out.println("PARQUEADERO");
		System.out.println("1. Registrar Entrada");
		System.out.println("2. Registrar Salida");
		System.out.println("3. Da de alta vehículo oficial");
		System.out.println("4. Da de alta vehículo de residente");
		System.out.println("5. Comienza mes");
		System.out.println("6. Pagos de residentes");
		System.out.println("7. Salir");
		System.out.print("Ingresar opcion:");
		opcion = teclado.next();
	
		switch (opcion) {
		case "1":
			aparcamiento.entra(solicitudMatricula());
			menuPrincipal();
			
		case "2":
			aparcamiento.sale(solicitudMatricula());
			menuPrincipal();
			
		case "3":
			aparcamiento.registraOficial(solicitudMatricula());
			menuPrincipal();
			
		case "4":
			aparcamiento.registraResidente(solicitudMatricula());
			menuPrincipal();
			
		case "5":
			aparcamiento.comienzaMes();
			menuPrincipal();
			
		case "6":
			aparcamiento.generaInformePagosResidentes(solicitudNombreRuta());
			menuPrincipal();
			
		case "7":
			System.exit(0);
			
		default:
			System.out.println("Opción no valida digite de nuevo alguna opción.");
			menuPrincipal();
		}
	}
	
	public String solicitudMatricula() {
		System.out.print("Ingresar matricula:");
		return teclado.next();
	}
	
	public String solicitudNombreRuta() {
		System.out.print("Ingresar nomnbre del archivo: ");
		return teclado.next();
	}
}