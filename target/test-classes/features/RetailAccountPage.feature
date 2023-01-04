Feature: Retail Account Page

Background:
Given User is on retail website
When User click on Sign in option
And User enter email 'raja@email.com' and password 'Raja1@123'
And User click on login button
And User should be logged in into Account

@profileUpdate
Scenario: Verify User can update Profile Information 
When User click on Account option 
And User update Name 'testB' and Phone '2022234433'
And User click on Update button 
Then user profile information should be updated

@passwordUpdate
Scenario: Verify User can Update password 
When User click on Account option 
And User enter below information 
|previousPassword|newPassword|confirmPassword|
|Raja@123|Raja1@123|Raja1@123              |
And User click on Change Password button 
Then a message should be displayed 'Password Updated Successfully'

@paymentUpdate
Scenario: Verify User can add a payment method 
When User click on Account option 
And User click on Add a payment method link
And User fill Debit or credit card information  
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|3322332233224456|Raja|11	|2024|123|
And User click on Add your card button 
Then a message should be displayed 'Payment Method added sucessfully'


@pyamentEdit
Scenario: Verify User can edit Debit or Credit card 
When User click on Account option 
And User select card with ending '4456'
And User click on Edit option of card section
And user edit information with below data 
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|3322332233224477|Raja|12	|2025|321|
And user click on Update Your Card button 
Then a message should be displayed 'Payment Method updated sucessfully'

@removePayment
Scenario: Verify User can remove Debit or Credit card 
When User click on Account option 
And User select card with ending '4477'
And User click on remove option of card section
Then payment details should be remove


@addAddress
Scenario: Verify User can add an Address 
When User click on Account option 
And User click on Add address option 
And user fill new address form with below information 
|country|fullName|phoneNumber|streetAddress|apt|city | state |zipCode|
|countryValue|fullnameValue|phoneValue|stAddress|aptValue|cityValue|stateVlue|zipCodeValue|
And User click Add Your Address button 
Then a message should be displayed 'Adress Added sucessfully'


@EditAddress
Scenario: Verify User can edit an Address added on account
When User click on Account option 
And User click on edit address option 
And user fill new address form with below information 
|country|fullName|phoneNumber|streetAddress|apt|city | state |zipCode|
|countryValue|fullnameValue|phoneValue|stAddress|aptValue|cityValue|stateVlue|zipCodeValue|
And User click update Your Address button 
Then a message should be displayed 'Adress Updated sucessfully'

@removeAddress
Scenario: Verify User can remove Address from Account 
When User click on Account option 
And User click on remove option of Address section
Then Address details should be removed















