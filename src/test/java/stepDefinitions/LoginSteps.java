package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CustomerPage;
import pageObjects.LoginPage;

public class LoginSteps extends BaseClass {

	@Before
	public void beforeMethods() throws IOException {
		BaseClass.property();
	}
	
	@After
	public void closebrowser() {
		//driver.close();
	}

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {

		driver = new ChromeDriver();
		WebDriverManager.chromiumdriver().setup();
		lp = new LoginPage(driver);
		driver.manage().window().maximize();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@And("User Enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		lp.setUsername(email);
		lp.setPassword(password);
	}

	@And("Click on Login")
	public void click_on_login() {
		lp.clickLogin();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("User clicks on Log out link")
	public void user_clicks_on_log_out_link() throws InterruptedException {
		lp.clicklogout();
		Thread.sleep(3000);
	}

	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {

		Assert.assertEquals("Dashboard / nopCommerce administration", driver.getTitle());
	}

	@When("User click on customer Menu")
	public void user_click_on_customer_menu() throws InterruptedException {
		cp = new CustomerPage(driver);
		cp.clickOncustomerButton();
		Thread.sleep(1000);
	}

	@When("click on customer menu Item")
	public void click_on_customer_menu_item() throws InterruptedException {
      BaseClass.listOfoptions("Customers");
	
	}

	@When("click on add new button")
	public void click_on_add_new_button() {
		cp.clickOnAddNewCstm();

	}

	@Then("User can view add new customer page")
	public void user_can_view_add_new_customer_page() {

		Assert.assertEquals("Add a new customer / nopCommerce administration", driver.getTitle());
	}

	@When("User enter customer infor")
	public void user_enter_customer_infor() {
       cp.addCustomerDetails();
       cp.selectGender();
       cp.customerrole("Registered","Guests");
      
	}

	@When("click save button")
	public void click_save_button() {
		  cp.saveCustomer();
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {

	}

}
