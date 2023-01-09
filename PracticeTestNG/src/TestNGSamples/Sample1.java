package TestNGSamples;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners({ListenersSample.class})
public class Sample1 {

	public static int sumMethod(int a, int b) {
		return (a + b);
	}
	
//	@BeforeClass
//	public static void beforeClassmethod() {
//	System.out.println("This will execute beforeClass called Sample1");
//	}
//	
//	@BeforeMethod
//	public void beforemethod1() {
//	System.out.println("This will execute BeforeMethod every Test method");
//	}
	

	@Parameters({"browser1"})
	@Test
	public void PositivescenarioTestsumMethod(String browser1) {
	int actual = Sample1.sumMethod(2, 3);
	int expected = 5;
	assertEquals(actual, expected);
	System.out.println("This is the Positve or Happy scenario Testscript, "+ "on browser "+ browser1 + ", the thread that is running is: "+
            Thread.currentThread().getId());
	}
	
	@Parameters({"browser2"})
	@Test
	public void NegativescenarioTestsumMethod1(String browser2) {
	int actual = Sample1.sumMethod(-2, -3);
	int expected = -5; // this scenario will fail
	assertEquals(actual, expected);
	System.out.println("This is the Negative or Un-Happy scenario Testscript, " + "on browser "+ browser2 + ", the thread that is running is: "+
            Thread.currentThread().getId());
	}
	
//	@AfterClass
//	public static void afterClassmethod() {
//	System.out.println("This will execute Afterclass called Sample1");
//	}
//	
//
//	@AfterMethod
//	public void Aftermethod1() {
//	System.out.println("This will execute AfterMethod every @Test");
//	}
	
}
