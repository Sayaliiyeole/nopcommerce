package stepDefinitions;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import pageObjects.CustomerPage;
import pageObjects.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public LoginPage lp;
	public CustomerPage cp ;
	
	public static String randomString() {
		
		String randomString = RandomStringUtils.randomAlphabetic(7);
		return randomString;
		
	}
	
	
}
