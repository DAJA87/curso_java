package Hilos;

public class CorrerHilos {

	public static void main(String[] args) {
		HiloMostrarCero hm1 = new HiloMostrarCero();
		hm1.start();
		HiloMostrarCero hm2 = new HiloMostrarCero();
		hm2.start();
	}
}
