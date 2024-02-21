package ies.sotero.hernandez.daw.endes.U3.E4.Boa;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */

public class BoaTest {
	
	private Boa bA,bB;
	
	@BeforeEach
	public void boa(){
		bA = new Boa("a", 1,"granola bars");
		bB = new Boa("b", 3, "Pizza");
	}
	
	@Test 
	public void isHealthy(){
		assertEquals(bA.isHealthy(),true);
	}
	
	@Test 
	public void fitsInCage(){
		assertEquals(bA.fitsInCage(1),false);
		assertEquals(bA.fitsInCage(2),true);
		
	}
	
}
