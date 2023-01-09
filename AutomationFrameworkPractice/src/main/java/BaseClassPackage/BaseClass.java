package BaseClassPackage;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import UtilityPackage.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {      // this is a parent class

	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() {       // this is a constructor
		
//		Properties prop = new Properties();  // we can write this way to set an object for properties or as below
//		prop = new Properties();    // we can set an object for properties this way, since we have declared this in the class level and hence can be used anywhere 

		try {
			prop = new Properties();
			FileInputStream in = new FileInputStream("C:\\Users\\Home\\eclipse-workspace\\"
					+ "AutomationFrameworkPractice\\src\\main\\java\\ConfigPackage\\Config.properties");

			prop.load(in);     // to load config file

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initiatlization() {
		String browserName = prop.getProperty("browser");
		
		WebDriverManager.chromedriver().setup();
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Home\\eclipse-workspace\\"
					+ "AutomationFrameworkPractice\\Browsers\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Home\\eclipse-workspace\\"
					+ "AutomationFrameworkPractice\\Browsers\\gecko.exe");
			
			driver = new FirefoxDriver();
		}
	
 driver.manage().window().maximize();
 driver.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
 driver.manage().timeouts().implicitlyWait(Utils.IMPLICIT_WAIT, TimeUnit.SECONDS);
 driver.get(prop.getProperty("url"));
	
	}
}
