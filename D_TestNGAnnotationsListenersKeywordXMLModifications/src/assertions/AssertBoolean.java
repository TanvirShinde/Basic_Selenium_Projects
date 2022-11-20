package assertions;

import org.testng.annotations.Test;

import graphql.Assert;

public class AssertBoolean {

	@Test
	public void testcase2() {
		
		Assert.assertTrue((10>1));
	}
	
	@Test
	public void testcase3 () {
		
		Assert.assertTrue((10>15));
	}
	
	@Test
	public void testcase4 () {
		
		Assert.assertFalse(false);
		
		
	}
}
