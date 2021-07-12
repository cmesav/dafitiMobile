
Feature: Like a client I want to add some product to my cart to buy it

  @Add
  Scenario: add a product

    Given the client is in the app
    When add a product to cart
    And he creates an account
    Then he can see the product in his cart