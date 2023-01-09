package PageClassPackage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClassPackage.BaseClass;

public class HomePage extends BaseClass{
//locate webelements of what we are testing
	@FindBy(xpath="//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")
	WebElement flag;
	
	@FindBy(xpath="//*[@id=\"nav-logo-sprites\"]")
	WebElement logo;
	
	@FindBy(xpath="//*[@id=\"nav-cart-count-container\"]/span[2]")
	WebElement icon;
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	WebElement signIn;
	
	// launch all the Web elements to the driver
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validataFlag() {
		return flag.isDisplayed();
	}
	
	public boolean validateAmazonLogo() {
		return logo.isDisplayed();
	}
	
	public boolean validateCarticon() {
		return icon.isDisplayed();
	}
	
	public SignInPage validateSignIn() {
		signIn.click();
		return new SignInPage();
	}
}
