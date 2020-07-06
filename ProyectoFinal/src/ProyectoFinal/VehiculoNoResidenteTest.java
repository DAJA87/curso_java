package ProyectoFinal;

import java.util.Date;

import org.junit.Test;

public class VehiculoNoResidenteTest {
	VehiculoNoResidente vehiculoNoResidente = new VehiculoNoResidente();
	
	@Test
	public void testFinEstancia() {
		Date hora = new Date();
		vehiculoNoResidente.finEstancia(hora, hora);
	}

}
