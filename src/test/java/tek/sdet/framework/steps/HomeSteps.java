package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities​​​​​​​.CommonUtility;

public class HomeSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@Given ("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle +" is equal to "+ expectedTitle);
		

		
		}
	
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().AllElements);
		logger.info("User clicked on All Section");
		
}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		
		List<Map<String, String>>shopByDeparmentOptions = dataTable.asMaps(String.class, String.class);
		Assert.assertTrue(isElementDisplayed(factory.homePage().AllElements));
		Assert.assertTrue(isElementDisplayed(factory.homePage().electronicsElement));
		Assert.assertTrue(isElementDisplayed(factory.homePage().coputersElement));
		Assert.assertTrue(isElementDisplayed(factory.homePage().smartHomeElement));
		Assert.assertTrue(isElementDisplayed(factory.homePage().sportsElement));
		Assert.assertTrue(isElementDisplayed(factory.homePage().automativeElement));
		logger.info("below options are present in Shop by Department sidebar");

		
	}
	
	@When("User on {string}")
	public void userOnElectronics(String department) {
		List<WebElement> dept = factory.homePage().sideBar;
		for(WebElement element: dept) {
			if(element.getText().equals(department)) {
				element.click();
				break;
				
			}
		
			
		}
		
	    
	}
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> departmentOptions = dataTable.asLists(String.class);
		List<WebElement> dept = factory.homePage().sideBar;
		for(int i=0; i<departmentOptions.get(0).size();i++){
			for(WebElement element: dept) {
				if(element.getText().equals(departmentOptions.get(0).get(i))) {
					Assert.assertTrue(element.isDisplayed());
					logger.info(element.getText() + "is present");
					
				}}}}
	
				
				@When("User change the category to {string}")
				public void userChangeTheCategoryTo(String value) {
				    selectByVisibleText(factory.homePage().allDepartment,value);
				    logger.info(value +"was Selected from dromdown");
				}
				@When("User search for an item {string}")
				public void userSearchForAnItem(String value) {
					sendText(factory.homePage().seachInputField, value);
					logger.info("user entered"+ value);
				

				    
				}
				@When("User click on Search icon")
				public void userClickOnSearchIcon() {
					click(factory.homePage().searchButton);
					logger.info("user clicked on search button");
				   
				}
//				@When("User click on item")
//				public void userClickOnItem() {
//					waitTillPresence(factory.homePage().kasaOutDoorPlugItem);
//					click(factory.homePage().kasaOutDoorPlugItem);
//					logger.info("user clicked on item");
				//}
				@When("User select quantity {string}")
				public void userSelectQuantity(String qty) {
					selectByVisibleText(factory.homePage().quantitySelection,qty);
					logger.info("user seleceted quantity" + qty);
					}
				@When("User click add to Cart button")
				public void userclickAddToCartButton() {
					click(factory.homePage().addToCartButton);
					logger.info("user clicked add to cart button");
				    
				}
				@Then("the cart icon quantity should change to {string}")
				public void theCartIconQuantityShouldChangeTo(String expectedQuantity) {
					Assert.assertEquals(expectedQuantity, factory.homePage().cartQuantity.getText());
					logger.info("the cart icon quantity change to"+ expectedQuantity);
					
					
				   
				}
				@Then("User click on Cart option")
				public void userClickOnCartOption() {
				  click(factory.homePage().carticon);
				  logger.info("user clicked on cart button");
				}
				@Then("User click on Proceed to Checkout button")
				public void userClickOnProceedToCheckoutButton() {
				    click(factory.homePage().procceedToCheckout);
				    logger.info("user clicked on procceed to check out button");
				}
				@Then("User click Add a new address link for shipping address")
				public void userClickAddANewAddressLinkForShippingAddress() {
				click(factory.homePage().addAddressBtnCheckout);
				logger.info("user clicked add a new address link for shipping address");
				}
				@Then("User click Add a credit card or Debit Card for Payment method")
				public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
					click(factory.homePage().addPaymentBtnCheckout1);
					logger.info("user clicked on add a credi or debit card for payment method");
		
				}
				@Then("User click on Place Your Order")
				public void userClickOnPlaceYourOrder() {
				    click(factory.homePage().placeOrderBtnCheckout);
				    logger.info("user clicked on place your order button");
				    
				}
				@Then("a message should be displayed 'Order Placed, Thanks’")
				public void aMessageShouldBeDisplayedOrderPlacedThanks() {
				}
				@When("User click on item")
				public void productNameItem() {
					waitTillPresence(factory.homePage().productNameItem);
					click(factory.homePage().productNameItem);
					logger.info("user clicked on item");
				}
				    
				}
