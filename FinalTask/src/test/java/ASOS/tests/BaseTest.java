package ASOS.tests;

import ASOS.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;
    private static final String ASOS_URL = "https://www.asos.com/";


    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ASOS_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public BasePage getBasePage() {
        return new BasePage(getDriver());
    }

    public WomenHomePage getWomenHomePage() {
        return new WomenHomePage(getDriver());
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(getDriver());
    }

    public CartPage getCartPage() {
        return new CartPage(getDriver());
    }

    public ShoesPage getShoesPage() {
        return new ShoesPage(getDriver());
    }

    public FavoritesPage getFavoritesPage() {
        return new FavoritesPage(getDriver());
    }

    public SignUpPage getSignUpPage() {
        return new SignUpPage(getDriver());
    }

    public TheOrdinaryPage getTheOrdinaryPage() {
        return new TheOrdinaryPage(getDriver());
    }

}