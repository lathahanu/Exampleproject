package PageClassPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClassPackage.BaseClass;

public class SignInPage1 extends BaseClass{
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement pass;
	
	@FindBy(xpath="//*[@id=\"auth-fpp-link-bottom\"]")
	WebElement Fpassword;
	
	@FindBy(xpath="//*[@id=\"signInSubmit\"]")
	WebElement sign;
	
	public SignInPage1() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateSignInPage1Title() {
		return driver.getTitle();
	}
	
	public boolean validateForgotPassword() {
		return Fpassword.isDisplayed();
	}
	
	public boolean validateSignInButton() {
		return sign.isDisplayed();
	}
	
	public LaunchingPage validateSingIn3(String password) {
		pass.sendKeys(password);
		sign.click();
		return new LaunchingPage();
	}

}
