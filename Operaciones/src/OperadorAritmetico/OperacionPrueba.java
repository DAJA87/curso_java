package OperadorAritmetico;

public class OperacionPrueba {

	public static void main(String[] args) {
		try {
			int resultado = OperadorAritmetico.division(2, 0);
		}catch (Exception e) {
			System.out.println("El error es:" + e.toString());
		}	
	}
}
