package Matrices;

public class Ejercicio5 {

	public static void main(String[] args) {
		String[][] matriz = new String[9][9];
		int contador;
		
		for (int i = 0; i < 9; i++) {
			contador = 1;
			
			for (int j = 0; j < 9; j++) {
				if (i!=j&&i<j) {
					contador ++;
				}
				
				matriz[i][j] = String.valueOf(contador);
			}
		}
		
		System.out.println("LA MATRIZ ES LA SIGUIENTE");
	
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(matriz[i][j]+"|");
			}
			
			System.out.println();
		}
	}
}
