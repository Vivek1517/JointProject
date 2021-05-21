package Next.NextPageSteps;

import Next.Pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {
    @Before
    public void startBrowser() {
        openBrowser(browserName,url);
    }

    @After
    public void stopBrowser() {
        closeBrowser();
    }
}
