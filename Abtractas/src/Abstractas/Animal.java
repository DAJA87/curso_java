package Abstractas;

public abstract class Animal {
	// Atributos.
	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}
	
	// Metodos abstractos.
	abstract void sonido();
	abstract void commer();
	abstract void saludar();
}