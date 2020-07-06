package ProyectoFinal;

import java.util.Date;

import org.junit.Test;

public class EstanciaTest {
	Estancia estancia = new Estancia();

	@Test
	public void testEstancias() {
		Date hora = new Date();
		estancia.Estancias(hora, hora);
	}

}
