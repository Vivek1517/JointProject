package Next.NextPageSteps;

import Next.Pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SignInPageSteps {

    SignInPage signInPage = new SignInPage();


    @Then("^I should be on the SignIn Page$")
    public void iShouldSeeSignInPanel() {
        Assert.assertTrue (signInPage.isSignInPanelShown());
    }

    @When("^I provide email as (.*)and password as (.*)$")
    public void enterCredentials(String email, String password) {
        signInPage.enterCredentials(email,password);
    }

    @And("^I select signIn button$")
    public void clickSignIn() {
        signInPage.selectSignIn();
    }
}


