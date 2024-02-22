package ies.sotero.hernandez.daw.endes.UD03.BoletinJUnit;

public class OperadorAritmetico {
	public static int suma(int a, int b) {
		return a + b;
	}
	public int division(int a, int b) throws Exception {
		if(b==0) {
			throw new Exception();
		}
		return a / b;
	}
}