package Herencia;

/**
 * Clase para probar las clases de herencia con las operaciones.
 * @author franklin.aguirre
 *
 */
public class Test {
	static int valor1, valor2;
	
	public static void main(String[] args) {
		Operaciones ope = new Operaciones();
		ope.cargar();
		valor1 = ope.valor1;
		valor2 = ope.valor2;
		
		Suma s = new Suma();
		Resta r = new Resta();
		
		s.sumar(valor1, valor2);
		r.resta(valor1, valor2);
		s.mostrarResultado();
		r.mostrarResultado();
	}
}
