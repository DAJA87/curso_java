package ArrayList;

import java.util.Scanner;

/**
 * Clase para almacenar la información de la persona.
 * @author franklin.aguirre
 * @since 02/06/2020
 * @version 1.0
 */
public class DatosPersona {
	//Scanner teclado;
	private String tipoIdentificacion, nombreCompleto;
	private int numeroIdentificacion, edad;
	
	/**
	 * @param tipoIdentificacion
	 * @param nombreCompleto
	 * @param numeroIdentificacion
	 * @param edad
	 */
	public DatosPersona(String tipoIdentificacion, String nombreCompleto, int numeroIdentificacion, int edad) {
		this.tipoIdentificacion = tipoIdentificacion;
		this.nombreCompleto = nombreCompleto;
		this.numeroIdentificacion = numeroIdentificacion;
		this.edad = edad;
	}

	public DatosPersona() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite su tipo de identificación: ");
		tipoIdentificacion = teclado.next();
		System.out.print("Digite su número de identificación: ");
		numeroIdentificacion = teclado.nextInt();
		System.out.print("Digite su nombre completo: ");
		nombreCompleto = teclado.next();
		System.out.print("Digite su edad: ");
		edad = teclado.nextInt();
	}
	
	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	
	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	
	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
