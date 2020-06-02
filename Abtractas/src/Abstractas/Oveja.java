package Abstractas;

public class Oveja extends Animal{
	// Atributos.
	int patas;
	
	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public Oveja(String nombre, int patas) {
		super(nombre);
		this.patas = patas;
	}

	@Override
	void sonido() {
		System.out.println("Beeeeee");
	}

	@Override
	void commer() {
		System.out.println("Comer pasto");
	}

	@Override
	void saludar() {
		System.out.println("Hola soy "+this.nombre+" y tengo "+this.patas); 
	}
}
