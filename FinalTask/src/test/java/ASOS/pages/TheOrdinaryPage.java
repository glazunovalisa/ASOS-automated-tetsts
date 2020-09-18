package ASOS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TheOrdinaryPage extends BasePage {

    @FindBy(xpath = "//button//div[contains(text(), 'Makeup')]")
    private WebElement makeupCategoryDropDown;

    @FindBy(xpath = "//li//div//label[contains(text(), 'Eyes')]")
    private WebElement eyesFilterButton;

    @FindBy(xpath = "//div[@data-auto-id='productList']//section[@data-auto-id='1']")
    private List<WebElement> productCountAfterApplyingFilter;

    public TheOrdinaryPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnMakeupDropDown() {
        makeupCategoryDropDown.click();
    }

    public WebElement eyesFilterButton() {
        return eyesFilterButton;
    }

    public int getProductCountAfterApplyingFilter() {
        return productCountAfterApplyingFilter().size();
    }

    private List<WebElement> productCountAfterApplyingFilter() {
        return productCountAfterApplyingFilter;
    }
}
