
Feature: The Guest can check out the products and make a payment
  Background: Shared steps for check out for a guest
    Scenario: The user can check out the products in his shopping cart and pay for them
      Given The guest user navigate to the shopping cart
      When The guest user agrees to the terms and conditions and click on the Check out button
      And The guest user add his details: First and Last name, Email, Company
      And The guest user select the country and state
      And The guest user add city and address details
      And The user adds Phone number and Fax
      And The user clicks on Continue
      And The user selects the shipping method and clicks on Continue
      And The user selects the payment method and clicks on Continue
      And The user add the payment method details
      And The guest user clicks on Confirm
      Then The order is confirmed and the user can navigate to order details