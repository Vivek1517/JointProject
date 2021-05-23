package Next.NextPageSteps;

import Next.Pages.HomePage;
import Next.Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Given("^I am on the homepage$")
    public void iAmOnHomePage() {
        Assert.assertTrue(homePage.isUserOnHomePage());
    }

    @When("^I select myAccount link$")
    public void myAccountLink() {
        Utils.waitForPageLoad(3);
        homePage.gotoMyAccountPage();
    }
}
