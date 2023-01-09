package PageTestsPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClassPackage.BaseClass;
import PageClassPackage.HomePage;
import PageClassPackage.SignInPage;
import PageClassPackage.SignInPage1;

public class SignInPageTest extends BaseClass {

	HomePage homepage;
	SignInPage signinpage;
	SignInPage1 signinpage1;
	
	public SignInPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initiatlization();
		homepage = new HomePage();
		signinpage = new SignInPage();
		signinpage = homepage.validateSignIn();
	}

	@Test(priority = 1)
	public void signInPageTitleTest() {
		String title = signinpage.validateSignInPageTitle();
		Assert.assertEquals(title, "Amazon Sign In");
	}

	@Test(priority = 2)
	public void validateContinueTest() {
		boolean cont = signinpage.validateContinue();
		Assert.assertTrue(cont);
	}
	
	@Test(priority = 3)
	public void validateCreateAccountTest() {
		boolean ca = signinpage.validateCreateAccount();
		Assert.assertTrue(ca);
	}
	
	@Test(priority = 4)
	public void validateNeedHelpTest() {
		boolean nh = signinpage.validateNeedHelp();
		Assert.assertTrue(nh);
	}
	
	@Test(priority = 5)
	public void validateSignInPageTest2() {
		signinpage1 = signinpage.validateSignIn(prop.getProperty("username"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
