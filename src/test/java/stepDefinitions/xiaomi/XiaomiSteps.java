package stepDefinitions.xiaomi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.xiaomi.XiaomiHomePage;
import pages.xiaomi.XiaomiProductPage;
import utils.DriverManager;

public class XiaomiSteps {
    private XiaomiHomePage xiaomiHomePage;
    private XiaomiProductPage xiaomiProductPage;

    @Given("I open Xiaomi homepage")
    public void i_open_xiaomi_homepage() {
        DriverManager.setDriver("chrome");
        xiaomiHomePage = new XiaomiHomePage(DriverManager.getDriver());
        xiaomiHomePage.navigateToXiaomi();
    }

    @Then("I should see Xiaomi homepage")
    public void i_should_see_xiaomi_homepage() {
        Assert.assertTrue(xiaomiHomePage.isHomePageLoaded());
        Assert.assertTrue(xiaomiHomePage.isSearchBoxDisplayed());
    }

    @When("I search on Xiaomi for {string}")
    public void i_search_on_xiaomi_for(String productName) {
        xiaomiHomePage.searchForProduct(productName);
    }

    @When("I click on smartphones category")
    public void i_click_on_smartphones_category() {
        xiaomiHomePage.clickSmartphonesCategory();
    }

    @When("I click on laptops category")
    public void i_click_on_laptops_category() {
        xiaomiHomePage.clickLaptopsCategory();
    }

    @When("I click on first product")
    public void i_click_on_first_product() {
        xiaomiHomePage.clickFirstProduct();
        xiaomiProductPage = new XiaomiProductPage(DriverManager.getDriver());
    }

    @Then("I should see product details")
    public void i_should_see_product_details() {
        Assert.assertTrue(xiaomiProductPage.isProductDetailsDisplayed());
        Assert.assertTrue(xiaomiProductPage.isProductImageDisplayed());
    }

    @Then("I should see add to cart button")
    public void i_should_see_add_to_cart_button() {
        Assert.assertTrue(xiaomiProductPage.isAddToCartButtonDisplayed());
    }

    @When("I add product to cart")
    public void i_add_product_to_cart() {
        xiaomiProductPage.clickAddToCart();
    }
}