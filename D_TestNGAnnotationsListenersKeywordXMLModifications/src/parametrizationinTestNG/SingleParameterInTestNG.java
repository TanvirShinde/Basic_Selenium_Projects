package parametrizationinTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SingleParameterInTestNG {
    
	@Test
	@Parameters ("browser")
	public void testcase1 (String name) {
		
		System.out.println(name);
		
		if (name.equalsIgnoreCase("Chrome")) {
			
			System.out.println("Chrome browser specific test case");
		}
		
		else if (name.equalsIgnoreCase("Firefox")) {
			
			System.out.println("FireFox browser specific test case");
		}
		
	}
	
	
	
	
	
		
		
	}
	

