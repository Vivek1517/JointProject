package Next.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{
    @FindBy(xpath = "//div[contains(text(),'dress')]")
    WebElement dressDisplayed;

    public SearchPage(){
        PageFactory.initElements(driver,this);
    }

    public boolean isSearchedItemShownOnPage(){
        return dressDisplayed.isDisplayed();
    }
}
