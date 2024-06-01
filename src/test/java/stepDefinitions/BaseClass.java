package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import pageObjects.CustomerPage;
import pageObjects.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public LoginPage lp;
	public CustomerPage cp ;
    public static Properties prop;
	
	public static String randomString() {
		
		String randomString = RandomStringUtils.randomAlphabetic(7);
		return randomString;
		
	}
	
	public  static void property() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\isaya\\eclipse-workspace\\FrameWork\\Test Data\\config.properties");
		 prop = new Properties();
		prop.load(fis);
	
	}
	
	
	
}
