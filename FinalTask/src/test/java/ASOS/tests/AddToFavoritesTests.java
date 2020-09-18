package ASOS.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToFavoritesTests extends BaseTest {

    private String SEARCH_KEYWORD = "Dr Martens White";
    private String PRODUCT_IN_FAVORITES = "Dr Martens 1460 8 eye boots in white";


    @Test
    public void checkAddingProductToFavorites() {
        getWomenHomePage().searchByKeyword(SEARCH_KEYWORD);
        getBasePage().waitForPageLoadComplete(50);
        getBasePage().clickOnElement(getSearchResultsPage().addToFavoritesButton());
        getSearchResultsPage().openListOfFavorites();
        getBasePage().waitForPageLoadComplete(50);
        assertEquals(getFavoritesPage().getTextOfProductInFavorites(),PRODUCT_IN_FAVORITES);
    }
}
