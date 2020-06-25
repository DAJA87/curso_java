package Hilos;

public class HiloMostrarCero extends Thread{

	public void run() {
		for (int i = 0; i < 1000; i++) System.out.print("0-");
	}
}