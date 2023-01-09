package TestNGSamples;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersSample implements ITestListener {
	
	
	public void onTestFailure (ITestResult result) {
		System.out.println("The test case has been Failed");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("The test case has been Skipped");
	}
	
	public void onTestStart (ITestResult result) {
		System.out.println("The test case has been Restarted");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("The test case has been executed successfully");
	}
	
	
	
	
}
