package PageTestsPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClassPackage.BaseClass;
import PageClassPackage.HomePage;
import PageClassPackage.SignInPage;

public class HomePageTest extends BaseClass {
	
	HomePage homepage;
	SignInPage signinpage;
		
	HomePageTest(){
		super();		
	}
	
	@BeforeMethod
	public void setup() {
		initiatlization();
		homepage = new HomePage();
	}
	
	@Test(priority = 1)
	public void HomePageTitleTest() {
		String title = homepage.ValidateHomePageTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test(priority = 2)
	public void validateFlagTest() {
		boolean flag = homepage.validataFlag();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void validateAmazonLogoTest() {
		boolean logo = homepage.validateAmazonLogo();
		Assert.assertTrue(logo);
	}
	
	@Test(priority = 4)
	public void validateCartTest() {
		boolean ca = homepage.validateCarticon();
		Assert.assertTrue(ca);
	}

	@Test(priority = 5)
	public void validateSignInTest() {
		signinpage = homepage.validateSignIn();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();;
	}
	
	
}
