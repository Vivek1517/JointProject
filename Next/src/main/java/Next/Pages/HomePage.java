package Next.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    @FindBy(css = "#header-logo")
    WebElement siteLogo;

    @FindBy(linkText = "My Account")
    WebElement myAccountLink;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isUserOnHomePage() {
        //return Utils.isElementPresent(siteLogo);
        return siteLogo.isDisplayed();
    }

    public void gotoMyAccountPage() {
        myAccountLink.click();
    }
}