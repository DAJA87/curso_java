package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
	static String nombreCompleto, tipoIdentificacion;
	static int numeroIdentificacion, edad;
	
	public void capturarDatos() {		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite su tipo de identificación: ");
		tipoIdentificacion = teclado.next();
		System.out.print("Digite su número de identificación: ");
		numeroIdentificacion = teclado.nextInt();
		System.out.print("Digite su nombre completo: ");
		nombreCompleto = teclado.next();
		System.out.print("Digite su edad: ");
		edad = teclado.nextInt();
	}
	
	
	public static void main(String[] args) {
		/*
		ArrayList<String> al = new ArrayList<>();
		al.add("Mauricio");
		al.add("Juan");
		al.add(1, "Lina");
		al.add("Pedro");
		
		// Imprimir el array.
		System.out.println("Dato: "+al);
		
		for (String nombres : al) {
			System.out.println("Dato: "+nombres);
		}
		
		System.out.println("Valor: "+al.get(2));
		al.set(2, "Juan Luis");
		System.out.println("Dato: "+al);
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(21);
		al.add(11);
		al.add(1);
		Collections.sort(al);
		al.sort(null);
		
		for (Integer edades : al) System.out.println("Edades: "+edades);
		*/
		
		ArrayList<DatosPersona> ald = new ArrayList<>();
		
		for (int i = 0; i < 2; i++) {
			ArrayListTest alt = new ArrayListTest();
			alt.capturarDatos();
			DatosPersona dp = new DatosPersona(tipoIdentificacion, nombreCompleto, numeroIdentificacion, edad);
			ald.add(dp);
		}
		
		/*
		for (int i = 0; i < ald.size(); i++) {
			System.out.println("Número identificación: "+ald.get(i).getNumeroIdentificacion());
			System.out.println("Tipo de identificación: "+ald.get(i).getTipoIdentificacion());
			System.out.println("Nombre completo: "+ald.get(i).getNombreCompleto());
			System.out.println("Edad: "+ald.get(i).getEdad());
		}
		*/
		
		for (DatosPersona dpi : ald) {
			System.out.println("Número identificación: "+dpi.getNumeroIdentificacion());
			System.out.println("Tipo de identificación: "+dpi.getTipoIdentificacion());
			System.out.println("Nombre completo: "+dpi.getNombreCompleto());
			System.out.println("Edad: "+dpi.getEdad());
		}
	}

}
