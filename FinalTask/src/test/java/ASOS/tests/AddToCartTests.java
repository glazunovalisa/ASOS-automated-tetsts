package ASOS.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTests extends BaseTest {

    private String SEARCH_KEYWORD = "Dr Martens white";
    private String ERROR_MESSAGE = "Please select from the available colour and size options";
    private String NEW_PRICE = "£745.00";

    @Test
    public void checkIfAddingToCartWithoutSizeIndicatingIsPossible() {
        getWomenHomePage().searchByKeyword(SEARCH_KEYWORD);
        getBasePage().implicitWait(30);
        getBasePage().clickOnElement(getSearchResultsPage().clickOnOpenProductDescription());
        getBasePage().waitForPageLoadComplete(50);
        getBasePage().scrollTillElementIsVisible(getShoesPage().getChooseSizeDropList());
        getShoesPage().clickOnAddToBagButton();
        assertEquals(getShoesPage().getTextOfErrorMessageAddingToCart(), ERROR_MESSAGE);
    }

    @Test(priority = 2)
    public void checkIfPriceIncrementsWithAddingProducts() {
        getWomenHomePage().searchByKeyword(SEARCH_KEYWORD);
        getBasePage().implicitWait(30);
        getBasePage().clickOnElement(getSearchResultsPage().clickOnOpenProductDescription());
        getBasePage().waitForPageLoadComplete(50);
        getBasePage().scrollTillElementIsVisible(getShoesPage().getChooseSizeDropList());
        getShoesPage().clickOnDropListOfSizes();
        getShoesPage().clickOnSizeDropListPosition();
        getShoesPage().clickOnAddToBagButton();
        getShoesPage().clickOnCartPopup();
        getShoesPage().clickOnViewBagButton();
        getBasePage().waitForPageLoadComplete(50);
        getCartPage().clickOnQuantityArrowButton();
        getCartPage().clickOnQuantityDropdownMenuPosition();
        getCartPage().clickOnUpdatePriceButton();
        assertEquals(getCartPage().getNewPrice(), NEW_PRICE);
    }
}