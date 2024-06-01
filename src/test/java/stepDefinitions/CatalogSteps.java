package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.CatalogPage;

public class CatalogSteps extends BaseClass {
  
	CatalogPage catalogPage = new CatalogPage(driver);
	
	@When("User Click on Catalog menu")
	public void user_click_on_catalog_menu() throws InterruptedException {
		catalogPage.catalogButton();
		BaseClass.listOfoptions("Products");
	}
	@When("User click on product from catalog list")
	public void user_click_on_product_from_catalog_list() {
	 
	}
	@When("User check the available products")
	public void user_check_the_available_products() {
	 
	}



}
