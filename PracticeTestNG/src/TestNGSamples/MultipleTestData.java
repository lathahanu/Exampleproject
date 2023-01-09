package TestNGSamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleTestData {

	@DataProvider(name="testdata")
	public Object[][] dataproviderMethod(){
		return new Object[][] {{"john","xyz"},{"lili","abc"},{"jenny","dfg"}};
		
	}
		
	@Test(dataProvider="testdata")
	public void testMethodLogic(String username, String password) {
		System.out.println("The user is: "+ username  + " The password is: "+ password);
				
	}
	
	
}
