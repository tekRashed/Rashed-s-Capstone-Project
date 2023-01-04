package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities​​​​​​​.CommonUtility;
import tek.sdet.framework.utilities​​​​​​​.DataGenerator;

public class RetailAccountSteps  extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().account);
		logger.info("User clicked on Account option");
 
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
	 clearTextUsingSendKeys(factory.accountPage().nameInput);
	 sendText(factory.accountPage().nameInput,nameValue);
	 clearTextUsingSendKeys(factory.accountPage().personalPhoneInput);
	 sendText(factory.accountPage().personalPhoneInput,phoneValue);
	 logger.info("user updated name and phone");
	 
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateButton);
		logger.info("user clicked on update button");
	}
	
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInformationUpdatedMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInformationUpdatedMessage));
		logger.info("user profile information is updated");
		
	    
	}
	@When("User enter below information")
	public void userEnterBelowInformation(DataTable dateTable) {
	
	List<Map<String, String>>passwordInformation = dateTable.asMaps(String.class, String.class);
	sendText(factory.accountPage().previousPasswordInput,passwordInformation.get(0).get("previousPassword"));
	sendText(factory.accountPage().newPasswordInput,passwordInformation.get(0).get("newPassword"));
	sendText(factory.accountPage().confirmPasswordInput,passwordInformation.get(0).get("confirmPassword"));
	logger.info("user entered password information");

	}
	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
	click(factory.accountPage().changePasswordButton);
	logger.info("user clicked on change password buuton");

	}
	@When("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage) {
		if(expectedMessage.contains("Password")) {
		waitTillPresence(factory.accountPage().passwordUpdatedSucessfullyMessage);
		Assert.assertEquals(expectedMessage, factory.accountPage().passwordUpdatedSucessfullyMessage.getText());
		logger.info(expectedMessage + "is displayed");
		}else if (expectedMessage.contains("Payment Method added")) {
			
			waitTillPresence(factory.accountPage().paymentMethodAddedSuccessfullyMessage);
			Assert.assertEquals(expectedMessage, factory.accountPage().paymentMethodAddedSuccessfullyMessage.getText());
			logger.info(expectedMessage + "is displayed");
		}else if(expectedMessage.contains("Payment Method updated")) {
			
			waitTillPresence(factory.accountPage().paymentMethodUpdatedSuccessfullMessage);
			Assert.assertEquals(expectedMessage, factory.accountPage().paymentMethodUpdatedSuccessfullMessage.getText());
			logger.info(expectedMessage + "is displayed");
		}else if(expectedMessage.contains("Payment Method updated")) {
			
			waitTillPresence(factory.accountPage().addressAddedSuccessfullyMessage);
			Assert.assertEquals(expectedMessage, factory.accountPage().addressAddedSuccessfullyMessage.getText());
			logger.info(expectedMessage + "is displayed");
		}else if(expectedMessage.contains("Payment Method updated")) {
			
			waitTillPresence(factory.homePage().orderplacedMessage);
			Assert.assertEquals(expectedMessage, factory.homePage().orderplacedMessage.getText());
			logger.info(expectedMessage + "is displayed");
		}
	}
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	    click(factory.accountPage().addPaymentMethodLink);
	    logger.info("user clicked on add a payment method link");
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
	   List<Map<String, String>>paymentInformation = dataTable.asMaps(String.class, String.class);
	   sendText(factory.accountPage().cardNumberInput, paymentInformation.get(0).get("cardNumber"));
	   sendText(factory.accountPage().nameOnCradInput, paymentInformation.get(0).get("nameOnCard"));
	   selectByVisibleText(factory.accountPage().expirationYearInput, paymentInformation.get(0).get("expirationYear"));
	   selectByVisibleText(factory.accountPage().expirationMonthInput, paymentInformation.get(0).get("expirationMonth"));
	   sendText(factory.accountPage().securityCodeInput, paymentInformation.get(0).get("securityCode"));
	   logger.info("user entered required card information");
	   	   
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
	    click(factory.accountPage().addYourCardButton);
	    logger.info("User clicked on Add your card button");
	}

	@When("User select card with ending {string}")
	public void userSelectCardWithEnding(String cardEndingNumber) {
		
		List<WebElement> cards = factory.accountPage().cardEndingNumber;
		for(WebElement card: cards) {
			if(card.getText().equals(cardEndingNumber))
				System.out.println(card.getText()+ "==========================");
				click(card);
				logger.info(cardEndingNumber + "is selected");
				break;
		}
		

	    
	}
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOf() {
	 click(factory.accountPage().cardEditButton);
	 logger.info("user clicked on edit option");
	 
	}
	
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>>paymentInformation = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
		sendText(factory.accountPage().cardNumberInput, paymentInformation.get(0).get("cardNumber"));
		   clearTextUsingSendKeys(factory.accountPage().nameOnCradInput);
		   sendText(factory.accountPage().nameOnCradInput, paymentInformation.get(0).get("nameOnCard"));
		   selectByVisibleText(factory.accountPage().expirationYearInput, paymentInformation.get(0).get("expirationYear"));
		   selectByVisibleText(factory.accountPage().expirationMonthInput, paymentInformation.get(0).get("expirationMonth"));
		   clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
		   sendText(factory.accountPage().securityCodeInput, paymentInformation.get(0).get("securityCode"));
		   logger.info("user entered required card information");
	    
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourCardButton);
		logger.info("user clicked on Update Your Card button");

	}
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().removCardLink);
		logger.info("user clicked on remove card option");
	   
	}
	@Then("payment details should be remove")
	public void paymentDetailsShouldBeRemove() {
		try {
		Assert.assertFalse(isElementDisplayed(factory.accountPage().cardPresent));
		logger.info("payment details should be removed");
		}catch(AssertionError e) {
			logger.info(e.getMessage());
		}
		
	}
		@When("User click on Add address option")
		public void userClickOnAddAddressOption() {
		  click(factory.accountPage().addAddressButton);
		  logger.info("user clicked on address option");
		}
		@When("user fill new address form with below information")
		public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
			List<Map<String, String>>addressInformation = dataTable.asMaps(String.class, String.class);
			selectByVisibleText(factory.accountPage().countryDropdown, DataGenerator.addressGenerator(addressInformation.get(0).get("country")));
			sendText(factory.accountPage().addressFullNameInput, DataGenerator.addressGenerator(addressInformation.get(0).get("fullName")));
			sendText(factory.accountPage().addressPhoneNumberInput, DataGenerator.addressGenerator(addressInformation.get(0).get("phoneNumber")));
			sendText(factory.accountPage().addressInput, DataGenerator.addressGenerator(addressInformation.get(0).get("streetAddress")));
			sendText(factory.accountPage().apartmentInput, DataGenerator.addressGenerator(addressInformation.get(0).get("apt")));
			sendText(factory.accountPage().cityInput, DataGenerator.addressGenerator(addressInformation.get(0).get("city")));
			sendText(factory.accountPage().stateInput, DataGenerator.addressGenerator(addressInformation.get(0).get("state")));
			sendText(factory.accountPage().zipCodeInput, DataGenerator.addressGenerator(addressInformation.get(0).get("zipCode")));

			logger.info("user filled the address form");
		}
		@When("User click Add Your Address button")
		public void userClickAddYourAddressButton() {
			click(factory.accountPage().addYourAddress);
		    
		}
		
		@When("User click on edit address option")
		public void userClickOnEditAddressOption() {
			click(factory.accountPage().addressEditBtn);
			 logger.info("user clicked on edit option");
		}
		@When("User click update Your Address button")
		public void userClickUpdateYourAddressButton() {
			click(factory.accountPage().updateYourAddressBtn);
			logger.info("user clicked on Update Your Address button");
		}

		@When("User click on remove option of Address section")
		public void userClickOnRemoveOptionOfAddressSection() {
			click(factory.accountPage().addressRemoveBtn);
			logger.info("user clicked on remove address option");
			
		}
		@Then("Address details should be removed")
		public void addressDetailsShouldBeRemoved() {
			try {
				Assert.assertFalse(isElementDisplayed(factory.accountPage().addressPresent));
				logger.info("address details should be removed");
				}catch(AssertionError e) {
					logger.info(e.getMessage());
		}
		}



	
}


	


