package ASOS.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveFromCartTests extends BaseTest {


    private String SEARCH_KEYWORD = "Dr Martens white";
    private String EMPTY_BAG = "Your bag is empty";

    @Test
    public void checkRemovingFromCart() {
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
        getBasePage().waitForPageLoadComplete(30);
        getCartPage().removeFromCart();
        getBasePage().waitVisibilityOfElement(30, getCartPage().emptyBagMessage());
        Assert.assertEquals(getCartPage().checkIfBagIsEmpty(), EMPTY_BAG);
    }
}
