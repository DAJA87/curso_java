package Principal;

import java.util.Scanner;

public class Alumno{
    private int dni, telefono;
    private String nombre, direccion;
    Scanner teclado = new Scanner(System.in);

    public void Insertar(int identificador) {
    	dni = identificador;
    	System.out.print("Ingresar nombre:");
    	nombre = teclado.next();
		System.out.print("Ingresar dirección:");
		direccion = teclado.next();
		System.out.print("Ingresar telefono:");
		telefono = teclado.nextInt();
    }
    
    public int getDni() {return dni;}
	public void setDni(int dni) {this.dni = dni;}
	public int getTelefono() {return telefono;}
	public void setTelefono(int telefono) {this.telefono = telefono;}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getDireccion() {return direccion;}
	public void setDireccion(String direccion) {this.direccion = direccion;}
	public Scanner getTeclado() {return teclado;}
	public void setTeclado(Scanner teclado) {this.teclado = teclado;}

	public void imprimir() {
        System.out.println("Alumno-> ID: "+dni+" Nombre: "+nombre+" Dirección: "+direccion+" Telefono: "+telefono);
    }
}