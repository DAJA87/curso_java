package Clase2;

/**
 * Clase para almacenar la informaci�n de una persona.
 * @author franklin.aguirre
 *
 */
public class DatosPersona {
	int identificacion;
	String tipoIdentificacion, nombreCompleto;
	
	/**
	 * @param identificacion
	 * @param tipoIdentificacion
	 * @param nombreCompleto
	 */
	public DatosPersona(int identificacion, String tipoIdentificacion, String nombreCompleto) {
		this.identificacion = identificacion;
		this.tipoIdentificacion = tipoIdentificacion;
		this.nombreCompleto = nombreCompleto;
	}
}