package testNGDomaci;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalc {
	
	@Test
	public void testKrug() {
		
		double povKruga = Calc3.pKruga(2);
		
		Assert.assertEquals(povKruga, 12.56);
	}
	
	@Test
	public void testKvadrat() {
		
		double povKvadrata = Calc3.pKvadrata(5);
		
		Assert.assertEquals(povKvadrata, 25.0);
	}
	
	@Test
	public void testPravougaonik() {
		
		double povPravougaonika = Calc3.pPravougaonika(4, 5);
		
		Assert.assertEquals(povPravougaonika, 20.0);
	}
	
	

}
