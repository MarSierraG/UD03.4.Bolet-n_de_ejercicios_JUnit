package ies.sotero.hernandez.daw.endes.UD03.Subscripcion;

import static org.junit.jupiter.api.Assertions.*;

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
	public void calculaSubscripcion() throws Exception {
		
		assertEquals(s.precioPorMes(), oA.division(precio,periodo));
		assertNotEquals(s1.precioPorMes(), oA.division(precio1,periodo1));
	
	}
	
	
	//SUBSCRIPCION
	
	@Test
	public void cancelarSubscripcion() {
		
		
		s1.cancel();
		
		assertEquals(s1.precioPorMes(),0);
		
	}
	
	
	
	
	
	
	//OPERADOR ARITMETICO
	
	@Test
	public void divisionFalloOperadorAritmetico() {
		
		try {
			oA.division(precio, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
	}
	
	
	@Test
	public void sumaOperadorAritmetico() {
		
		int a = 1;
		int b = 2;
		
		int resultado = a + b;
		
		assertEquals(resultado,oA.suma(a, b));
		
		
	}
	

}

