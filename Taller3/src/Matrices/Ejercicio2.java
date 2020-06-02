package Matrices;

import java.util.Scanner;

/**
 * Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primer fila con la segundo. 
 * Imprimir luego la matriz.
 * @author franklin.aguirre
 *
 */
public class Ejercicio2 {
	static String[][] matriz;
	static String valor;
	static int filas, columnas;
	
	public Ejercicio2() {
		Scanner teclado = new Scanner(System.in);		
		System.out.print("Ingresar n�mero de filas:");
		filas = teclado.nextInt();
		System.out.print("Ingresar n�mero de columnas:");
		columnas = teclado.nextInt();
		matriz = new String[filas][columnas];
		System.out.println();
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("Ingresar dato fila("+i+") columna("+j+"): ");
				matriz[i][j] = teclado.next();
			}
		}
		
		teclado.close();
	}
	
	// Imprimir la matriz.
	public void imprimir(String mensaje) {
		System.out.println();
		System.out.println(mensaje);
		System.out.println();
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j]+"|");
			}
			System.out.println();
		}
	}
	
	// Cambiar filas.
	public void cambiarFilas() {
		for (int i = 0; i < columnas; i++) {
			valor = matriz[0][i];
			matriz[0][i] = matriz[1][i];
			matriz[1][i] = valor;		
		}
	}
	
	public static void main(String[] args) {
		Ejercicio2 ej = new Ejercicio2();
		ej.imprimir("LA MATRIZ ES LA SIGUIENTE");
		ej.cambiarFilas();
		ej.imprimir("LA MATRIZ CAMBIANDO FILA UNO Y DOS ES LA SIGUIENTE");
	}
}
