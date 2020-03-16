package Test_Case;

import static org.junit.Assert.*;
import Main.Interest_Calculation;
import org.junit.Test;
class Interest_Calculation_Test {

	@Test
	public void testSimple_Interest() {
		Interest_Calculation object1=new Interest_Calculation();
		assertEquals(10500.00,object1.Simple_Interest(10000.00, 1,5.00),0);
	}

	@Test
	public void testCompound_Interest() {
		Interest_Calculation object2=new Interest_Calculation();
		assertEquals(10778.50,object2.Compound_Interest(10000.00,1,12,7.5),2);
	}

}
