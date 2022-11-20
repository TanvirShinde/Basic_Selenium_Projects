package listenerinTestNG123;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import scrrenshotCode.ScreenShot;

public class TestNGListeners extends TestNGPratice implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Starting of Test Case : " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(" Test Cases Passed : " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
		System.out.println(" Test Case  failed : " + result.getName());
		
		try {
			listenerinTestNG123.ScreenShot.capturescreenshot("Tanvir");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println(" Test Case Skipped: " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println(" Starting of the process: " + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println(" Finishing of the process: " + context.getName());
	}

	

	
}
