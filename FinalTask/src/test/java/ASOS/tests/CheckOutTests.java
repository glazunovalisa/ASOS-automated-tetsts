package ASOS.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CheckOutTests extends BaseTest {

    private String SEARCH_KEYWORD = "Dr Martens White";
    private String NEW_ASOS = "NEW TO ASOS?";

    @Test
    public void checkIfCheckOutWithoutSigningInIsPossible() {
        getWomenHomePage().searchByKeyword(SEARCH_KEYWORD);
        getBasePage().implicitWait(30);
        getBasePage().clickOnElement(getSearchResultsPage().clickOnOpenProductDescription());
        getBasePage().waitForPageLoadComplete(50);
        getBasePage().scrollTillElementIsVisible(getShoesPage().getChooseSizeDropList());
        getShoesPage().clickOnDropListOfSizes();
        getShoesPage().clickOnSizeDropListPosition();
        getShoesPage().clickOnAddToBagButton();
        getShoesPage().clickOnCartPopup();
        getShoesPage().clickOnCheckOutButton();
        getBasePage().waitForPageLoadComplete(30);
        assertEquals(getCartPage().checkIfJoinAsosButtonExists(), NEW_ASOS);
    }
}
