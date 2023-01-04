package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities​​​​​​​.CommonUtility;

public class RetailOrdersSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
	    click(factory.homePage().ordersOption);
	    logger.info("user clicked on order section");
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.ordersPage().firstOrderItem);
		logger.info("user clicked on first order");
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.ordersPage().cancelButton);
		logger.info("user clicked on cancel button");
	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReasonBoughtWrongItem(String reason)  {
		selectByVisibleText(factory.ordersPage().cancelationReasonDropDown, reason);
		logger.info("user selected the cancelation reason"+ reason);
		
		
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.ordersPage().cancelOrderButton);
		logger.info("user clicked on cancel order button");
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String expectedMessage) {
		if(expectedMessage.contains("Your Order Has Been Cancelled")) {
		Assert.assertEquals(expectedMessage, factory.ordersPage().YourOrderHasBeenCancelledMessage.getText());
		logger.info("a cancelation message displayed" + expectedMessage);
		}else if(expectedMessage.contains("Return was successfull")) {
			Assert.assertEquals(expectedMessage, factory.ordersPage().returnWasSuccessfullyMessage.getText());
			logger.info("a cancelation message displayed" + expectedMessage);
		}
		
	}
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.ordersPage().returnItemButton);
		logger.info("user clicked on return item button");
	    
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String reason) {
		selectByVisibleText(factory.ordersPage().cancelationReasonDropDown, reason);
		logger.info("user selected the cancelation reason"+ reason);
	   
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String dropOffLocation) {
		selectByVisibleText(factory.ordersPage().dropOffDropDown, dropOffLocation);
		logger.info("User selected the drop off service"+ dropOffLocation);
	   
	    
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	    click(factory.ordersPage().cancelOrderButton);
	    logger.info("User clicked on Return Order button");
	}
	
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	    click(factory.ordersPage().reviewButton);
	    logger.info("User clicked on Review button");
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String body) {
		sendText(factory.ordersPage().reviewHeadlineInput, headline);
		sendText(factory.ordersPage().reviewDescriptionInput, body);
		logger.info("user wrote review on product");
		
	    
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.ordersPage().reviewSubmitButton);
		logger.info("User clicked Add your Review button");
	    
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String expected) {
		waitTillPresence(factory.ordersPage().yourReviewWasAddedSuccessfullyMessage);
	 Assert.assertEquals(factory.ordersPage().yourReviewWasAddedSuccessfullyMessage.getText(), expected);
	 logger.info("a review message displayed");
		
	}








}
