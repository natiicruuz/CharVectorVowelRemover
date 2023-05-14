package ejercicio1;

import org.junit.Test;
import org.junit.Assert;

public class CadenaTest {

	@Test
	public void test() {
		Cadena cadena1 = new Cadena();
		String resultado = cadena1.retornaCadenaSinLetraI("Este es mi primer ejercicio");
		Assert.assertEquals("Este es m prmer ejercco",resultado);
	}

}
