
  @regression
  Feature: Shopping cart
  As a user I want to build my own computer & add to cart
  Scenario:
    Given  I am on homepage
    When   I click on Computer Menu.
    When   I click desktop
    And    I select "Name: A to Z"
    And    I click on "Add To Cart"
    And    I  Verify the Text "Build your own computer"
    And    I Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select
    And    I Select "8GB [+$60.00]" using Select class.
    And    I Select HDD radio "400 GB [+$100.00]"
    And    I Select OS radio "Vista Premium [+$60.00]"
    And    I check Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
    And    I Verify the price "$1,475.00"
    And    I Click on "ADD TO CARD" Button
    And    I verify Verify the Message "The product has been added to your shopping cart" on Topgreen Bar
    And    I MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    And    I Verify the message "Shopping cart"
    And    I Change the Qty to "2" and Click on "Update shopping cart"
    And    I Verify the Total"$2,950.00"
    And    I click on checkbox “I agree with the terms of service”
    And    I Click on “CHECKOUT”
    And    I Verify the Text “Welcome, Please Sign In!”
    And    I 1Click on “CHECKOUT AS GUEST” Tab
    And    I Fill the all mandatory field
    And    I Click on “CONTINUE”
    And    I   Click on Radio Button “Next Day Air($0.00)”
    And    I Click on “CONTINUE”
    And    I select Radio Button “Credit Card”
    And    I Select “Master card” From Select credit card dropdown
    And    I  Fill all the details
    And    I click Click on “CONTINUE”
    And    I Verify “Payment Method” is “Credit Card”
    And    I Verify “Shipping Method” is “Next Day Air”
    And    I Verify Total is “$2,950.00”
    And    I  Click on “CONFIRM”
    And    I Verify the Text “Thank You”
    And    I Verify the message “Your order has been successfully processed!”
    And    I Click on “CONTINUE”
    And    I Verify the text “Welcome to our store”
    Then  I verifyProductAddedToShoppingCartSuccessFully





