package ASOS.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeCountryTests extends BaseTest {

    private String GERMAN_TRANSLATION = "EINKAUFEN AUS";

    @Test
    public void checkIfCountryChangeIsPossible() {
        getWomenHomePage().clickOnCountrySelectorButton();
        getBasePage().implicitWait(50);
        getWomenHomePage().openListOfCountries();
        getBasePage().scrollTillElementIsVisible(getWomenHomePage().germanyOption());
        getWomenHomePage().clickToChooseGermany();
        getWomenHomePage().clickOnApplyChanges();
        getBasePage().waitForPageLoadComplete(30);
        getBasePage().scrollTillElementIsVisible(getWomenHomePage().settingsInGermanButton());
        Assert.assertEquals(getWomenHomePage().getTextOfSettingsInGerman(), GERMAN_TRANSLATION);
    }
}
