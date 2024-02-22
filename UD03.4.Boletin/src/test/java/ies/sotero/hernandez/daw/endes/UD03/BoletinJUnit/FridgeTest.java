package ies.sotero.hernandez.daw.endes.UD03.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ies.sotero.hernandez.daw.endes.UD03.BoletinJUnit.Fridge;
import ies.sotero.hernandez.daw.endes.UD03.BoletinJUnit.NoSuchItemException;

class FridgeTest {
    
    @ParameterizedTest
    @CsvSource({
        "apple, true",
        "orange, true",
        "banana, true",
        "grape, false"
    })
    void testPut(String item, boolean flag) {
        Fridge f = new Fridge();
        
        boolean actual = f.put(item);
        assertEquals(flag, actual);
    }
    
    @ParameterizedTest
    @CsvSource({
        "apple, true",
        "grape, false"
    })
    
    void testContains(String item, boolean flag) {
        Fridge f = new Fridge();
        
        f.put("apple");
        
        boolean actual = f.contains(item);
        assertEquals(flag, actual);
    }
    
    
    @ParameterizedTest
    @CsvSource({
        "apple, true",
        "orange, true",
        "banana, true",
        "grape, false"
    })
    
    
    void testTake(String item, boolean itemExists) {
        Fridge f = new Fridge();

        if (itemExists) {
            f.put(item);
        }
        
        try {
            f.take(item);
            assertTrue(itemExists);
        } catch (NoSuchItemException exception) {
            assertTrue(!itemExists);
            assertTrue(exception.getMessage().contains(item + " not found in the fridge"));
        }
    }
    
    
    
    
}



