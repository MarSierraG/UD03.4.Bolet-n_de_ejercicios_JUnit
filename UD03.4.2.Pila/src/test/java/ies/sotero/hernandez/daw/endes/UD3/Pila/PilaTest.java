package ies.sotero.hernandez.daw.endes.UD3.Pila;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PilaTest {
	
	private Pila p;
	

	@BeforeEach
	public void pila() {
		p = new Pila();
	}

	@Test
	public void añadir() {
		p.push(1);
		p.push(3);
	}
	
	
	@Test
	public void ultNum() {
		assertEquals(p.pop(),null);	
		
		p.push(3);
		int n = p.pop();
		
		assertEquals(n,3);
		
	}
	
	
	@Test
	public void estaVacia(){
		assertEquals(p.isEmpty(),true);
	}
	
	
	@Test
	public void priNum() {
		assertEquals(p.top(),null);	
		
		p.push(3);
		int n = p.top();
		
		assertEquals(n,3);
		
	}
	
	
	
}