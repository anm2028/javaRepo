package w3day2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BmiServiceTest {
	
	BmiService bmiService = new BmiService(); 
	
	
	@Test
	public void testBmiService() {
		System.out.println("in BmiServiceTest");
		assertEquals(0.002122000905387053, bmiService.calculate(75, 188), 0.5);
		assertNotEquals(107, bmiService.calculate(75, 188), 0.5);
	}

}
