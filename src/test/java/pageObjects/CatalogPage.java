package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage {

	WebDriver driver;

	public CatalogPage(WebDriver driver) {
		
		driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath ="(//a[@class='nav-link'])[4]")
	WebElement catalogview;

	
	
}
