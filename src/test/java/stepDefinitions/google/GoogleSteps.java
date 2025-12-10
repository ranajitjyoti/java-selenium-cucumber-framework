package stepDefinitions.google;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.google.GoogleHomePage;
import utils.DriverManager;

public class GoogleSteps {
    private GoogleHomePage googleHomePage;

    @Given("I open Google homepage")
    public void i_open_google_homepage() {
        DriverManager.setDriver("chrome");
        googleHomePage = new GoogleHomePage(DriverManager.getDriver());
        googleHomePage.navigateToGoogle();
    }

    @Then("I should see Google search page")
    public void i_should_see_google_search_page() {
        Assert.assertTrue(googleHomePage.getPageTitle().contains("Google"));
        Assert.assertTrue(googleHomePage.isSearchBoxDisplayed());
    }

    @When("I search on Google for {string}")
    public void i_search_on_google_for(String searchTerm) {
        googleHomePage.enterSearchTerm(searchTerm);
        googleHomePage.clickSearchButton();
    }

    @Then("I should see search results")
    public void i_should_see_search_results() {
        Assert.assertFalse(googleHomePage.getPageTitle().equals("Google"));
    }
}