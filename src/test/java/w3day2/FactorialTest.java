package w3day2;

import static org.junit.Assert.*;

import java.util.stream.IntStream;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FactorialTest {
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testHappyPath() {
		System.out.println("in FactorialTest");
		assertEquals(Factorial.factorial(0), 1); 
		assertEquals(Factorial.factorial(5), 120);
	}
	
	@Test
	public void testEdgeValues() {
		
		exception.expect(IllegalArgumentException.class);
		Factorial.factorial(-1);
		
//		assertEquals(Factorial.factorial(5), 120);
	}
	


}
