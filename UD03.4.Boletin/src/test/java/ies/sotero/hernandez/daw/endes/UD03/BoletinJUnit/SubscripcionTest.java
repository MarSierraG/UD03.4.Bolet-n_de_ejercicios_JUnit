package ies.sotero.hernandez.daw.endes.UD03.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class SubscripcionTest{
    
	private Subscripcion s, s1;
	private OperadorAritmetico oA;
	
	private final int precio = 15;
	private final int periodo = 3;
	
	private final int precio1 = 19;
	private final int periodo1 = 3;
	
	@BeforeEach
    public void SubscripcionTest(){
        
		s = new Subscripcion(precio,periodo);	
		s1 = new Subscripcion(precio1,periodo1);
		
		oA = new OperadorAritmetico();
		
    }
	
	
	

	@Test
	public void precioPorMesTest() throws Exception {
		
		assertEquals(s.precioPorMes(), oA.division(precio,periodo));
		assertNotEquals(s1.precioPorMes(), oA.division(precio1,periodo1));
	
	}
	
	
	
	@Test
	public void cancelTest() {
		s1.cancel();
		
		assertEquals(s1.precioPorMes(),0);
	}
	
	
	
	
	
	
	//OPERADOR ARITMETICO
	
	@Test
	public void oaDivisionFalloTest() {
		
		try {
			oA.division(precio, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
	}
	
	
	@Test
	public void oaSumaTest() {
		
		int a = 1;
		int b = 2;
		
		int resultado = a + b;
		
		assertEquals(resultado,oA.suma(a, b));
		
		
	}
	

}

