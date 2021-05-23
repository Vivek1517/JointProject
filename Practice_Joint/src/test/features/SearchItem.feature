@smoke
Feature: Automation Practice Search feature

  Background:
    Given I am on the homepage

  #happypath
  @regression2
  Scenario Outline: Verify I can search for items
    When I enter an item in search box as <product>
    And I select search button
    Then I should navigate to dress page
    Examples:
      | product  |
      | dress    |
