package ProyectoFinal;

import org.junit.Test;

public class AparcamientoTest {
	Aparcamiento ap = new Aparcamiento();

	@Test
	public void testRegistraOficial() {
		ap.registraOficial("AAA001");
	}
	
	@Test
	public void testRegistraResidente() {
		ap.registraResidente("AAA002");
	}

	@Test
	public void testEntra() {
		ap.entra("AAA003");
	}
	
	@Test
	public void testSale() {
		ap.sale("AAA004");
	}
	
	@Test
	public void testComienzaMes() {
		ap.comienzaMes();
	}
	
	@Test
	public void testGeneraInformePagosResidentes() {
		ap.generaInformePagosResidentes("archivo");
	}

}
