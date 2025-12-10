@google @regression
Feature: Google Search Functionality

  @smoke @homepage
  Scenario: Open Google Homepage
    Given I open Google homepage
    Then I should see Google search page

  @smoke @ranajit @positive
  Scenario: Search on Google
    Given I open Google homepage
    When I search on Google for "Selenium WebDriver"
    Then I should see search results