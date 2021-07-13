Feature: Like a client of dafiti app I want to add some product to my cart to buy it

  @Add
  Scenario: add a product

    When he creates an account with the data
      | password | idType | name | lastName | bithDate   | gender    |
      | A123456B | CC     | pepe | pruebas  | 01/01/1985 | Masculino |
    And add the product "Gorra Gris Nike" to cart
    Then he can see the product "Gorra Gris Nike" in his cart

