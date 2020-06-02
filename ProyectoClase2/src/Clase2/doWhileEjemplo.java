package Clase2;

import java.util.Scanner;

public class doWhileEjemplo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		
		do {
			System.out.println("Ingrese el valor entre 0 y 9999, (0 Salir)");
			valor = teclado.nextInt();
			
			if (valor>=100) {
				System.out.println("Tiene 3 digitos");
			}else {
				if (valor>=10) {
					System.out.println("Tiene dos digitos");
				}else {
					System.out.println("Tiene 1 digito");
				}
			}
			
		}while(valor!=0);
		
		teclado.close();

	}

}
