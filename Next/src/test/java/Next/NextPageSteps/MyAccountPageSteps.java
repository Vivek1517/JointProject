package Next.NextPageSteps;

import Next.Pages.MyAccountPage;
import Next.Utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MyAccountPageSteps {
    MyAccountPage myAccountPage = new MyAccountPage();

    @Then("^I Should be loggedIn successfully$")
    public void verifyLogin() {
        Assert.assertEquals("Account Summary | My Account | Next Directory Online", Utils.getPageTitle());
    }

    @And("I should go to my account page")
    public void iShouldBeOnMyAccountPage() {
        Assert.assertTrue(myAccountPage.isUserOnMyAccountPage());
    }

}
