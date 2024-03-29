package Ejercicios;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Plantear un programa que permita jugar a los dados. 
 * Las reglas de juego son: se tiran tres dados si 
 * los tres salen con el mismo valor mostrar un mensaje que "gano", sino "perdi�".
 * @author franklin.aguirre
 *
 */
public class Dados {
	public static void main(String[] args) {
		int dado1 = 0, dado2 = 0, dado3 = 0;
		Random numeroAleatorio = new Random();
		IntStream numeros = numeroAleatorio.ints(6, 1, 7);
		Iterator iterador = numeros.iterator();
		
		dado1 = (int) iterador.next();
		dado2 = (int) iterador.next();
		dado3 = (int) iterador.next();
		
		System.out.println("DADO 1: " +dado1+" - DADO 2: "+dado2+" DADO 3: "+dado3);
		System.out.println();
		
		if (dado1 == dado2 && dado2 == dado3)
			System.out.println("GANO");
		else
			System.out.println("PERDIO");
	}

}
