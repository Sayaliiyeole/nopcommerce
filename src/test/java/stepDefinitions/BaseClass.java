package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.After;
import pageObjects.CustomerPage;
import pageObjects.LoginPage;

public class BaseClass {

	public static WebDriver driver;
	public LoginPage lp;
	public CustomerPage cp ;
    public static Properties prop;
	static By customeroption = By.xpath("//li[@class='nav-item']");

	
	public static String randomString() {
		
		String randomString = RandomStringUtils.randomAlphabetic(7);
		return randomString;
		
	}
	
	public  static void property() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\isaya\\eclipse-workspace\\FrameWork\\Test Data\\config.properties");
		 prop = new Properties();
		prop.load(fis);
	
	}
	
	public static void listOfoptions(String option) throws InterruptedException {

		List<WebElement> listofoptions = driver.findElements(customeroption);
		for (WebElement e : listofoptions) {

			if (e.getText().equalsIgnoreCase(option)) {
				System.out.println(e.getText());
				Thread.sleep(4000);
				e.click();
				break;
			}
		}
	}
	
	
}
