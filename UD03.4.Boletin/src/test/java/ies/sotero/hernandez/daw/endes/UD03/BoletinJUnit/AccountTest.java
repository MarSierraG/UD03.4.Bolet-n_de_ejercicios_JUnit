package ies.sotero.hernandez.daw.endes.UD03.BoletinJUnit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AccountTest {

    private Account a;

    @BeforeEach
    public void setUp() {
        a = new Account("John Doe", 123456789, 1000.0f);
    }
    
    @Test
    public void testDeposit(){
    	assertEquals(true,a.deposit(1000.0f));
    	assertEquals(false,a.deposit(-1));
    }
    
    @Test
    void testWithdrawValid() {
        
        assertTrue(a.withdraw(200.0f, 10.0f));
        
        assertEquals(790.0f, a.getBalance(), 0.001f);
        
        assertFalse(a.withdraw(-200.0f, 10.0f));
        
        assertEquals(1000.0f, a.getBalance(), 0.001f);
        
        assertFalse(a.withdraw(200.0f, -10.0f));
        
        assertEquals(1000.0f, a.getBalance(), 0.001f);
        
        assertFalse(a.withdraw(1500.0f, 10.0f));
        
        assertEquals(1000.0f, a.getBalance(), 0.001f);
        
    }
    
    @Test
    void testAddInterest() {
        
        a.addInterest();
        
        
    }
    
    
  
    
    

}
