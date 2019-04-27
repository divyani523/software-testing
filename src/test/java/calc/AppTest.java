
package calc;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	private static App calc;
	
	@BeforeClass
	public static void setup(){
		calc = new App();
	}
	
	@Test
	public void testAdd() {
		
		assertEquals(5, calc.add(3,2));
	}
	
	@Test
	public void testSub() {
		assertEquals(1, calc.sub(3,2));
	}
	@Test
	public void testMul() {
		assertEquals(6, calc.mul(3,2));
	}
	@Test
	public void testDiv() {
		assertEquals(1, calc.div(2,2));
	}
}