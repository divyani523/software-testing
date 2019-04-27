
package calc;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	private static App calc;
	
	@BeforeClass
	public static void setup() {
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
	/*@Test
	public void testMul() {
		assertEquals(6, calc.mul(3,2));
	 }
	@Test
	public void testDiv() {
		assertEquals(1, calc.div(2,2));
	}
	@Test
	public void testPresedence() {
		assertEquals(30, calc.add(calc.mul(5, 5), calc.div(10, 2)));
}
	public int remaind(int a, int b) {
		return a%b;
	}
       @Test
   	public void testfact() {
   		assertEquals(2, calc.fact(2));
          }
      public void testIntegrate() {
    	  assertEquals (4, calc.sub(calc.add(4, 4), calc.div(8, 2)));
      }*/
}

 
    