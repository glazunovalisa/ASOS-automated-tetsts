package ASOS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//a[@class='qa-join-asos']")
    private WebElement joinAsosButton;

    @FindBy(xpath = "//span[@class='bag-item-quantity-holder bag-item-select2-holder']//span[@class='select2-selection__arrow']")
    private WebElement quantityArrowButton;

    @FindBy(xpath = "//ul[@class='select2-results__options']//li[contains(text(), '5')]")
    private WebElement quantityDropdownMenuPosition;

    @FindBy(xpath = "//h3//span[contains(text(), '745')]")
    private WebElement newPrice;

    @FindBy(xpath = "//button[contains(text(), 'UPDATE')]")
    private WebElement updatePriceButton;

    @FindBy(xpath = "//button[@class='bag-item-remove']")
    private WebElement removeFromCartButton;

    @FindBy(xpath = "//div//h2[contains(text(), 'empty')]")
    private WebElement emptyBagMessage;


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String checkIfJoinAsosButtonExists() {
        return joinAsosButton.getText();
    }

    public void clickOnQuantityArrowButton() {
        quantityArrowButton.click();
    }

    public void clickOnQuantityDropdownMenuPosition() {
        quantityDropdownMenuPosition.click();
    }

    public void clickOnUpdatePriceButton() {
        updatePriceButton.click();
    }

    public String getNewPrice() {
        return newPrice.getText();
    }

    public void removeFromCart() {
        removeFromCartButton.click();
    }

    public WebElement emptyBagMessage() {
        return emptyBagMessage;
    }

    public String checkIfBagIsEmpty() {
        return emptyBagMessage.getText();
    }
}