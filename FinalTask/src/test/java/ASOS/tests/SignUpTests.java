package ASOS.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTests extends BaseTest {

    private String INVALID_EMAIL = "glazunovalisaGmail.com";
    private String ERROR_MESSAGE = "Email fail! Please type in your correct email address";

    @Test(priority = 1)
    public void signingUpWithInvalidCredentials() {
        getWomenHomePage().clickOnMyAccountDropdown();
        getWomenHomePage().goToMyAccountPage();
        getSignUpPage().goToNewToAsosPage();
        getBasePage().waitForPageLoadComplete(30);
        getBasePage().scrollTillElementIsVisible(getSignUpPage().emailInputField());
        getSignUpPage().typeInEmail(INVALID_EMAIL);
        getBasePage().implicitWait(30);
        Assert.assertEquals(getSignUpPage().getErrorMessageText(), ERROR_MESSAGE);
    }
}
