package ies.sotero.hernandez.daw.endes.UD03.BoletinJUnit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AccountTest {

    private Account a, a1;

    @BeforeEach
    public void setUp() {
        a = new Account("Pepe", 123456789, 1000.0f);
        a1 = new Account("Maria",123456, 400000.00f);
    }
    
    @Test
    public void testDeposit(){
    	assertEquals(true,a.deposit(1000.0f));
    	assertEquals(false,a.deposit(-1));
    }
    
    @Test
    void testWithdrawValid() {
        
        assertTrue(a.deposit(50.0f));
        assertEquals(1050.0f, a.getBalance(), 0.01);

        
        assertFalse(a.deposit(-50.0f));
        assertEquals(1050.0f, a.getBalance(), 0.01);

        
        assertTrue(a.withdraw(50.0f, 5.0f));
        assertEquals(995.0f, a.getBalance(), 0.01);

        
    }
    
    @Test
    void testAddInterest() {
        
    	a.addInterest();
        assertEquals(1045.0f, a.getBalance(), 0.01);
        
        
    }
    
    @Test
    public void testToString() {
        assertEquals("123456789\tPepe\t1.000,00 €", a.toString());
    }
    
    @Test
    void testWithdrawWithBadMoney() {
        
        boolean result = a1.withdraw(0.05f, 0.10f);

        assertTrue(result);

        assertEquals(399999.85f, a1.getBalance(), 0.01);
    }
    
    
    
  
    
    

}
