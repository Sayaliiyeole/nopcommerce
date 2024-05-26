package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	  public WebDriver ldriver;
   
	  public LoginPage(WebDriver rdriver) {
		  
		  ldriver = rdriver;
		  PageFactory.initElements(rdriver, this);		  
	  }
	  
	  @FindBy(id = "Email")
	  WebElement username;
	  
	  @FindBy(id = "Password")
	  WebElement Password;
	  
	  @FindBy(xpath = "//button[text()='Log in']")
	  WebElement btnLogin;
	  
	  @FindBy(xpath = "//a[text()='Logout']")
	  WebElement btnLogout;
	  
	  public void setUsername(String uname) {
		  username.clear();
		  username.sendKeys(uname);		  
	  }
	  
	  public void setPassword(String pwd) {
		  Password.clear();
		  Password.sendKeys(pwd);		  
	  }
	  
	  public void clickLogin() {
		  btnLogin.click(); 
	  }
	  
	  public void clicklogout() {
		   btnLogout.click();
	  }
}

