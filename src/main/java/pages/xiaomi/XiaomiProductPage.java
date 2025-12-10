package pages.xiaomi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class XiaomiProductPage extends BasePage {

    @FindBy(xpath = "//h1[@class='product-title']")
    private WebElement productTitle;

    @FindBy(xpath = "//span[@class='price']")
    private WebElement productPrice;

    @FindBy(xpath = "//button[contains(text(), 'Add to Cart') or contains(text(), 'Buy Now')]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='product-specs']")
    private WebElement productSpecs;

    @FindBy(xpath = "//img[@class='product-image']")
    private WebElement productImage;

    public XiaomiProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductTitle() {
        return productTitle.getText();
    }

    public String getProductPrice() {
        return productPrice.getText();
    }

    public void clickAddToCart() {
        addToCartButton.click();
    }

    public boolean isProductDetailsDisplayed() {
        return productTitle.isDisplayed() && productPrice.isDisplayed();
    }

    public boolean isProductImageDisplayed() {
        return productImage.isDisplayed();
    }

    public boolean isAddToCartButtonDisplayed() {
        return addToCartButton.isDisplayed();
    }
}