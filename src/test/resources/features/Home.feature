Feature: Retail Home Page

  @test
  Scenario: Verify Retail Page Logo
    Given User is on retail website
    Then user verify retail page logo is present

  @verifyShopBar
  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @verifyDepartmentBar
  Scenario Outline: Verify department sidebar options
    Given User is on retail website
    When User click on All section
    And User on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department    | optionOne                      | optionTwo                |
      | 'Electronics' | TV & Video                     | Video Games              |
      | 'Computers'   | Accessories                    | Networking               |
      | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
      | 'Sports  '    | Athletic Clothing              | Exercise & Fitness       |
      | 'Automotive'  | Automative Parts & Accessories | MotorCycle & Powersports |

  @addItemToCart
  Scenario: Verify User can add an item to cart
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'raja@email.com' and password 'Raja1@123'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'Kasa Outdoor Smart Plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  @placeingOrderWithoutAdressAndPayment
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'raja@email.com' and password 'Raja1@123'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'Kasa Outdoor Smart Plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And user fill new address form with below information
      | country      | fullName      | phoneNumber | streetAddress | apt      | city      | state     | zipCode      |
      | countryValue | fullnameValue | phoneValue  | stAddress     | aptValue | cityValue | stateVlue | zipCodeValue |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 3322332233224456 | Raja       |              11 |           2024 |          123 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks’

  @placeingOrderWithAdressAndPayment
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'raja@email.com' and password 'Raja1@123'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks’
