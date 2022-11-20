package parallelExecutioninTestNG123;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecutionOfClasses4 {

	
	@Test
	public void testCase4 () {
		
		Reporter.log("TC4" , true);
		
		
		System.out.println("TC4 got executed");
	}
}
