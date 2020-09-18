package ASOS.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenHomePage extends BasePage {

    @FindBy(xpath = "//input[@id='chrome-search']")
    private WebElement searchInput;

    @FindBy(xpath = "//li//a[contains(text(), 'WOMEN')]")
    private WebElement womenMenuButton;

    @FindBy(xpath = "//nav[@class='_3EAPxMS']//button[@data-index='5']")
    private WebElement faceAndBodyCatalogMenu;

    @FindBy(xpath = "//nav[@class='_3EAPxMS']//ul[@aria-labelledby='shop-by-brand-a11']//li//a[contains(text(), 'The Ordinary')]")
    private WebElement theOrdinaryMenuTab;

    @FindBy(xpath = "//h2[contains(text(), 'NOTHING')]")
    private WebElement errorMessageForNonExistingSearch;

    @FindBy(xpath = "//button[@aria-label='My Account']")
    private WebElement myAccountDropdown;

    @FindBy(xpath = "//div[@id='myaccount-dropdown']//li//a[contains(text(), 'My Account')]")
    private WebElement myAccountButton;

    @FindBy(xpath = "//li//button[@data-testid = 'country-selector-btn']")
    private WebElement countrySelectorButton;

    @FindBy(xpath = "//form//select[@id='country']")
    private WebElement listOfCountries;

    @FindBy(xpath = "//select[@id='country']//option[contains(text(), 'Germany')]")
    private WebElement germanyListOption;

    @FindBy(xpath = "//button[contains(text(), 'Einstellungen')]")
    private WebElement applyChangesButton;

    @FindBy(xpath = "//span[contains(text(), 'Einkaufen aus')]")
    private WebElement settingsInGermanButton;

    public WomenHomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(String keyword) {
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public void openWomenMenu() {
        womenMenuButton.click();
    }

    public void clickOnFaceAndBodyCatalogMenu() {
        faceAndBodyCatalogMenu.click();
    }

    public void clickOnTheOrdinaryMenuTab() {
        theOrdinaryMenuTab.click();
    }

    public String getTextOfErrorMessageForNonExistingSearchInput() {
        return errorMessageForNonExistingSearch.getText();
    }

    public void clickOnMyAccountDropdown() {
        myAccountDropdown.click();
    }

    public void goToMyAccountPage() {
        myAccountButton.click();
    }

    public void clickOnCountrySelectorButton() {
        countrySelectorButton.click();
    }

    public void openListOfCountries() {
        listOfCountries.click();
    }

    public WebElement germanyOption() {
        return germanyListOption;
    }

    public void clickToChooseGermany() {
        germanyListOption.click();
    }

    public void clickOnApplyChanges() {
        applyChangesButton.click();
    }

    public WebElement settingsInGermanButton() {
        return settingsInGermanButton;
    }

    public String getTextOfSettingsInGerman() {
        return settingsInGermanButton.getText();
    }
}
