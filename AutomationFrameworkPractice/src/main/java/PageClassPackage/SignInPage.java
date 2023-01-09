package PageClassPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClassPackage.BaseClass;

public class SignInPage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement user;
	
	@FindBy(xpath = "//*[@id=\"continue\"]")
	WebElement con; // continue button
	
	@FindBy(xpath = "//*[@id=\"createAccountSubmit\"]")
	WebElement createAcc;  //create account button
	
	@FindBy(xpath = "//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/div[3]/div/a/span")
	WebElement need;  //need help 
	
	//create constructor and call pagefactory
	public SignInPage() {
		
	PageFactory.initElements(driver, this);
	}
	
	public String validateSignInPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateContinue() {
		return con.isDisplayed();
	}
	
	public boolean validateCreateAccount() {
		return createAcc.isDisplayed();
	}
	
	public boolean validateNeedHelp() {
		return need.isDisplayed();
	}
	
	public SignInPage1 validateSignIn(String username) {
		user.sendKeys(username);
		con.click();
		return new SignInPage1();
	}
}
