package Vectores;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroPersonas, opcion = 0, contador = 0;
		String[] vectorPersonas;
		String nombreNuevo, nombreBusqueda;
		
		System.out.print("Ingresar n�mero de personas a almacenar: ");
		numeroPersonas = teclado.nextInt();
		vectorPersonas = new String[numeroPersonas];
		System.out.println();
		
		for (int i = 0; i < vectorPersonas.length; i++) {
			System.out.print("Ingresar persona n�mero "+i+": ");
			vectorPersonas[i] = teclado.next();
		}

		while (opcion != 5) {
			contador = 0;
			System.out.println();
			System.out.println("1.Contar la cantidad de nombres que se tienen almacenados en el vector");
			System.out.println("2.Imprimir los nombres almacenados en el vector");
			System.out.println("3.Buscar un nombre en el vector y contar la cantidad de veces que esta almacenado");
			System.out.println("4.Actualizar un nombre del vector e imprimir el resultado");
			System.out.println("5.Salir");
			System.out.println();
			System.out.print("Ingrese alguna de las opciones anteriores: ");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 1:		
				System.out.println("La cantidad de nombres es: "+numeroPersonas);
				System.out.println();
				break;
			case 2:
				System.out.println("NOMBRES ALMACENADOS EN EL VECTOR");
				
				for (int i = 0; i < vectorPersonas.length; i++)
					System.out.print(vectorPersonas[i]+" | ");
				
				System.out.println();
				break;
			case 3:
				System.out.print("Ingrese nombre a buscar: ");
				nombreBusqueda = teclado.next();
				
				for (int i = 0; i < vectorPersonas.length; i++) {
					if (vectorPersonas[i].equals(nombreBusqueda))
						contador ++;
				}
				
				if (contador > 0)
					System.out.println("La cantidad de veces que se encuentra el nombre es: "+contador);
				else
					System.out.println("No se encontro ese nombre");
				
				System.out.println();
				break;
			case 4:
				System.out.print("Ingrese nombre a actualizar: ");
				nombreBusqueda = teclado.next();
				System.out.print("Ingrese nuevo nombre: ");
				nombreNuevo = teclado.next();
				
				for (int i = 0; i < vectorPersonas.length; i++) {
					if (vectorPersonas[i].equals(nombreBusqueda))
						vectorPersonas[i] = nombreNuevo;
				}
				
				System.out.println("EL VECTOR ES EL SIGUIENTE");
				
				for (int i = 0; i < vectorPersonas.length; i++) 
					System.out.print(vectorPersonas[i]+" | ");
				
				System.out.println();
				break;
			}
		}
		
		teclado.close();
	}
}
