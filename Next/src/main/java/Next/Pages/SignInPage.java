package Next.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    @FindBy(css = ".SignInContainer ")
    WebElement createAccountForm;

    //@FindBy(xpath = "//body/div[@id='mainContent']/div[@id='pri']/div[1]/div[1]")
    @FindBy(css = ".SignInContainer")
    WebElement signInPanel;

    @FindBy(css = "#EmailOrAccountNumber")
    WebElement SignInEmailField;

    @FindBy(css = "#Password")
    WebElement passwordField;

    @FindBy(css = "#SignInNow")
    WebElement loginButton;

    @FindBy(xpath = "//span[contains(text(),'Sorry, we have been unable to sign you in.')]")
    WebElement validationMessagesBlock;

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }


    public boolean isUserOnsignInPage() {
        return createAccountForm.isDisplayed();
    }

    public boolean isSignInPanelShown() {
        return signInPanel.isDisplayed();
    }

    public void enterCredentials(String email, String password) {
        SignInEmailField.sendKeys(email);
        passwordField.sendKeys(password);
    }

    public void selectSignIn() {
        loginButton.click();
    }

    public String getErrorMessage() {
        return validationMessagesBlock.getText();

    }
}
