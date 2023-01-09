package TestNGSamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationExample {

	@Test
	public void testCase4() {
		System.out.println("Normal test case 4");
	}
	
	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("\n Execute BeforeMethod1");
	}
	
	@AfterMethod
	public void afterMethod1() {
		System.out.println("\\n Execute AfterMethod1");
	}
	
	@Test
	public void testcase5() {
		System.out.println("Normal test case 5");
	}
	
	@Test
	public void testcase6() {
		System.out.println("NOrmal test case 6");
	}

	@BeforeSuite
		public void beforeSuite1() {
			System.out.println("\nExecute BeforeSuite1");
		}
		
	@AfterSuite
		public void afterSuite1() {
			System.out.println("\\n Execute AfterSuite1");
	}
	
	@BeforeClass
	public void beforeClass1() {
		System.out.println("\n Execute BeforeClass1");
	}
	
	@AfterClass
	public void afterClass1() {
		System.out.println("\\n Execute AfterClass1");
}
	
	
	
}
