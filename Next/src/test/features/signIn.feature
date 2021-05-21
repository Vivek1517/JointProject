Feature: Next signIn feature
  As a user
  I want to login successfully
  So that I can access my account

  Background:
    Given I am on the homepage
    When I select myAccount link
    Then I should be on the SignIn Page

  @regression1
  # Happy Path scenarios:
  Scenario: Verify User can login with valid credentials
    When I provide email as kranthi_kavilas@yahoo.co.in and password as Testing123
    And I select signIn button
    Then I Should be loggedIn successfully
    And I should go to my account page

