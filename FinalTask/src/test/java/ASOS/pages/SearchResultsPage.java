package ASOS.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//article[@id='product-14782498']//button[@aria-label='Save for later']")
    private WebElement addToFavoritesButton;

    @FindBy(xpath = "//span[@type='heartUnfilled']")
    private WebElement openFavoritesButton;

    @FindBy(xpath = "//article[@id='product-14782498']//a[@class='_3TqU78D']")
    private WebElement openProductDescription;


    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement addToFavoritesButton() {
        return addToFavoritesButton;
    }

    public void openListOfFavorites() {
        openFavoritesButton.click();
    }

    public WebElement clickOnOpenProductDescription() {
        return openProductDescription;
    }
}
