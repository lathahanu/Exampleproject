package PageTestsPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClassPackage.BaseClass;
import PageClassPackage.HomePage;
import PageClassPackage.LaunchingPage;
import PageClassPackage.SignInPage;
import PageClassPackage.SignInPage1;

public class SignInPage1Test extends BaseClass{
	
	HomePage homepage;
	SignInPage signinpage;
	SignInPage1 signinpage1;
	LaunchingPage launchingpage;
		
	public SignInPage1Test() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initiatlization();
		homepage = new HomePage();
		signinpage = new SignInPage();
		signinpage = homepage.validateSignIn();
		signinpage1 = signinpage.validateSignIn(prop.getProperty("username"));
	}

	@Test(priority = 1)
	public void validateSignInPage1TitleTest() {
		String title = signinpage1.validateSignInPage1Title();
		Assert.assertEquals(title, "Amazon Sign In");
	}
	
	@Test(priority = 2)
	public void validateSignInButtonTest() {
		boolean btn = signinpage1.validateSignInButton();
		Assert.assertTrue(btn);
	}
	
	@Test(priority = 3)
	public void validateForgotPasswordButtonTest() {
		boolean Fpass = signinpage1.validateForgotPassword();
		Assert.assertTrue(Fpass);
	}
	
	@Test(priority = 4)
	public void validateSignInPage3Test() {
		launchingpage = signinpage1.validateSingIn3(prop.getProperty("password"));
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
