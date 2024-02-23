package ies.sotero.hernandez.daw.endes.UD03.BoletinJUnit;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({BoaTest.class, FridgeTest.class, SubscripcionTest.class, PilaTest.class})
public class AllTests {

}
