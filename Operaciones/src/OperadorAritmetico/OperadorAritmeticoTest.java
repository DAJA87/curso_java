package OperadorAritmetico;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

/*
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;*/
import org.junit.Test;


class OperadorAritmeticoTest {

	//private Throwable t;

	@Test
	void testSuma() {
		int esperado = 8;
		int a = 5;
		int b = 3;
		int suma = OperadorAritmetico.suma(a, b);
		assertEquals(esperado, suma);
	}

	@Test
	void testDivision() throws Exception {
		int esperado = 2;
		int a = 8;
		int b = 4;
		int division;
		division = OperadorAritmetico.division(a, b);
		assertEquals(esperado, division);
	}
	
	@Test 
	void testDivision2() {
		//String error = "java.lang.Exception";
		int a = 8;
		int b = 0;
		assertThrows(java.lang.Exception.class, () -> {OperadorAritmetico.division(a, b);});	
		
		
	}
}