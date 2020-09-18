package ASOS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoesPage extends BasePage {

    @FindBy(xpath = "//a[@class='add-button']")
    private WebElement addToBagButton;

    @FindBy(xpath = "//div[@class='size-section']//div[@class='colour-size-select']")
    private WebElement chooseSizeDropList;

    @FindBy(xpath = "//select[@data-id='sizeSelect']//option[3]")
    private WebElement sizeDropListPosition;

    @FindBy(xpath = "//span[@class='_1z5n7CN']")
    private WebElement openCartButton;

    @FindBy(xpath = "//div[@class='_1uskYPE']//a[@data-test-id='checkout-link']")
    private WebElement checkOutButton;

    @FindBy(xpath = "//span[contains(text(), 'Please select')]")
    private WebElement errorAddingToCartWithoutSizeMessage;

    @FindBy(xpath = "//div//span[contains(text(), 'View Bag')]")
    private WebElement viewBagButton;


    public ShoesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddToBagButton() {
        addToBagButton.click();
    }

    public WebElement getChooseSizeDropList() {
        return chooseSizeDropList;
    }

    public void clickOnDropListOfSizes() {
        chooseSizeDropList.click();
    }

    public void clickOnSizeDropListPosition() {
        sizeDropListPosition.click();
    }

    public void clickOnCartPopup() {
        openCartButton.click();
    }

    public void clickOnCheckOutButton() {
        checkOutButton.click();
    }

    public String getTextOfErrorMessageAddingToCart() {
        return errorAddingToCartWithoutSizeMessage.getText();
    }

    public void clickOnViewBagButton() {
        viewBagButton.click();
    }
}