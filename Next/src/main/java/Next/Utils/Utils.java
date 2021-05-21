package Next.Utils;

import Next.Pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
    public static void waitForPageLoad(long seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public static String getPageTitle() {
        return driver.getTitle();
    }

    public static boolean isElementPresent(WebElement element){
        return element.isDisplayed();
    }

    public static void selectFromListWithValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }
}
