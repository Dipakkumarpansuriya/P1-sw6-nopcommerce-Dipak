Feature: Computer Page Test
  As a user I want to build my own computer & add to cart

  Scenario: verify Product Arrange In AlphaBatical Order
    Given   I am on computerpage
    When    I click on Computers and Desktops
    Then    I click on sort computer and desktop "6"

