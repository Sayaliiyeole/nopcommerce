package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {

	public WebDriver ldriver;

	public CustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "(//a[@class='nav-link'])[21]")
	WebElement customerbtn;

	By customeroption = By.xpath("//li[@class='nav-item']");

	@FindBy(id = "Email")
	WebElement emailid;

	@FindBy(id = "Password")
	WebElement psw;

	@FindBy(id = "FirstName")
	WebElement fname;

	@FindBy(id = "LastName")
	WebElement lname;

	@FindBy(id = "Gender_Female")
	WebElement Fgender;

	@FindBy(id = "Gender_Male")
	WebElement Mgender;

	@FindBy(id = "DateOfBirth")
	WebElement date;

	@FindBy(id = "Company")
	WebElement company;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement addnewcustomer;

	public void clickOncustomerButton() {
		customerbtn.click();
	}

	public void cutomerList(String option) throws InterruptedException {

		List<WebElement> cutomeroptions = ldriver.findElements(customeroption);
		for (WebElement e : cutomeroptions) {

			if (e.getText().equalsIgnoreCase(option)) {
				System.out.println(e.getText());
				Thread.sleep(4000);
				e.click();
				break;
			}
		}
	}

	public void clickOnAddNewCstm() {
		addnewcustomer.click();

	}

}
