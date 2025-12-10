package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage extends BasePage {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@value='Google Search']")
    private WebElement googleSearchButton;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToGoogle() {
        driver.get("https://www.google.com");
    }

    public void enterSearchTerm(String searchTerm) {
        searchBox.clear();
        searchBox.sendKeys(searchTerm);
    }

    public void clickSearchButton() {
        searchBox.submit();
    }

    public boolean isSearchBoxDisplayed() {
        return searchBox.isDisplayed();
    }
}