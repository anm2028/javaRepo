package w3day2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibanacciTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		System.out.println("in FibanacciTest");
		assertEquals(0,Fibonacci.fibonacci(0)); 
		assertNotEquals(1,Fibonacci.fibonacci(0));
		assertEquals(1, Fibonacci.fibonacci(1)); 
		assertNotEquals(0, Fibonacci.fibonacci(1));
		
		assertEquals(144, Fibonacci.fibonacci(12));
		assertNotEquals(155,Fibonacci.fibonacci(5));
	}
	
}
