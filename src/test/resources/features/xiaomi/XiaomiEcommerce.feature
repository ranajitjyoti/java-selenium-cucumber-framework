@xiaomi @ecommerce @regression
Feature: Xiaomi Ecommerce Functionality

  @smoke @homepage @Refactor
  Scenario: Open Xiaomi Homepage
    Given I open Xiaomi homepage
    Then I should see Xiaomi homepage
#
  @smoke @search @positive
  Scenario: Search for Product
    Given I open Xiaomi homepage
#    When I search on Xiaomi for "Redmi Note"
#    Then I should see product details
#
  @category @smartphones
  Scenario: Browse Smartphones Category
    Given I open Xiaomi homepage
#    When I click on smartphones category
#    Then I should see product details
#
  @category @laptops
  Scenario: Browse Laptops Category
    Given I open Xiaomi homepage
#    When I click on laptops category
#    Then I should see product details
#
#  @product @cart @positive
#  Scenario: Add Product to Cart
#    Given I open Xiaomi homepage
#    When I click on first product
#    Then I should see product details
#    And I should see add to cart button
#    When I add product to cart