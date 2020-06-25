package Hilos;

public class MostrarCeroUno {
	
	public void mostrar0() {
		for (int i = 0; i < 1000; i++) System.out.print("0-");
	}
	
	public void mostrar1() {
		for (int i = 0; i < 1000; i++) System.out.print("1-");
	}

	public static void main(String[] args) {
		MostrarCeroUno mcu = new MostrarCeroUno();
		mcu.mostrar0();
		System.out.println();
		mcu.mostrar1();
	}
}