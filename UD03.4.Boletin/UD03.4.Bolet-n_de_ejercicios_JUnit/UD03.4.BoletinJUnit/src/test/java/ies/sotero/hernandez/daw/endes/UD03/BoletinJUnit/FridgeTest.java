package ies.sotero.hernandez.daw.endes.UD03.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.sotero.hernandez.daw.endes.UD03.BoletinJUnit.Fridge;
import ies.sotero.hernandez.daw.endes.UD03.BoletinJUnit.NoSuchItemException;

class FridgeTest {
	
	private Fridge f;

	@BeforeEach
	void setUp() throws Exception {
		
		f = new Fridge();
		f.put("bacon");
	}

	@Test
	void testPut() {
		assertEquals(f.put("apple"),true);
	}

	@Test
	void testContains() {
		assertEquals(f.contains("bacon"),true);
	}

	@Test
	void testTake() throws NoSuchItemException {
		f.take("bacon");
		
		try {
			f.take("pizza");		
		}catch (NoSuchItemException ex){
		}
		
		
	}

}
