package ASOS.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {


    @FindBy(xpath = "//h2//a[contains(text(), 'New')]")
    private WebElement newToAsosPage;

    @FindBy(xpath = "//input[@alt='Email']")
    private WebElement emailInputField;

    @FindBy(xpath = "//span[contains(text(), 'Email fail!')]")
    private WebElement errorMessage;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void goToNewToAsosPage() {
        newToAsosPage.click();
    }

    public WebElement emailInputField() {
        return emailInputField;
    }

    public void typeInEmail(String email) {
        emailInputField.sendKeys(email, Keys.ENTER);
    }

    public String getErrorMessageText() {
        return errorMessage.getText();
    }
}
