package ASOS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FavoritesPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(), 'Dr Martens')]")
    private WebElement addedProductInFavorites;

    public FavoritesPage(WebDriver driver) {
        super(driver);
    }

    public String getTextOfProductInFavorites() {
        return addedProductInFavorites.getText();
    }
}
