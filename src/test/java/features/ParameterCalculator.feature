
@Calculator
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario outline
    Given I have two numbers <num1> and <num2>
    When I add those two numbers
    Then I should get the result as <result>

    Examples: 
      | num1 | num2 | result |
      |    1 |    2 |      3 |
      |    5 |    6 |     11 |
      |    5 |    4 |      9 |

  Scenario: this will give the output of array list example
    Given I have below numbers
      | 1 |
      | 3 |
      | 5 |
      | 6 |
      | 7 |
    When I add those numbers
    Then I should get the result as 22

  Scenario: this will add two coffee and one tea list example
    Given I want to buy below items
      | coffee1 |  | 30 |
      | Tea     |  | 20 |
    When I purchase them
    Then I should get the bill amount as 50

  Scenario: this will add list example
    Given I want to buy below items in given quantity
      | coffee1 |  | 2 |  | 30 |
      | Teade   |  | 1 |  | 20 |
      | burger  |  | 4 |  | 10 |
    Then I should get the bill amount as 120
