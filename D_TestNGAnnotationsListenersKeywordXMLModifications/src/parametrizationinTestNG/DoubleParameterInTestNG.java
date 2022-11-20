package parametrizationinTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DoubleParameterInTestNG {
    
	@Test
	@Parameters ( {"browser" , "buildover" })
	public void testcase1 (String name , String build) {
		
		System.out.println(name);
		
		System.out.println(build);
		
	}
	
	
	
	
	
		
		
	}
	

