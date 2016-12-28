Feature: Example of DataTable with Cucumber.
	This dataTable will be used as map and store a simple price list.

  Scenario: A price list can be represented as price per item
    Given the price list for a coffee shop
      | coffee | 1 |
      | donut  | 2 |
    When I order 1 "coffee"
    And I order 1 "donut"
    Then should I pay 3