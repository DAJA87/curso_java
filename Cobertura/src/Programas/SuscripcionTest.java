package Programas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SuscripcionTest {
	@Test
	public void testPrecioPormes() {
		double esperado = 12500.0;
		Suscripcion s = new Suscripcion(25000, 2);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}
	
	@Test
	public void testPrecioPormes2() {
		double esperado = 8334.333333333334;
		Suscripcion s = new Suscripcion(25000, 3);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}
	
	@Test
	public void testPrecioPormes3() {
		double esperado = 0.0;
		Suscripcion s = new Suscripcion(25000, 0);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}
	
	@Test
	public void testCancel(){
		Suscripcion s = new Suscripcion(25000, 0);
		s.cancel();
	}
	
	@Test
	public void testCancel2(){
		Suscripcion s = new Suscripcion(0, 0);
		s.cancel();
	}
}
