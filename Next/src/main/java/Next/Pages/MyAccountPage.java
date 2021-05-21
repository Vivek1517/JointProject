package Next.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement myAccountLinks;

    public MyAccountPage() {
        PageFactory.initElements(driver,this);
    }

    public boolean isUserOnMyAccountPage() {
        return myAccountLinks.isDisplayed();
    }
}

