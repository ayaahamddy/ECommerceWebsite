@smoke
Feature: Add To Cart
  Background: Shared steps for add to cart
    Scenario: The user login in with his accout ands product to the shopping cart
      Given user log in and  selects a product from his list
      And choose it's color and size and customer phase
      And Add it to the cart
      And update the quantity of the product in the cart
      Then product is ready to check out.