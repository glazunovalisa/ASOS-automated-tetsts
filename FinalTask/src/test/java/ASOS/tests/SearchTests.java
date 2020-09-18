package ASOS.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {

    private String EXPECTED_SEARCH_QUERY = "the-ordinary";
    private String NONEXISTING_KEYWORD = "lorem ipsum";
    private String ERROR_MESSAGE = "NOTHING MATCHES YOUR SEARCH";


    @Test(priority = 1)
    public void checkSearchThroughDropMenu() {
        getWomenHomePage().openWomenMenu();
        getBasePage().waitForPageLoadComplete(30);
        getWomenHomePage().clickOnFaceAndBodyCatalogMenu();
        getWomenHomePage().clickOnTheOrdinaryMenuTab();
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));
    }

    @Test(priority = 2)
    public void checkSearchWithNonExistingSearchInput() {
        getWomenHomePage().searchByKeyword(NONEXISTING_KEYWORD);
        getBasePage().waitForPageLoadComplete(30);
        assertEquals(getWomenHomePage().getTextOfErrorMessageForNonExistingSearchInput(), ERROR_MESSAGE);
    }

    @Test(priority = 3)
    public void checkApplyingFilters() {
        getWomenHomePage().openWomenMenu();
        getBasePage().waitForPageLoadComplete(30);
        getWomenHomePage().clickOnFaceAndBodyCatalogMenu();
        getWomenHomePage().clickOnTheOrdinaryMenuTab();
        getBasePage().implicitWait(30);
        getTheOrdinaryPage().clickOnMakeupDropDown();
        getBasePage().implicitWait(30);
        getBasePage().clickOnElement(getTheOrdinaryPage().eyesFilterButton());
        assertEquals(getTheOrdinaryPage().getProductCountAfterApplyingFilter(), 1);


    }
}