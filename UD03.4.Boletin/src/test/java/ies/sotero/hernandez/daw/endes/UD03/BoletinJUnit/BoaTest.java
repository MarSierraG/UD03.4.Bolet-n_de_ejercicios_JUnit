package ies.sotero.hernandez.daw.endes.UD03.BoletinJUnit;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BoaTest {

    @ParameterizedTest
    @CsvSource({
        "healthy, 4, granola bars, true",
        "unhealthy, 4, not granola bars, false",
        "healthy, 8, granola bars, true"
    })
    void testIsHealthy(String name, int length, String favoriteFood, boolean healthy) {
        Boa b = new Boa(name, length, favoriteFood);
        assertEquals(healthy, b.isHealthy());
    }

    @ParameterizedTest
    @CsvSource({
        "4, 5, true",
        "4, 3, false",
        "8, 10, true"
    })
    void testFitsInCage(int boaLength, int cageLength, boolean healthy) {
        Boa b = new Boa("anyName", boaLength, "anyFood");
        assertEquals(healthy, b.fitsInCage(cageLength));
    }
}

