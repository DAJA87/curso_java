package Ejercicios;

import java.util.Scanner;

/**
	Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente 
	información: cantidad total de preguntas que se le realizaron y la cantidad de 
	preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese 
 	los dos datos por teclado e informe el nivel del mismo según el porcentaje de 
	respuestas correctas que ha obtenido, y sabiendo que:
	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
 * @author franklin.aguirre
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cantPreguntas = 0, pregCorrectas = 0;
		double porcentaje = 0;
		String nivel = null;
		
		System.out.println("Ingrese la cantidad de preguntas");
		cantPreguntas = teclado.nextInt();
		System.out.println("Ingrese las preguntas contestadas correctamente");
		pregCorrectas = teclado.nextInt();
		porcentaje = (pregCorrectas*100)/cantPreguntas; 
		
		if (porcentaje >= 90)
			nivel = "Nivel máximo";
		else if (porcentaje >= 75 && porcentaje < 90) 
			nivel = "Nivel medio";
		else if (porcentaje >= 50 && porcentaje < 75)
			nivel = "Nivel regular";
		else if (porcentaje < 50)
			nivel = "Fuera de nivel";
		
		System.out.println("El nivel obtenido es: " + nivel);
		
		teclado.close();
	}

}
