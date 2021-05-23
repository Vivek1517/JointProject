package Pages;

import Utilities.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage extends BasePage {
    public CommonPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css=".SearchBox")
    WebElement search;
    @FindBy(css=".SearchButton")
    WebElement clickOnSearch;
    @FindBy(css="#header-logo")
    WebElement logo;
    @FindBy(className = "spell-correct")
    WebElement productCategory;

    public void enterProduct(String product){
        Util.enterTex(search,product);
    }
    public void clickonSearch(){
        Util.click(clickOnSearch);
    }
    public boolean isDisplayed(){
        return Util.isDisplayed(logo);
    }
    public boolean productDisplayed(){
        return Util.isDisplayed(productCategory);
    }
}
