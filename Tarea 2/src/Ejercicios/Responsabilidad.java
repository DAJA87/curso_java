package Ejercicios;

/**
	Plantear una clase Club y otra clase Socio.
	La clase Socio debe tener los siguientes atributos privados: 
	nombre y la antig�edad en el club (en a�os). En el constructor 
	pedir la carga del nombre y su antig�edad. La clase Club debe 
	tener como atributos 3 objetos de la clase Socio. Definir una 
	responsabilidad para imprimir el nombre del socio con mayor 
	antig�edad en el club.
 * @author franklin.aguirre
 */
public class Responsabilidad {
	public static void main(String[] args) {
		Club club = new Club();
		
		if ((club.soc1.getAntiguedad() > club.soc2.getAntiguedad()) && (club.soc1.getAntiguedad() > club.soc3.getAntiguedad()))
			System.out.println("El socio con mayor antig�edad es: "+club.soc1.getNombre());
		else if ((club.soc2.getAntiguedad() > club.soc1.getAntiguedad()) && (club.soc2.getAntiguedad() > club.soc3.getAntiguedad()))
			System.out.println("El socio con mayor antig�edad es: "+club.soc2.getNombre());
		else if ((club.soc3.getAntiguedad() > club.soc1.getAntiguedad()) && (club.soc3.getAntiguedad() > club.soc2.getAntiguedad()))
			System.out.println("El socio con mayor antig�edad es: "+club.soc3.getNombre());
	}
}