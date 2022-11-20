package groupofTestCaseExecute;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingOfTestCases {
	
    @Test (groups = "Regression")
	public void testCase1 () {
		
		Reporter.log("TC1 Got Executed" , true);
	}
    
    @Test (groups = "Sanity")
   	public void testCase2 () {
   		
   		Reporter.log("TC2 Got Executed" , true);		
   	}
         @Test (groups = "Regression")
       public void extraMethod () {
        	
        	Reporter.log("Extra method got executed from Grouping of test Cases" , true);
        }
       
    @Test (groups = "Regression")
   	public void testCase3 () {
   		
   		Reporter.log("TC3 Got Executed" , true);
   	}
       
    @Test (groups = "Sanity")
   	public void testCase4 () {
   		
   		Reporter.log("TC4 Got Executed" , true);
   		
   		
   	}
       
    @Test (groups = {"Regression" ,"Sanity" })
   	public void testCase5 () {
   		
   		Reporter.log("TC5 Got Executed" , true);
   	}
       
	
}
