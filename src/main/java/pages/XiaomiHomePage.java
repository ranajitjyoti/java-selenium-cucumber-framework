package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class XiaomiHomePage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//a[contains(@href, '/smartphones')]")
    private WebElement smartphonesCategory;

    @FindBy(xpath = "//a[contains(@href, '/laptops')]")
    private WebElement laptopsCategory;

    @FindBy(xpath = "//div[@class='product-item']")
    private WebElement firstProduct;

    @FindBy(xpath = "//span[contains(text(), 'Mi Store')]")
    private WebElement miStoreLogo;

    public XiaomiHomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToXiaomi() {
        driver.get("https://www.mi.com/in/");
    }

    public void searchForProduct(String productName) {
        searchBox.clear();
        searchBox.sendKeys(productName);
        searchButton.click();
    }

    public void clickSmartphonesCategory() {
        smartphonesCategory.click();
    }

    public void clickLaptopsCategory() {
        laptopsCategory.click();
    }

    public void clickFirstProduct() {
        firstProduct.click();
    }

    public boolean isHomePageLoaded() {
        return miStoreLogo.isDisplayed();
    }

    public boolean isSearchBoxDisplayed() {
        return searchBox.isDisplayed();
    }
}